package br.univali.portugol.nucleo.asa;

public final class NoInstanciaRegistro extends NoDeclaracaoBase{
    private int indiceReferencia = -1;
    private NoListaAtributos atributos;

    public int idParaInspecao = -1; // usado para implementar a inspeção de símbolos

    /**
     *
     * @param nome define o nome desta variável.
     *
     * @param tipoRegistro define o tipo de registro desta variável.
     *
     * Se <code>true</code>, o valor não poderá ser alterado após a
     * inicialização.
     *
     * @since 1.0
     */

    public NoInstanciaRegistro(String nome, TipoDado tipoRegistro, NoListaAtributos atributos)
    {
        super(nome, tipoRegistro, false);
        this.atributos = atributos;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }

    public NoListaAtributos getAtributos()
    {
        return atributos;
    }

    public void setAtributos(NoListaAtributos atributos)
    {
        this.atributos = atributos;
    }

    public void setIdParaInspecao(int idParaInspecao)
    {
        this.idParaInspecao = idParaInspecao;
    }

    public int getIdParaInspecao()
    {
        return idParaInspecao;
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
