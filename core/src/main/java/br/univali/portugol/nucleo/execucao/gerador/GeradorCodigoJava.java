package br.univali.portugol.nucleo.execucao.gerador;

import br.univali.portugol.nucleo.StringUtils;
import br.univali.portugol.nucleo.execucao.gerador.helpers.Utils;
import br.univali.portugol.nucleo.programa.Programa;
import br.univali.portugol.nucleo.asa.*;
import br.univali.portugol.nucleo.bibliotecas.base.ErroCarregamentoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.GerenciadorBibliotecas;
import br.univali.portugol.nucleo.execucao.gerador.helpers.*;
import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Elieser
 */
public class GeradorCodigoJava
{
    private final GeradorChamadaMetodo geradorChamadaMetodo = new GeradorChamadaMetodo();
    private final GeradorSwitchCase geradorSwitchCase = new GeradorSwitchCase();
    private final GeradorDeclaracaoMetodo geradorDeclaracaoMetodo = new GeradorDeclaracaoMetodo();
    private final GeradorOperacao geradorOperacao = new GeradorOperacao();
    private final GeradorAtributo geradorAtributo = new GeradorAtributo();
    private final GeradorDeclaracaoVariavel geradorDeclaracaoVariavel = new GeradorDeclaracaoVariavel();
    private final GeradorDeclaracaoRegistro geradorDeclaracaoRegistro = new GeradorDeclaracaoRegistro();
    private final GeradorAtribuicao geradorAtribuicao = new GeradorAtribuicao();
    private final GeradorLoops geradorLoops = new GeradorLoops();
    private final long seed;
    private boolean processandoVariaveisGlobais = false; // não inicializa as variáveis quando está processando as variáveis globais
    
    private boolean inicializandoNoPara = false;
    private int quantidadeInicializacoesPara = 0;
    private int indiceAtualInicializacaoPara = -1;
    private int numeroFlag = 1;
    private String nomeClasseJavaInstancia;

    public static class Opcoes
    {
        public final boolean gerandoCodigoParaInterrupcaoDeThread;
        public final boolean gerandoCodigoParaPontosDeParada;
        public final boolean gerandoCodigoParaInspecaoDeSimbolos;

        public Opcoes(boolean geraCodigoParaInterrupcaoDeThread, boolean geraCodigoParaPontosDeParada, boolean geraCodigoParaInspecaoDeSimbolos)
        {
            this.gerandoCodigoParaInterrupcaoDeThread = geraCodigoParaInterrupcaoDeThread;
            this.gerandoCodigoParaPontosDeParada = geraCodigoParaPontosDeParada;
            this.gerandoCodigoParaInspecaoDeSimbolos = geraCodigoParaInspecaoDeSimbolos;
        }

        public static Opcoes paraCompilacao()
        {
            return new Opcoes(true, true, true);
        }
        
        public static Opcoes paraTeste()
        {
            return new Opcoes(false, false, false);
        }
    }
    
    public GeradorCodigoJava(long seed)
    {
        this.seed = seed;
    }

    public GeradorCodigoJava()
    {
        this.seed = PreCompilador.getSeedGeracaoNomesValidos();
    }
    
    public void gera(ASAPrograma asa, PrintWriter saida, String nomeClasseJava) throws ExcecaoVisitaASA, IOException
    {
        gera(asa, saida, nomeClasseJava, GeradorCodigoJava.Opcoes.paraTeste()); // não gera código para interrupção de thread, pontos de parada e inspeção de símbolos
    }

    public void gera(ASAPrograma asa, PrintWriter saida, String nomeClasseJava, 
            Opcoes opcoes) throws ExcecaoVisitaASA, IOException
    {

        PreCompilador preCompilador = new PreCompilador(asa);
        asa.aceitar(preCompilador);

        VisitorGeracaoCodigo gerador = new VisitorGeracaoCodigo(asa, saida, opcoes);

        nomeClasseJavaInstancia = nomeClasseJava;
        int totalVariaveis = asa.getTotalVariaveisDeclaradas();
        int totalVetores = asa.getTotalVetoresDeclarados();
        int totalMatrizes = asa.getTotalMatrizesDeclaradas();
        
        gerador.geraPackage("programas")
               .geraImportacaoPara(ErroExecucao.class)
               .geraImportacaoPara(Programa.class.getPackage())
               .geraImportacaoBibliotecasIncluidas()
               .geraNomeClasse(nomeClasseJava)
               .geraChaveAberturaClasse()
               .geraAtributosParaBibliotecasIncluidas()
               .geraAtributosParaVariaveisGlobais()
               .geraAtributosParaVariaveisPassadasPorReferencia(preCompilador.getVariaveisPassadasPorReferencia())
               .geraConstrutor(nomeClasseJava, totalVariaveis, totalVetores, totalMatrizes)
               .geraInicializacaoVariaveisGlobais()
                .geraDeclaracaoRegistros(asa.getListaDeclaracoesGlobais())
               .geraMetodos(preCompilador.getFuncoesQuerForamInvocadas())
               .geraChaveFechamentoClasse();

    }

