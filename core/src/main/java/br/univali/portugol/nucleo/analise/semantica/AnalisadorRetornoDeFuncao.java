package br.univali.portugol.nucleo.analise.semantica;

import br.univali.portugol.nucleo.asa.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo Eduardo Martins
 * @author Luiz Fernando Noschang
 */
class AnalisadorRetornoDeFuncao implements VisitanteASA
{

    /**
     * Analisa se na declaração de função passada existe 100% de chance entrar
     * em algum "retorne".
     *
     * @param noDeclaracaoFuncao no a ser analisado
     * @return true se entrar em algum retorne e false se não.
     * @throws br.univali.portugol.nucleo.asa.ExcecaoVisitaASA
     */
    public boolean possuiRetornoObrigatorio(NoDeclaracaoFuncao noDeclaracaoFuncao) throws ExcecaoVisitaASA
    {
        return (Boolean) visitar(noDeclaracaoFuncao.getBlocos());
    }

    @Override
    public Object visitar(NoRetorne noRetorne) throws ExcecaoVisitaASA
    {
        if (noRetorne.getExpressao() != null)
        {
            return true;
        }

        return true;
    }

    public Object visitar(List<NoBloco> noBlocos) throws ExcecaoVisitaASA
    {
        for (NoBloco noBloco : noBlocos)
        {
            if ((Boolean) noBloco.aceitar(this))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object visitar(NoSe noSe) throws ExcecaoVisitaASA
    {
        if (noSe.getBlocosFalsos() == null)
        {
            return false;
        }
        Boolean ambosPossuemRetorno = (Boolean) visitar(noSe.getBlocosVerdadeiros()) && (Boolean) visitar(noSe.getBlocosFalsos());
        return ambosPossuemRetorno;
    }

    @Override
    public Object visitar(NoEscolha noEscolha) throws ExcecaoVisitaASA
    {
        List<NoCaso> noCasos = noEscolha.getCasos();
        int tamanhoNoCasos = noCasos.size();

        if (noCasos.get(tamanhoNoCasos - 1) == null)
        {
            return false;
        }
        if (noCasos.get(tamanhoNoCasos - 1).getExpressao() != null)
        {
            return false;
        }
        for (int indice = 0; indice < tamanhoNoCasos; indice++)
        {
            NoCaso noCaso = noCasos.get(indice);
            //Verifica se possui pare
            List<NoBloco> noBlocos = noCaso.getBlocos();
            List<NoBloco> noBlocosAntesPare = new ArrayList<>();
            for (NoBloco noBloco : noBlocos)
            {
                if (noBloco instanceof NoPare)
                {
                    break;
                }
                noBlocosAntesPare.add(noBloco);
            }
            if (!(Boolean) visitar(noBlocosAntesPare))
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object visitar(NoCaso noCaso) throws ExcecaoVisitaASA
    {
        return null;
    }

    @Override
    public Object visitar(NoEnquanto noEnquanto) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoFacaEnquanto noFacaEnquanto) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoPara noPara) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(ASAPrograma asap) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoCadeia noCadeia) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoCaracter noCaracter) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoChamadaFuncao chamadaFuncao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoContinue noContinue) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoDeclaracaoFuncao declaracaoFuncao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoDeclaracaoMatriz noDeclaracaoMatriz) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoDeclaracaoVariavel noDeclaracaoVariavel) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoDeclaracaoVetor noDeclaracaoVetor) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoInteiro noInteiro) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoLogico noLogico) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoMatriz noMatriz) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoMenosUnario noMenosUnario) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoNao noNao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaIgualdade noOperacaoLogicaIgualdade) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaDiferenca noOperacaoLogicaDiferenca) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoAtribuicao noOperacaoAtribuicao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaE noOperacaoLogicaE) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaOU noOperacaoLogicaOU) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaMaior noOperacaoLogicaMaior) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaMaiorIgual noOperacaoLogicaMaiorIgual) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaMenor noOperacaoLogicaMenor) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoLogicaMenorIgual noOperacaoLogicaMenorIgual) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoSoma noOperacaoSoma) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoSubtracao noOperacaoSubtracao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoDivisao noOperacaoDivisao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoMultiplicacao noOperacaoMultiplicacao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoModulo noOperacaoModulo) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseLeftShift noOperacaoBitwiseLeftShift) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseRightShift noOperacaoBitwiseRightShift) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseE noOperacaoBitwiseE) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseOu noOperacaoBitwiseOu) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseXOR noOperacaoBitwiseXOR) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoBitwiseNao noOperacaoBitwiseNao) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoPare noPare) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoReal noReal) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoReferenciaMatriz noReferenciaMatriz) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoReferenciaVariavel noReferenciaVariavel) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoReferenciaVetor noReferenciaVetor) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoTitulo noTitulo) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoVaPara noVaPara) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoVetor noVetor) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoDeclaracaoParametro noDeclaracaoParametro) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoInclusaoBiblioteca noInclusaoBiblioteca) throws ExcecaoVisitaASA
    {
        return false;
    }

    @Override
    public Object visitar(NoAtributoVariavel noAtributoVariavel) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoAtributoArray noAtributoArray) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoAtributoMatriz noAtributoMatriz) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoDeclaracaoRegistro noDeclaracaoRegistro) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoInstanciaRegistro noInstanciaRegistro) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoInicializacaoAtributoVariavel noInicializacaoAtributoVariavel) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoInicializacaoAtributoArray noInicializacaoAtributoArray) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoInicializacaoAtributoMatriz noInicializacaoAtributoMatriz) throws ExcecaoVisitaASA {
        return null;
    }

    @Override
    public Object visitar(NoSenao noSenao) throws ExcecaoVisitaASA {
        return false;
    }

    @Override
    public Object visitar(NoParametroFuncao noParametroFuncao) throws ExcecaoVisitaASA {
        return false;
    }

}
