package br.univali.portugol.nucleo.asa;


public final class NoInicializacaoAtributoVariavel extends NoExpressao {

    public int idParaInspecao = -1;
    private NoExpressao valor;
    private String tipoRegistro;
    private String nome;
    private TrechoCodigoFonte trechoCodigoFonteNome;
    private TrechoCodigoFonte trechoCodigoFonteTipoDado;


    public NoInicializacaoAtributoVariavel(String tipoRegistro, String nome, NoExpressao valor) {
        this.valor = valor;
        this.tipoRegistro = tipoRegistro;
        this.nome = nome;
    }

    public NoExpressao getValor() {
        return valor;
    }

    public void setValor(NoExpressao valor) {this.valor = valor;}

    public String getTipoRegistro() {return tipoRegistro;}

    public void setTipoRegistro(String tipoRegistro) {this.tipoRegistro = tipoRegistro;}

    public String getNome() {return nome;}

    public void setNome(String nomeAtributo) {this.nome = nomeAtributo;}

    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA {
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

    public String getNomeDeclaracaoMemoria(){
        return this.tipoRegistro + "." + this.nome;
    }

    @Override
    public TipoDado getTipoResultante() {
        return null;
    }

    public TrechoCodigoFonte getTrechoCodigoFonteNome()
    {
        return trechoCodigoFonteNome;
    }


    public void setTrechoCodigoFonteNome(TrechoCodigoFonte trechoCodigoFonteNome)
    {
        this.trechoCodigoFonteNome = trechoCodigoFonteNome;
    }

    public void setTrechoCodigoFonteTipoDado(TrechoCodigoFonte trechoCodigoFonteTipoDado)
    {
        this.trechoCodigoFonteTipoDado = trechoCodigoFonteTipoDado;
    }

    public TrechoCodigoFonte getTrechoCodigoFonteTipoDado()
    {
        return trechoCodigoFonteTipoDado;
    }


}