    private class VisitorGeracaoCodigo extends VisitanteASABasico
    {
        private final PrintWriter saida;
        private final ASAPrograma asa;
        private int nivelEscopo = 1;
        private final Opcoes opcoes;

        public VisitorGeracaoCodigo(ASAPrograma asa, PrintWriter saida, Opcoes opcoes)
        {
            this.saida = saida;
            this.asa = asa;
            this.opcoes = opcoes;
        }

        private void visitarBlocos(List<NoBloco> blocos) throws ExcecaoVisitaASA
        {
            nivelEscopo++;
            
            Utils.visitarBlocos(blocos, saida, this, nivelEscopo, opcoes, seed);
            
            nivelEscopo--;
        }

        private void geraVerificacaoThreadInterrompida()
        {
            if (opcoes.gerandoCodigoParaInterrupcaoDeThread)
            {
                nivelEscopo++;
                Utils.geraVerificacaoThreadInterrompida(saida, nivelEscopo);
                nivelEscopo--;
            }
        }

        private List<NoDeclaracaoInicializavel> getVariaveisGlobaisDeclaradas(ASAPrograma asa, boolean excluiConstantes)
        {
            List<NoDeclaracao> declaracoesGlobais = asa.getListaDeclaracoesGlobais();
            List<NoDeclaracaoInicializavel> variaveisGlobais = new ArrayList<>();
            for (NoDeclaracao global : declaracoesGlobais)
            {
                if (global instanceof NoDeclaracaoInicializavel)
                {
                    NoDeclaracaoInicializavel variavel = (NoDeclaracaoInicializavel)global;
                    if (!(excluiConstantes && variavel.constante()))
                    {
                        variaveisGlobais.add(variavel);
                    }
                }
            }
            return variaveisGlobais;
        }
        
        private void inicializaVariaveisGlobaisNaoPassadasPorReferencia(List<NoDeclaracaoInicializavel> variaveisGlobais) throws ExcecaoVisitaASA
        {
            for (NoDeclaracaoInicializavel variavel : variaveisGlobais)
            {
                if (variavel instanceof NoDeclaracaoVariavel)
                {
                    if (((NoDeclaracaoVariavel) variavel).ehPassadaPorReferencia())
                    {
                        continue; // variáveis globais que são passadas como referência não são declaradas como atributo no código Java
                    }
                }
                
                boolean ehVetor = variavel instanceof NoDeclaracaoVetor;
                boolean ehMatriz = variavel instanceof NoDeclaracaoMatriz;
                boolean variavelInicializada = variavel.temInicializacao();
                
                if (ehVetor || ehMatriz || variavelInicializada)
                {
                    
                    saida.append(Utils.geraIdentacao(nivelEscopo + 1));
                    saida.format("%s = ", variavel.getNome());
                    if (variavelInicializada)
                    {
                        //System.out.println("var - "+variavel.getNome()+" é inicializada com "+variavel.getTipoDado()+" inicialização: "+variavel.getInicializacao().toString());
                        variavel.getInicializacao().aceitar(this);
                    }
                    else //vetores e matrizes não inicializados precisam ser instanciados
                    {
                        if (ehVetor)
                        {
                            NoExpressao tamanho = ((NoDeclaracaoVetor)variavel).getTamanho();
                            if (tamanho != null)
                            {
                                String nomeTipo = Utils.getNomeTipoJava(variavel.getTipoDado());
                                saida.format("new %s[", nomeTipo);
                                tamanho.aceitar(this);
                                saida.append("]");
                            }
                        }
                        else // é uma matriz
                        {
                            NoExpressao linhas = ((NoDeclaracaoMatriz)variavel).getNumeroLinhas();
                            NoExpressao colunas = ((NoDeclaracaoMatriz)variavel).getNumeroColunas();
                            if (linhas != null && colunas != null)
                            {
                                String nomeTipo = Utils.getNomeTipoJava(variavel.getTipoDado());
                                saida.format("new %s[", nomeTipo);
                                linhas.aceitar(this);
                                saida.append("][");
                                colunas.aceitar(this);
                                saida.append("]");
                            }
                        }
                    }
                    saida.append(";").println();
                }
                
                if (opcoes.gerandoCodigoParaInspecaoDeSimbolos) {
                    // atualiza os valores das variáveis globais inpecionadas e inicializadas para que o valor inicial já esteja disponível no inspetor quando o programa inicia
                    if (variavelInicializada) {
                        if (ehVetor)
                            Utils.geraCodigoParaInspecao((NoDeclaracaoVetor)variavel, saida, nivelEscopo, seed);
                        else if (ehMatriz)
                            Utils.geraCodigoParaInspecao((NoDeclaracaoMatriz)variavel, saida, nivelEscopo, seed);
                        else
                            Utils.geraCodigoParaInspecao((NoDeclaracaoVariavel)variavel, saida, nivelEscopo, false);
                    }
                }
            }
        }
        
