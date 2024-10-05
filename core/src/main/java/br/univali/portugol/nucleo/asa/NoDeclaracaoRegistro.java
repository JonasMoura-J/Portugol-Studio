package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

public final class NoDeclaracaoRegistro extends NoDeclaracaoBase{

    private List<NoListaAtributos> atributos = new ArrayList<>();

    public NoDeclaracaoRegistro(String nome, TipoDado tipoDado)
    {
        super(nome, tipoDado, false);
    }

    public List<NoListaAtributos> getAtributos()
    {
        return atributos;
    }

    public void setAtributos(List<NoListaAtributos> atributos)
    {
        this.atributos = atributos;
    }

    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }
}
