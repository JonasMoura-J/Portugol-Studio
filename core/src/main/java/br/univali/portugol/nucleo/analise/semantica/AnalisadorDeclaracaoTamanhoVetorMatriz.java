/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.portugol.nucleo.analise.semantica;

import br.univali.portugol.nucleo.analise.semantica.erros.ErroExpressaoTamanhoVetorMatriz;
import br.univali.portugol.nucleo.asa.*;

/**
 *
 * @author 3798925
 */
public class AnalisadorDeclaracaoTamanhoVetorMatriz implements VisitanteASA{
    /**
     * Analisa se na declaração de um vetor/matriz com tamanho em expressão
     * há apenas valores válidos
     *
     * @param declaracao
     * @param noExpressao expressao a ser analisada
     * @return true se o tamanho é valido e false se não.
     * @throws br.univali.portugol.nucleo.asa.ExcecaoVisitaASA
     * @throws br.univali.portugol.nucleo.analise.semantica.erros.ErroExpressaoTamanhoVetorMatriz
     */
    
    private static String variavelAtual = "";
    
    public Integer possuiExpressaoDeTamanhoValida(NoDeclaracaoBase declaracao, NoExpressao noExpressao) throws ExcecaoVisitaASA, ErroExpressaoTamanhoVetorMatriz
    {
        Integer valido = null;
        
        try
        {
            valido = (Integer) noExpressao.aceitar(this);
            if(valido<=0)
            {
                throw new ErroExpressaoTamanhoVetorMatriz(declaracao, noExpressao);
            }
        }
        catch(ExcecaoVisitaASA ex)
        {
            throw new ErroExpressaoTamanhoVetorMatriz(declaracao, (NoBloco) ex.getNo(), variavelAtual);
        }        
        
        return valido;
    }

    @Override
    public Object visitar(ASAPrograma asap) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoCadeia noCadeia) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoCaracter noCaracter) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoCaso noCaso) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoChamadaFuncao chamadaFuncao) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoContinue noContinue) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoDeclaracaoFuncao declaracaoFuncao) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoDeclaracaoMatriz noDeclaracaoMatriz) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoDeclaracaoVariavel noDeclaracaoVariavel) throws ExcecaoVisitaASA {
        if(noDeclaracaoVariavel.getInicializacao() != null)
        {
            NoExpressao exp = noDeclaracaoVariavel.getInicializacao();
            return (Integer) exp.aceitar(this);
        }
        throw new ExcecaoVisitaASA("Not supported yet.", null, noDeclaracaoVariavel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoDeclaracaoVetor noDeclaracaoVetor) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoEnquanto noEnquanto) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoEscolha noEscolha) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoFacaEnquanto noFacaEnquanto) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoInteiro noInteiro) throws ExcecaoVisitaASA {
        return noInteiro.getValor();
    }

    @Override
    public Object visitar(NoLogico noLogico) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoMatriz noMatriz) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoMenosUnario noMenosUnario) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoNao noNao) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaIgualdade noOperacaoLogicaIgualdade) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaDiferenca noOperacaoLogicaDiferenca) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoAtribuicao noOperacaoAtribuicao) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaE noOperacaoLogicaE) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaOU noOperacaoLogicaOU) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaMaior noOperacaoLogicaMaior) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaMaiorIgual noOperacaoLogicaMaiorIgual) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaMenor noOperacaoLogicaMenor) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoLogicaMenorIgual noOperacaoLogicaMenorIgual) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoOperacaoSoma noOperacaoSoma) throws ExcecaoVisitaASA {        
        Integer valor1 = (Integer) noOperacaoSoma.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoSoma.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 + valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoSubtracao noOperacaoSubtracao) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoSubtracao.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoSubtracao.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 - valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoDivisao noOperacaoDivisao) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoDivisao.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoDivisao.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 / valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoMultiplicacao noOperacaoMultiplicacao) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoMultiplicacao.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoMultiplicacao.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 * valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoModulo noOperacaoModulo) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoModulo.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoModulo.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 % valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseLeftShift noOperacaoBitwiseLeftShift) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoBitwiseLeftShift.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoBitwiseLeftShift.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 << valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseRightShift noOperacaoBitwiseRightShift) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoBitwiseRightShift.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoBitwiseRightShift.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 >> valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseE noOperacaoBitwiseE) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoBitwiseE.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoBitwiseE.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 & valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseOu noOperacaoBitwiseOu) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoBitwiseOu.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoBitwiseOu.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 | valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoOperacaoBitwiseXOR noOperacaoBitwiseXOR) throws ExcecaoVisitaASA {
        Integer valor1 = (Integer) noOperacaoBitwiseXOR.getOperandoDireito().aceitar(this);
        Integer valor2 = (Integer) noOperacaoBitwiseXOR.getOperandoEsquerdo().aceitar(this);        
        Integer resultado = valor1 ^ valor2;
        
        return resultado;
    }

    @Override
    public Object visitar(NoBitwiseNao noOperacaoBitwiseNao) throws ExcecaoVisitaASA {              
        return ~((Integer)noOperacaoBitwiseNao.getExpressao().aceitar(this));
    }

    @Override
    public Object visitar(NoPara noPara) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoPare noPare) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoReal noReal) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoReferenciaMatriz noReferenciaMatriz) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoReferenciaVariavel noReferenciaVariavel) throws ExcecaoVisitaASA {
        NoDeclaracaoBase base = noReferenciaVariavel.getOrigemDaReferencia();
        variavelAtual = base.getNome();
        if(base.constante())
        {            
            return (Integer) base.aceitar(this);
        }
        throw new ExcecaoVisitaASA("Not supported yet.", null, noReferenciaVariavel); //To change body of generated methods, choose Tools | Templates.;
    }

    @Override
    public Object visitar(NoReferenciaVetor noReferenciaVetor) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoRetorne noRetorne) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoSe noSe) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoTitulo noTitulo) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoVaPara noVaPara) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoVetor noVetor) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoDeclaracaoParametro noDeclaracaoParametro) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoInclusaoBiblioteca noInclusaoBiblioteca) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoAtributoVariavel noAtributoVariavel) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoAtributoArray noAtributoArray) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoAtributoMatriz noAtributoMatriz) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoDeclaracaoRegistro noDeclaracaoRegistro) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoInstanciaRegistro noInstanciaRegistro) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoInicializacaoAtributoVariavel noInicializacaoAtributoVariavel) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null);
    }

    @Override
    public Object visitar(NoInicializacaoAtributoArray noInicializacaoAtributoArray) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null);
    }

    @Override
    public Object visitar(NoInicializacaoAtributoMatriz noInicializacaoAtributoMatriz) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null);
    }

    @Override
    public Object visitar(NoSenao noSenao) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitar(NoParametroFuncao noParametroFuncao) throws ExcecaoVisitaASA {
        throw new ExcecaoVisitaASA("Not supported yet.", null, null); //To change body of generated methods, choose Tools | Templates.
    }
}
