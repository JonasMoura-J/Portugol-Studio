package br.univali.portugol.nucleo.asa;

public final class NoAtributoVariavel extends NoDeclaracaoBase implements NoAtributo {
    private int indiceReferencia = -1;
    /**
     *
     * @param nome define o nome detsa variável.
     *
     * @param tipoDado define o tipo de dado desta variável.
     *
     * Se <code>true</code>, o valor não poderá ser alterado após a
     * inicialização.
     *
     * @since 1.0
     */
    public NoAtributoVariavel(String nome, TipoDado tipoDado, boolean constante)
    {
        super(nome, tipoDado, false);
    }

    public NoAtributoVariavel(String nome, TipoDado tipoDado)
    {
        super(nome, tipoDado, false);
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }

    public boolean ehPassadaPorReferencia()
    {
        return indiceReferencia >= 0;
    }

    public int getIndiceReferencia()
    {
        return indiceReferencia;
    }

    public void setIndiceReferencia(int indiceReferencia)
    {
        this.indiceReferencia = indiceReferencia;
    }
}