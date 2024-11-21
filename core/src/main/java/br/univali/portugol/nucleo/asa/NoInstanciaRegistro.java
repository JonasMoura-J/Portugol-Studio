package br.univali.portugol.nucleo.asa;

import java.util.ArrayList;
import java.util.List;

public final class NoInstanciaRegistro extends NoDeclaracaoBase implements NoDeclaracao{
    private int indiceReferencia = -1;

    public int idParaInspecao = -1; // usado para implementar a inspeção de símbolos
    private String tipoInstancia;

    private List<NoListaDeclaracoes> campos = new ArrayList<>();
    /**
     *
     * @param nome define o nome desta variável.
     *
     * @param tipoRegistro define o tipo registro desta variável.
     *
     * Se <code>true</code>, o valor não poderá ser alterado após a
     * inicialização.
     *
     * @since 1.0
     */

    public NoInstanciaRegistro(String nome, TipoDado tipoRegistro, String tipoInstancia)
    {
        super(nome, tipoRegistro, false);
        this.tipoInstancia = tipoInstancia;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
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

    public String getTipoInstancia(){
        return tipoInstancia;
    }

    public List<NoListaDeclaracoes> getCampos()
    {
        return campos;
    }

    public void setCampos(List<NoListaDeclaracoes> campos)
    {
        this.campos = campos;
    }

    public void setTipoInstancia(String tipoInstancia){this.tipoInstancia = tipoInstancia;}
}
