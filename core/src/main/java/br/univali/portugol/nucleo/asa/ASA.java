package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe serve como base para a implementação de uma Árvore Sintática Abstrata (ASA).
 * <p>
 * A ASA é uma representação do código fonte em forma de árvore, aonde cada nó da árvore equivale
 * a um comando/instrução no código fonte. A ASA é utilizada nos compiladores em geral para abstrair o 
 * código fonte e assim facilitar a geração de código intermediário e a compilação. No Portugol, a ASA
 * é utilizada para realizar a análise semântica e a execução dos programas.
 * 
 * @author Luiz Fernando Noschang
 * @version 1.0
 * @see ArvoreSintaticaAbstrataPrograma
 */
public abstract class ASA
{
    private List<NoDeclaracao> listaDeclaracoesGlobais = new ArrayList<>();

    public ASA()
    {
    }

    /**
     * Retorna uma lista com as declarações globais do programa. As variáveis globais são
     * declaradas dentro do corpo do programa e estão acessíveis a todas as funções.
     * 
     * @return     a lista de declarações globais
     * @since 1.0
     */
    public List<NoDeclaracao> getListaDeclaracoesGlobais()
    {
        return listaDeclaracoesGlobais;
    }
    
    public List<NoDeclaracao> getListaDeclaracoesGlobais(boolean ordenada) {
        if (!ordenada) {
            return getListaDeclaracoesGlobais();
        }
        
        List<NoDeclaracao> declaracoes = new ArrayList<>();

        declaracoes.addAll(getDeclaracoes(NoInclusaoBiblioteca.class));
        declaracoes.addAll(getDeclaracoes(NoDeclaracaoRegistro.class));
        declaracoes.addAll(getDeclaracoes(NoDeclaracaoInicializavel.class));
        declaracoes.addAll(getDeclaracoes(NoDeclaracaoFuncao.class));
        declaracoes.addAll(getDeclaracoes(NoInstanciaRegistro.class));


        return declaracoes;
    }
    
    private <T extends NoDeclaracao> List<? extends NoDeclaracao> getDeclaracoes(Class<T> tipo) {
        List<T> declaracoes = new ArrayList<>();
        
        for (NoDeclaracao declaracao : listaDeclaracoesGlobais) {
            if (tipo.isInstance(declaracao)) {
                declaracoes.add((T)declaracao);
            }
        }
        return declaracoes;
    }

    /**
     * Define a lista de declarações globais desta ASA.
     * 
     * @param listaDeclaracoesGlobais     a lista de declarações globais
     * @since 1.0
     */
    public void setListaDeclaracoesGlobais(List<NoDeclaracao> listaDeclaracoesGlobais)
    {
        this.listaDeclaracoesGlobais = listaDeclaracoesGlobais;
    }
    
    public void adicionaDeclaracaoGlobal(NoDeclaracao declaracao)
    {
        listaDeclaracoesGlobais.add(declaracao);
    }

    /**
     * Este método serve para dar suporte ao caminhamento da ASA utilizando o padrão visitor.
     * As classes filhas, ao implementar este método deverão chamar o método <code>visitar</code> do visitante
     * e retornar o objeto resultante da chamada. Exemplo:
     * <br>
     * <pre><code>
     *      public SubClasse extends ArvoreSintaticaAbstrata
     *      {
     *          &#64;Override
     *          public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
     *          {
     *              return visitante.visitar(this);
     *          }
     *      }
     * </code></pre>
     * 
     * @param visitante             o visitante que irá percorrer a ASA.
     * @return                      um objeto qualquer retornado pelo visitante durante o caminhamento na ASA.
     * @throws ExcecaoVisitaASA
     * @since 1.0
     */
    public abstract Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA;
}