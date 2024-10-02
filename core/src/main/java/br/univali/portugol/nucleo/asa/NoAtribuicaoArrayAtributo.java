package br.univali.portugol.nucleo.asa;

import java.util.List;

public class NoAtribuicaoArrayAtributo extends NoExpressao
{
    private final List<Object> valores;

    /**
     *
     * @param valores     uma lista contendo os valores do vetor.
     * @since 1.0
     */
    public NoAtribuicaoArrayAtributo(List<Object> valores)
    {
        this.valores = valores;
    }

    /**
     * Obtém os valores armazenados neste vetor.
     *
     * @return     os valores armazenados neste vetor.
     * @since 1.0
     */
    public List<Object> getValores()
    {
        return valores;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }

    @Override
    public TipoDado getTipoResultante()
    {
        if (!valores.isEmpty())
        {
            Object valor = valores.get(0);
            if (valor instanceof NoExpressao)
            {
                return ((NoExpressao)valor).getTipoResultante();
            }
            else if(valor instanceof NoReferencia){
                return ((NoReferencia)valor).getOrigemDaReferencia().getTipoDado();
            }
        }
        return TipoDado.VAZIO;
    }
}
