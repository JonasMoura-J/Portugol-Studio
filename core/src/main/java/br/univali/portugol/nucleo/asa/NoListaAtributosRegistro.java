package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

public class NoListaAtributosRegistro  extends NoBloco implements NoDeclaracaoAtributo {

    protected final List<NoDeclaracaoAtributo> declaracoes = new ArrayList<>();
    protected final TipoDado tipo;

    public NoListaAtributosRegistro(TipoDado tipo) {
        this.tipo = tipo;
    }

    public void adicionaDeclaracao(NoDeclaracaoAtributo declaracao) {
        declaracoes.add(declaracao);
    }

    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA {
        for (NoDeclaracaoAtributo declaracao : declaracoes) {
            declaracao.aceitar(visitante);
        }
        return null;
    }

    public TipoDado getTipo() {
        return tipo;
    }

    public List<NoDeclaracaoAtributo> getDeclaracoes() {
        return declaracoes;
    }

    @Override
    public String getNome() { // TODO remover este método da Interface NoDeclaracao
        return "";
    }

}