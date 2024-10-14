package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

public final class NoDeclaracaoRegistro extends NoDeclaracaoBase implements NoDeclaracaoInspecionavel{

    private int idParaInspecao = -1;

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

    public void setIdParaInspecao(int idParaInspecao)
    {
        this.idParaInspecao = idParaInspecao;
    }

    @Override
    public int getIdParaInspecao()
    {
        return idParaInspecao;
    }

}