        private VisitorGeracaoCodigo geraInicializacaoVariaveisGlobais() throws ExcecaoVisitaASA
        {
            boolean excluiConstantes = true;
            List<NoDeclaracaoInicializavel> variaveisGlobais = getVariaveisGlobaisDeclaradas(asa, excluiConstantes);
            
            if (variaveisGlobais.isEmpty()) // não sobrescreve o método de inicialização se não houverem variáveis globais que não são constantes
            {
                return this;
            }
            
            saida.append(Utils.geraIdentacao(nivelEscopo))
                    .append("@Override").println();
            
            saida.append(Utils.geraIdentacao(nivelEscopo));
            saida.format("protected void inicializar() throws ErroExecucao, InterruptedException {").println();
            
            saida.append("super.inicializar();").println();
            inicializaVariaveisGlobaisNaoPassadasPorReferencia(variaveisGlobais);
            
            inicializaVariaveisGlobaisQueSaoPassadasPorReferencia();
            
            saida.append(Utils.geraIdentacao(nivelEscopo));
            saida.append("}").println();
            
            saida.println();
            
            return this;
        }

        public VisitorGeracaoCodigo geraAtributosParaVariaveisGlobais() throws ExcecaoVisitaASA
        {
            processandoVariaveisGlobais = true;
            boolean existemVariaveisGlobais = false;
            List<NoDeclaracaoInicializavel> variaveisGlobais = getVariaveisGlobaisDeclaradas(asa, false); // não exclui as constantes
            for (NoDeclaracaoInicializavel no : variaveisGlobais)
            {
                if (no instanceof NoDeclaracaoVariavel)
                {
                    if (((NoDeclaracaoVariavel)no).ehPassadaPorReferencia())
                    {
                        continue; // variáveis globais que são passadas como referência não são declaradas como atributo no código Java
                    }
                }
                boolean atributoGerado = geradorAtributo.gera(no, saida, this, nivelEscopo);
                existemVariaveisGlobais |= atributoGerado;
            }

            if (existemVariaveisGlobais)
            {
                saida.println(); // deixa uma linha em branco depois dos atributos globais
            }

            processandoVariaveisGlobais = false;
            
            saida.println();
            
            return this;
        }

        public VisitorGeracaoCodigo geraAtributosParaBibliotecasIncluidas()
        {
            List<NoInclusaoBiblioteca> libsIncluidas = asa.getListaInclusoesBibliotecas();
            for (NoInclusaoBiblioteca biblioteca : libsIncluidas)
            {
                if(biblioteca.getNome().equals("Graficos"))
                geradorAtributo.gera(biblioteca, saida, nivelEscopo);
            }
            for (NoInclusaoBiblioteca biblioteca : libsIncluidas)
            {
                if(!biblioteca.getNome().equals("Graficos"))
                geradorAtributo.gera(biblioteca, saida, nivelEscopo);
            }

            if (!libsIncluidas.isEmpty())
            {
                saida.println(); // deixa uma linha em branco depois dos atributos das bibliotecas
            }

            saida.println();
            
            return this;
        }

        public VisitorGeracaoCodigo geraPackage(String stringPackage)
        {
            saida.append("package ")
                    .append(stringPackage)
                    .append(";")
                    .println();

            saida.println();
            
            return this;
        }

        public VisitorGeracaoCodigo geraMetodos(Set<NoDeclaracaoFuncao> funcoesQueForamInvocadas) throws ExcecaoVisitaASA
        {
            List<NoDeclaracao> declaracoes = asa.getListaDeclaracoesGlobais();
            for (NoDeclaracao declaracao : declaracoes)
            {
                if (declaracao instanceof NoDeclaracaoFuncao)
                {
                    NoDeclaracaoFuncao declaracaoFuncao = (NoDeclaracaoFuncao)declaracao;
                    if (declaracaoFuncao.getNome().equals("inicio") || funcoesQueForamInvocadas.contains(declaracaoFuncao)) //só gera código para funções que foram invocadas
                    {
                        geradorDeclaracaoMetodo.gera(declaracaoFuncao, saida, this, nivelEscopo, opcoes, seed);
                    }
                }
            }
            return this;
        }

        public VisitorGeracaoCodigo geraDeclaracaoRegistros(List<NoDeclaracao> registros) throws ExcecaoVisitaASA
        {
//            List<NoDeclaracao> declaracoes = asa.getListaDeclaracoesGlobais();

            for (NoDeclaracao declaracao : registros)
            {
                if (declaracao instanceof NoDeclaracaoRegistro)
                {
                    NoDeclaracaoRegistro noDeclaracaoRegistro = (NoDeclaracaoRegistro)declaracao;

                    geradorDeclaracaoRegistro.gera(noDeclaracaoRegistro, saida, this, nivelEscopo, opcoes, seed);

                }
            }
            return this;
        }

