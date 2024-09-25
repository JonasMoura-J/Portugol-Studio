package br.univali.portugol.nucleo.asa;

public interface NoDeclaracaoAtributo {

    Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA;

    String getNome();
}
