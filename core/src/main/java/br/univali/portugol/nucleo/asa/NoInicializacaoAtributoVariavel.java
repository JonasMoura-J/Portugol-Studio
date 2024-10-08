package br.univali.portugol.nucleo.asa;


public final class NoInicializacaoAtributoVariavel extends NoExpressao implements NoInicializacaoAtributo {

    private final Object valor;


    public NoInicializacaoAtributoVariavel(Object valor) {
        this.valor = valor;
    }

    /**
     * Obtém os valores armazenados neste vetor.
     *
     * @return os valores armazenados neste vetor.
     * @since 1.0
     */
    public Object getValor() {
        return valor;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA {
        return visitante.visitar(this);
    }

    @Override
    public TipoDado getTipoResultante() {
        return null;
    }
}