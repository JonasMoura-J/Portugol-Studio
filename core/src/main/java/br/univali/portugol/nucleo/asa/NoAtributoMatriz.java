package br.univali.portugol.nucleo.asa;

public final class NoAtributoMatriz extends NoDeclaracaoBase implements NoAtributo {

    private final NoExpressao numeroLinhas;
    private final NoExpressao numeroColunas;

    /**
     *
     * @param nome o nome desta matriz.
     *
     * @param tipoDado o tipo de dado desta matriz.
     *
     * @param numeroLinhas a expressão que define o número de linhas desta
     * matriz.
     *
     * @param numeroColunas a expressão que define o número de colunas desta
     * matriz.
     *
     * @since 1.0
     */
    public NoAtributoMatriz(String nome, TipoDado tipoDado, NoExpressao numeroLinhas, NoExpressao numeroColunas)
    {
        super(nome, tipoDado, false);
        this.numeroLinhas = numeroLinhas;
        this.numeroColunas = numeroColunas;
    }

    /**
     * Obtém a expressão que define o número de linhas desta matriz. Pode ser
     * qualquer expressão do tipo {@link TipoDado#INTEIRO}.
     *
     * @return a expressão que define o número de linhas desta matriz.
     *
     * @since 1.0
     */
    public NoExpressao getNumeroLinhas()
    {
        return numeroLinhas;
    }

    /**
     * Obtém a expressão que define o número de colunas desta matriz. Pode ser
     * qualquer expressão do tipo {@link TipoDado#INTEIRO}.
     *
     * @return a expressão que define o número de colunas desta matriz.
     *
     * @since 1.0
     */
    public NoExpressao getNumeroColunas()
    {
        return numeroColunas;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }
}
