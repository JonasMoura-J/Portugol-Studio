package br.univali.portugol.nucleo.asa;

public final class NoDeclaracaoVariavelRegistro extends NoDeclaracaoBase{
    private int indiceReferencia = -1;

    /**
     *
     * @param nome define o nome detsa variável.
     *
     * @param tipoRegistro define o tipo de registro desta variável.
     *
     * Se <code>true</code>, o valor não poderá ser alterado após a
     * inicialização.
     *
     * @since 1.0
     */

    public NoDeclaracaoVariavelRegistro(String nome, String tipoRegistro)
    {
        super(nome, tipoRegistro);
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