        @Override
        public Void visitar(NoInteiro noInteiro) throws ExcecaoVisitaASA
        {
            saida.append(String.valueOf(noInteiro.getValor()));
            return null;
        }

        @Override
        public Void visitar(NoLogico noLogico) throws ExcecaoVisitaASA
        {
            String valor = noLogico.getValor() ? "true" : "false";
            saida.append(valor);
            return null;
        }

        @Override
        public Void visitar(NoCaracter noCaracter) throws ExcecaoVisitaASA
        {
            String valor = StringUtils.preservaCaracteresEspeciais(noCaracter.getValor().toString());
            valor = "'" + valor + "'";
            saida.append(valor);
            return null;
        }

        @Override
        public Void visitar(NoReal noReal) throws ExcecaoVisitaASA
        {
            String valor = String.valueOf(noReal.getValor());
            saida.append(valor);
            return null;
        }

        @Override
        public Void visitar(NoCadeia noCadeia) throws ExcecaoVisitaASA
        {
            String valor = StringUtils.preservaCaracteresEspeciais(noCadeia.getValor());
            valor = '\"' + valor + '\"';
            saida.append(valor);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoBitwiseLeftShift no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoBitwiseRightShift no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoBitwiseE no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoBitwiseXOR no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoBitwiseOu no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoSoma no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoDivisao no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoModulo no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoSubtracao no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoMultiplicacao no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaOU no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaE no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaDiferenca no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaIgualdade no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaMaior no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaMaiorIgual no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaMenor no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Void visitar(NoOperacaoLogicaMenorIgual no) throws ExcecaoVisitaASA
        {
            geradorOperacao.gera(no, saida, this);
            return null;
        }

        @Override
        public Boolean visitar(NoDeclaracaoVariavel noDeclaracao) throws ExcecaoVisitaASA
        {
            boolean podeInicializar = !processandoVariaveisGlobais;
            return geradorDeclaracaoVariavel.gera(noDeclaracao, saida, this, nivelEscopo, podeInicializar, inicializandoNoPara, indiceAtualInicializacaoPara);
        }

        @Override
        public Void visitar(NoDeclaracaoVetor no) throws ExcecaoVisitaASA
        {
            boolean podeInicializar = !processandoVariaveisGlobais;
            geradorDeclaracaoVariavel.gera(no, saida, this, nivelEscopo, podeInicializar);
            return null;
        }

        @Override
        public Void visitar(NoVetor noVetor) throws ExcecaoVisitaASA
        {
            geradorDeclaracaoVariavel.gera(noVetor, saida, this, nivelEscopo);
            return null;
        }

        @Override
        public Void visitar(NoDeclaracaoMatriz noDeclaracao) throws ExcecaoVisitaASA
        {
            boolean podeInicializar = !processandoVariaveisGlobais;
            geradorDeclaracaoVariavel.gera(noDeclaracao, saida, this, nivelEscopo, podeInicializar);
            return null;
        }

        @Override
        public Void visitar(NoMatriz noMatriz) throws ExcecaoVisitaASA
        {
            geradorDeclaracaoVariavel.gera(noMatriz, saida, this, nivelEscopo);
            return null;
        }

        @Override
        public Void visitar(NoRetorne no) throws ExcecaoVisitaASA
        {
            NoExpressao expressao = no.getExpressao();
            if (expressao != null)
            {
                saida.append("return ");
                if (no.temPai())
                {

                    if (no.getPai() instanceof NoDeclaracaoFuncao)
                    {
                        TipoDado tipoRetornoFuncao = ((NoDeclaracaoFuncao) no.getPai()).getTipoDado();
                        if (expressao.getTipoResultante() == TipoDado.REAL && tipoRetornoFuncao == TipoDado.INTEIRO)
                        {
                            saida.append("(int)");
                        }
                    }
                }
                else
                {
                    throw new IllegalStateException("retorne não tem pai!");
                }

                expressao.aceitar(this);
            }
            else
            {
                saida.append("return");
            }

            return null;
        }

        @Override
        public Void visitar(NoReferenciaVetor no) throws ExcecaoVisitaASA
        {
            saida.append(no.getNome());

            saida.append("[");
            no.getIndice().aceitar(this);
            saida.append("]");

            return null;
        }

        @Override
        public Void visitar(NoReferenciaMatriz no) throws ExcecaoVisitaASA
        {
            saida.append(no.getNome())
                    .append("[");

            no.getLinha().aceitar(this);

            saida.append("][");

            no.getColuna().aceitar(this);

            saida.append("]");

            return null;
        }

        @Override
        public Void visitar(NoReferenciaVariavel no) throws ExcecaoVisitaASA
        {
            String nome = no.getNome();
            String escopo = no.getEscopoBiblioteca();
            if (escopo != null)
            {
                escopo = Utils.getNomeBiblioteca(escopo, asa);
                saida.append(escopo).append(".");
            }
            
            NoDeclaracaoBase declaracao = no.getOrigemDaReferencia();
            boolean ehParametroPorReferencia = declaracao instanceof NoDeclaracaoParametro && (((NoDeclaracaoParametro) declaracao).getModoAcesso() == ModoAcesso.POR_REFERENCIA);
            if (ehParametroPorReferencia || no.ehPassadoPorReferencia())
            {
                String stringIndice = ehParametroPorReferencia ? no.getNome() : Utils.geraStringIndice(no);
                String nomeTipo = Utils.getNomeTipoJava(declaracao.getTipoDado()).toUpperCase();
                if(no.getOrigemDaReferencia() instanceof NoDeclaracaoParametro)
                {
                    if(((NoDeclaracaoParametro)no.getOrigemDaReferencia()).getQuantificador()==Quantificador.VETOR 
                    || ((NoDeclaracaoParametro)no.getOrigemDaReferencia()).getQuantificador()==Quantificador.MATRIZ)
                    {
                        saida.format("%s", stringIndice);
                    }
                    else
                    {
                        saida.format("REFS_%s[%s]", nomeTipo, stringIndice);
                    }
                    
                }
                else
                {
                    saida.format("REFS_%s[%s]", nomeTipo, stringIndice);
                }
                
                
            }
            else
            {
                saida.append(nome);
            }

            return null;
        }

        @Override
        public Void visitar(NoEnquanto no) throws ExcecaoVisitaASA
        {
            boolean loopInfinito = geradorLoops.loopInfinito(no);

            /**
             * Quando detecta um loop infinito (uma constante sendo usada como
             * condição) declara uma flag fora do loop para evitar "Unreacheable
             * statement" no java.
             */
            String flag = "flag_" + String.valueOf(seed+numeroFlag+nivelEscopo-1);
            numeroFlag++;
            if (loopInfinito) {
                saida.format("boolean %s =", flag);
                no.getCondicao().aceitar(this);
                saida.append(";");
            }

            saida.append("while(");

            if (!loopInfinito) {
                no.getCondicao().aceitar(this);
            } else {
                saida.append(flag); // usa flag como condição do loop para 'enganar' o java e impedir que ele detecte o 'Unreacheable Stament' error
            }

            saida.append(")").println();

            String identacao = Utils.geraIdentacao(nivelEscopo);

            saida.append(identacao).append("{").println();

            if (opcoes.gerandoCodigoParaInterrupcaoDeThread) {
                Utils.geraVerificacaoThreadInterrompida(saida, nivelEscopo);
            }
            visitarBlocos(no.getBlocos());
            saida.println();

            saida.append(identacao)
                    .append("}")
                    .println();

                return null;
        }

        @Override
        public Void visitar(NoPara no) throws ExcecaoVisitaASA
        {
            saida.append("for(");
            
            if (no.getInicializacoes() != null && !no.getInicializacoes().isEmpty())
            {
            	inicializandoNoPara = true;
            	quantidadeInicializacoesPara = no.getInicializacoes().size();
            	
                for (int i = 0; i < no.getInicializacoes().size(); i++)
                {
                	indiceAtualInicializacaoPara = i;
                	
                    NoBloco inicializacao = no.getInicializacoes().get(i);
                    // não gera código de inicialização se a seção de inicialização tiver apenas uma referência para variável (sem inicialização) - corrige o bug #110 do núcleo
                    if (inicializacao != null && !(inicializacao instanceof NoReferenciaVariavel))
                    {
                        inicializacao.aceitar(this);
                        
                        if (quantidadeInicializacoesPara > 1 && i < no.getInicializacoes().size() - 1)
                        {
                            saida.append(", ");
                        }
                    }
                }
                
                inicializandoNoPara = false;
            }            
            
            saida.append("; "); // separador depois da inicialização do for 
            
            no.getCondicao().aceitar(this);

            saida.append("; "); // separador depois da c

            if (no.getIncremento() != null)
            {
                no.getIncremento().aceitar(this);
            }

            saida.append(")").println(); // fecha o parênteses do for

            String identacao = Utils.geraIdentacao(nivelEscopo);

            saida.append(identacao).append("{").println();

            geraVerificacaoThreadInterrompida();
            
            if (opcoes.gerandoCodigoParaInspecaoDeSimbolos)
            {
                geraCodigoInspecao(no);
            }
            
            visitarBlocos(no.getBlocos());

            saida.println();

            saida.append(identacao).append("}").println();
            
            return null;
        }

        private void geraCodigoInspecao(NoPara noPara) throws ExcecaoVisitaASA
        {
            NoExpressao incremento = noPara.getIncremento();
            if (incremento != null)
            {
                NoOperacaoAtribuicao atribuicao = (NoOperacaoAtribuicao)incremento;
                if (atribuicao.getOperandoEsquerdo() instanceof NoReferenciaVariavel) 
                {
                    NoReferenciaVariavel referencia = (NoReferenciaVariavel) atribuicao.getOperandoEsquerdo();
                    NoDeclaracaoBase origem = referencia.getOrigemDaReferencia();
                    if (origem instanceof NoDeclaracaoVariavel)
                    {
                        Utils.geraCodigoParaInspecao((NoDeclaracaoVariavel)origem, saida, nivelEscopo, false);
                    }
                    else if (origem instanceof NoDeclaracaoParametro)
                    {
                        Utils.geraCodigoParaInspecao((NoDeclaracaoParametro)origem, saida, nivelEscopo);
                    }
                }
            }
        }
        
        @Override
        public Void visitar(NoSe no) throws ExcecaoVisitaASA
        {
            saida.append("if(");

            no.getCondicao().aceitar(this);

            saida.append(")").println();

            String identacao = Utils.geraIdentacao(nivelEscopo);

            saida.append(identacao).append("{").println();
            
            List<NoBloco> blocosVerdadeiros = no.getBlocosVerdadeiros();
            if (blocosVerdadeiros != null)
            {
                visitarBlocos(blocosVerdadeiros);
                saida.println();
            }

            saida.append(identacao).append("}").println();

            List<NoBloco> blocosFalsos = no.getBlocosFalsos();
            if (blocosFalsos != null)
            {
                saida.append(identacao).append("else").println();
                saida.append(identacao).append("{").println();

                visitarBlocos(blocosFalsos);

                saida.println();
                
                saida.append(identacao).append("}").println();
            }

            return null;
        }

        private boolean simularBreakCaso = false;

        @Override
        public Void visitar(NoEscolha no) throws ExcecaoVisitaASA
        {
            boolean contemCasosNaoConstantes = GeradorSwitchCase.contemCasosNaoConstantes(no);
            simularBreakCaso = contemCasosNaoConstantes;

            if (!contemCasosNaoConstantes)
            {
                geradorSwitchCase.geraSwitchCase(no, saida, this, nivelEscopo, opcoes, seed);
            }
            else
            {
                geradorSwitchCase.geraSeSenao(no, saida, this, nivelEscopo, opcoes);
            }
            simularBreakCaso = false;
            return null;
        }

        @Override
        public Void visitar(NoFacaEnquanto no) throws ExcecaoVisitaASA
        {
            String identacao = Utils.geraIdentacao(nivelEscopo);

            boolean loopInfinito = geradorLoops.loopInfinito(no);

            /**
             * Quando detecta um loop infinito (uma constante sendo usada como
             * condição) declara uma flag fora do loop para evitar "Unreacheable
             * statement" no java.
             */

            String flag = "flag_" + String.valueOf(seed+numeroFlag+nivelEscopo-1);
            numeroFlag++;
            if (loopInfinito) {
                saida.format("boolean %s =", flag);
                no.getCondicao().aceitar(this);
                saida.append(";");
            }

            saida.append("do").println();
            saida.append(identacao).append("{").println();

            if (opcoes.gerandoCodigoParaInterrupcaoDeThread) {
                Utils.geraVerificacaoThreadInterrompida(saida, nivelEscopo);
            }

            List<NoBloco> blocos = no.getBlocos();
            if (blocos != null) {
                Utils.visitarBlocos(blocos, saida, this, nivelEscopo, opcoes, seed);
                saida.println();
            }

            saida.append(identacao).append("}").println();

            saida.append(identacao).append("while(");

            if (!loopInfinito) {
                no.getCondicao().aceitar(this);
            }
            else { // usa flag como condição para o loop
                saida.append(flag);
            }

            saida.append(");").println();
            
            return null;
        }

        @Override
        public Void visitar(NoOperacaoAtribuicao no) throws ExcecaoVisitaASA
        {
            geradorAtribuicao.gera(no, saida, this, nivelEscopo);
            return null;
        }

        @Override
        public Void visitar(NoMenosUnario no) throws ExcecaoVisitaASA
        {
            saida.append("-");
            no.getExpressao().aceitar(this);

            return null;
        }

        @Override
        public Void visitar(NoNao no) throws ExcecaoVisitaASA
        {
            saida.append("!");
            no.getExpressao().aceitar(this);

            return null;
        }

        @Override
        public Void visitar(NoChamadaFuncao noChamada) throws ExcecaoVisitaASA
        {
            geradorChamadaMetodo.gera(noChamada, saida, this, asa, opcoes, nivelEscopo);
            
            return null;
        }

        @Override
        public Void visitar(NoPare noPare) throws ExcecaoVisitaASA
        {
            if (simularBreakCaso)
            {
                saida.append(GeradorSwitchCase.geraNomeVariavelBreak(nivelEscopo - 1))
                        .append(" = true");
            }
            else
            {
                saida.append("break");
            }

            return null;
        }

        @Override
        public Object visitar(NoBitwiseNao no) throws ExcecaoVisitaASA
        {
            saida.append("~");
            no.getExpressao().aceitar(this);

            return null;
        }

        @Override
        public Object visitar(NoContinue noContinue) throws ExcecaoVisitaASA
        {
            saida.append("continue");

            return null;
        }

//        @Override
//        public Object visitar(NoDeclaracaoRegistro noDeclaracaoRegistro) throws ExcecaoVisitaASA {
//            String identacao = Utils.geraIdentacao(nivelEscopo);
//            System.out.println(saida.toString());
//            saida.append(identacao)
//                    .append("public class ")
//                    .append(noDeclaracaoRegistro.getNome()).println();
//            saida.append("{").println();
//
//            List<NoListaAtributos> atributos = noDeclaracaoRegistro.getAtributos();
//
//            for(NoListaAtributos atributo : atributos){
//                for(NoAtributo s : atributo.getDeclaracoes()) {
//                    saida.append("public " + Utils.getNomeTipoJava(atributo.getTipo()) + " " + s.getNome())
//                            .append(";").println();
//                }
//            }
//            saida.append("}").println();
//
//            return null;
//        }

        @Override
        public Object visitar(NoInstanciaRegistro noInstanciaRegistro) throws ExcecaoVisitaASA {
            String identacao = Utils.geraIdentacao(nivelEscopo);
            String nome = noInstanciaRegistro.getNome();
            String tipoRegistro = noInstanciaRegistro.getTipoInstancia();

            saida.format("%s instancia = new %s();", nomeClasseJavaInstancia, nomeClasseJavaInstancia).println();

            saida.format("%s %s = ", tipoRegistro, nome);
            saida.format("instancia.new %s();", tipoRegistro).println();
            return this;
        }

//        @Override
//        public Object visitar(NoInicializacaoAtributoVariavel noInicializacaoAtributoVariavel) throws ExcecaoVisitaASA {
//            String identacao = Utils.geraIdentacao(nivelEscopo);
//
//
//            String nome = noInicializacaoAtributoVariavel.getNome();
//            String tipoRegistro = noInicializacaoAtributoVariavel.getTipoRegistro();
//            NoExpressao valor = noInicializacaoAtributoVariavel.getValor();
//
//            saida.format("%s.%s = %s;", tipoRegistro, nome, valor.aceitar(this)).println();
//
//            saida.println();
//            return this;
//        }

        /**
         * Gera o comando Java para importação de uma determinada classe.
         * @param classe classe para gerar o comando import
         * @return String contendo o comando import para a classe especificada
         */
        public VisitorGeracaoCodigo geraImportacaoPara(Class classe)
        {
            saida.append("import ")
                    .append(classe.getCanonicalName())
                    .append(";")
                    .println();

            return this;
        }

        /**
         * Gera o comando Java para importação das classes de um determinado pacote.
         * @param pacote pacote para gerar o comando import de suas classes
         * @return String contendo o comando import para as classes do pacoate especificado
         */
        public VisitorGeracaoCodigo geraImportacaoPara(Package pacote)
        {
            saida.append("import ")
                    .append(pacote.getName())
                    .append(".*;")
                    .println();

            return this;
        }

        private VisitorGeracaoCodigo geraImportacaoBibliotecasIncluidas()
        {
            for (NoInclusaoBiblioteca no : asa.getListaInclusoesBibliotecas())
            {
                String sNomePacote = "";
                try {
                    sNomePacote = GerenciadorBibliotecas.getInstance().obterMetaDadosBiblioteca(no.getNome()).getPacoteBiblioteca();
                } catch (ErroCarregamentoBiblioteca ex) {
                    Logger.getLogger(GeradorCodigoJava.class.getName()).log(Level.SEVERE, null, ex);
                }
                saida.append("import ")
                        .append(sNomePacote)
//                        .append(PACOTE_DAS_LIBS)
                        .append(no.getNome())
                        .append(";")
                        .println();

            }
            
            saida.println();

            return this;
        }
        
        private void inicializaVariaveisGlobaisQueSaoPassadasPorReferencia() throws ExcecaoVisitaASA
        {
            List<NoDeclaracao> declaracoes = asa.getListaDeclaracoesGlobais();
            for (NoDeclaracao declaracao : declaracoes)
            {
                if (declaracao instanceof NoDeclaracaoVariavel)
                {
                    NoDeclaracaoVariavel variavel = (NoDeclaracaoVariavel) declaracao;
                    if (variavel.ehPassadaPorReferencia() && variavel.temInicializacao())
                    {
                        String nomeTipo = Utils.getNomeTipoJava(variavel.getTipoDado());
                        saida.append(Utils.geraIdentacao(nivelEscopo));
                        saida.format("REFS_%s[%s] = ", nomeTipo.toUpperCase(), Utils.geraStringIndice(variavel));
                        variavel.getInicializacao().aceitar(this);
                        saida.append(";").println(); // o ponto e vírgula depois da inicialização
                    }
                }
            }
        }

        private VisitorGeracaoCodigo geraConstrutor(String nomeDaClasseJava, 
                int variaveisDeclaradas, int vetoresDeclarados, int matrizesDeclaradas) throws ExcecaoVisitaASA
        {
            String identacao = Utils.geraIdentacao(nivelEscopo);
            saida.append(identacao)
                    .append("public ")
                    .append(nomeDaClasseJava)
                    .append("() throws ErroExecucao, InterruptedException {")
                    .println();
            
            nivelEscopo++;
            //inicializaBibliotecas();
            if (opcoes.gerandoCodigoParaInspecaoDeSimbolos)
            {
                String identacaoInterna = Utils.geraIdentacao(nivelEscopo);
                saida.append(identacaoInterna)
                        .format("variaveisInspecionadas = new Object[%d];", variaveisDeclaradas)
                        .println();
                
                saida.append(identacaoInterna)
                        .format("vetoresInspecionados = new Vetor[%d];", vetoresDeclarados)
                        .println();
                
                saida.append(identacaoInterna)
                        .format("matrizesInspecionadas = new Matriz[%d];", matrizesDeclaradas)
                        .println();
            }
            
            
            nivelEscopo--;

            saida.append(identacao)
                    .append("}").println();

            saida.println();
            
            return this;
        }

        private VisitorGeracaoCodigo geraNomeClasse(String nomeClasseJava)
        {
            saida.format("public class %s extends Programa", nomeClasseJava).println();

            return this;
        }

        public VisitorGeracaoCodigo geraChaveAberturaClasse()
        {
            saida.append("{").println();

            saida.println();
            
            return this;
        }

        public VisitorGeracaoCodigo geraChaveFechamentoClasse()
        {
            saida.append("}").println();

            return this;
        }

        public VisitorGeracaoCodigo geraAtributosParaVariaveisPassadasPorReferencia(Map<TipoDado, List<NoDeclaracao>> variaveis)
        {
            if (variaveis.isEmpty())
            {
                return this;
            }

            String identacao = Utils.geraIdentacao(nivelEscopo);

            //declara os arrays (separados por tipo) que armazenam todas as referências
            //gera os arrays nessa sequência de tipos
            TipoDado tipos[] =
            {
                TipoDado.INTEIRO, TipoDado.REAL, TipoDado.LOGICO, TipoDado.CARACTER, TipoDado.CADEIA
            };

            for (TipoDado tipo : tipos)
            {
                if (variaveis.containsKey(tipo))
                {
                    String nomeTipo = Utils.getNomeTipoJava(tipo);
                    int numeroVariaveis = variaveis.get(tipo).size();
                    saida.append(identacao)
                            .format("private final %s[] REFS_%s = new %s[%d];",
                                    nomeTipo, nomeTipo.toUpperCase(), nomeTipo, numeroVariaveis)
                            .println();
                }
            }

            saida.println(); // pula uma linha antes de declarar as variáveis de cada tipo

            for (TipoDado tipo : tipos)
            {
                if (variaveis.containsKey(tipo))
                {
                    for (NoDeclaracao variavel : variaveis.get(tipo))
                    {
                        if(variavel instanceof NoDeclaracaoVariavel)
                        {
                            saida.append(identacao)
                                .append("private final int ")
                                .append(Utils.geraStringIndice((NoDeclaracaoVariavel)variavel))
                                .append(" = ")
                                .append(String.valueOf(((NoDeclaracaoVariavel)variavel).getIndiceReferencia()))
                                .append(";")
                                .println();
                        }
                        //TESTAR
                        //else if(variavel instanceof NoDeclaracaoParametro && ((NoDeclaracaoParametro)variavel).getModoAcesso()==ModoAcesso.POR_VALOR)
                        else if(variavel instanceof NoDeclaracaoParametro)
                        {
                            saida.append(identacao)
                                .append("private final int ")
                                .append(Utils.geraStringIndice((NoDeclaracaoParametro)variavel))
                                .append(" = ")
                                .append(String.valueOf(((NoDeclaracaoParametro)variavel).getIndiceReferencia()))
                                .append(";")
                                .println();
                        }                        
                    }
                    
                    saida.println(); //separa as declarações para cada tipo
                }
            }

            saida.println();
            
            return this;
        }

        
    }

}
