package br.univali.portugol.nucleo.asa;

public final class NoDeclaracaoArrayAtributo extends NoDeclaracaoBase{

    private final NoExpressao tamanho;

    /**
     * @param nome      o nome deste vetor.
     * @param tipoDado  o tipo de dado deste vetor.
     * @param tamanho   a expressão que define o número de elementos deste vetor.
     * @param constante define se os valores detse vetor serão constantes. Se
     *                  <code>true</code> os valores não poderão ser alterados após a
     *                  inicialização do vetor.
     * @since 1.0
     */
    public NoDeclaracaoArrayAtributo(String nome, TipoDado tipoDado, NoExpressao tamanho, boolean constante) {
        super(nome, tipoDado, false);
        this.tamanho = tamanho;
    }

    /**
     * Obtém a expressão que define o tamanho, deste vetor, isto é, o número de
     * elementos que ele terá.
     *
     * @return a expressão que define o tamanho deste vetor.
     * @since 1.0
     */
    public NoExpressao getTamanho() {
        return tamanho;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA {
        return visitante.visitar(this);
    }
}