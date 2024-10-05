package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

public class NoListaAtributos extends NoBloco implements NoAtributo {

    protected final List<NoAtributo> declaracoes = new ArrayList<>();
    protected final TipoDado tipo;

    public NoListaAtributos(TipoDado tipo) {
        this.tipo = tipo;
    }

    public void adicionaDeclaracao(NoAtributo declaracao) {
        declaracoes.add(declaracao);
    }

    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA {
        for (NoAtributo declaracao : declaracoes) {
            declaracao.aceitar(visitante);
        }
        return null;
    }

    public TipoDado getTipo() {
        return tipo;
    }

    public List<NoAtributo> getDeclaracoes() {
        return declaracoes;
    }

    @Override
    public String getNome() { // TODO remover este método da Interface NoDeclaracao
        return "";
    }

}