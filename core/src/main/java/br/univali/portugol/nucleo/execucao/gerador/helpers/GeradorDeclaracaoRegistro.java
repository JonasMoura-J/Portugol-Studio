package br.univali.portugol.nucleo.execucao.gerador.helpers;

import br.univali.portugol.nucleo.asa.*;
import br.univali.portugol.nucleo.execucao.gerador.GeradorCodigoJava;

import java.io.PrintWriter;
import java.util.List;

/**
 * @author Jonas
 */
public class GeradorDeclaracaoRegistro {

    public void gera(NoDeclaracaoRegistro noDeclaracaoRegistro, PrintWriter saida, VisitanteASA visitor,
                     int nivelEscopo, GeradorCodigoJava.Opcoes opcoes, long seed) throws ExcecaoVisitaASA
    {
        String identacao = Utils.geraIdentacao(nivelEscopo);
        System.out.println(saida.toString());
        saida.append(identacao)
                .append("class ")
                .append(noDeclaracaoRegistro.getNome()).println();
        saida.append("{").println();

        List<NoListaAtributos> atributos = noDeclaracaoRegistro.getAtributos();

        for(NoListaAtributos atributo : atributos){
            for(NoAtributo s : atributo.getDeclaracoes()) {
                saida.append("public " + Utils.getNomeTipoJava(atributo.getTipo()) + " " + s.getNome())
                        .append(";").println();
            }
        }
        saida.append("}").println();
    }
}
