package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

public final class NoDeclaracaoTipoRegistro extends NoDeclaracaoBase{

    private List<NoListaAtributosRegistro> atributos = new ArrayList<>();

    public NoDeclaracaoTipoRegistro(String nome, TipoDado tipoDado)
    {
        super(nome, tipoDado, false);
    }

    public List<NoListaAtributosRegistro> getAtributos()
    {
        return atributos;
    }

    public void setAtributos(List<NoListaAtributosRegistro> atributos)
    {
        this.atributos = atributos;
    }

    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }
}
