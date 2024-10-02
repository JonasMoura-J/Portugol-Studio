package br.univali.portugol.nucleo.asa;

public final class NoDeclaracaoTipoRegistro extends NoDeclaracaoBase{

    private NoListaAtributosRegistro atributos;

    public NoDeclaracaoTipoRegistro(String nome, TipoDado tipoDado, NoListaAtributosRegistro atributos)
    {
        super(nome, tipoDado, false);
        this.atributos = atributos;
    }

    public NoListaAtributosRegistro getAtributos()
    {
        return atributos;
    }

    public void setAtributos(NoListaAtributosRegistro atributos)
    {
        this.atributos = atributos;
    }

    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }
}
