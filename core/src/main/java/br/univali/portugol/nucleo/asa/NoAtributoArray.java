package br.univali.portugol.nucleo.asa;

public final class NoAtributoArray extends NoDeclaracaoBase implements NoAtributo{

    private final NoExpressao tamanho;

    /**
     * @param nome      o nome deste vetor.
     * @param tipoDado  o tipo de dado deste vetor.
     * @param tamanho   a expressão que define o número de elementos deste vetor.
     */


    public NoAtributoArray(String nome, TipoDado tipoDado, NoExpressao tamanho) {
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