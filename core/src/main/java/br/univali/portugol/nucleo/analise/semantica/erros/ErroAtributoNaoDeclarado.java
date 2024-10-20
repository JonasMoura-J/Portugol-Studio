package br.univali.portugol.nucleo.analise.semantica.erros;

import br.univali.portugol.nucleo.asa.TrechoCodigoFonte;
import br.univali.portugol.nucleo.mensagens.ErroSemantico;

/**
 *
 * @author Jonas
 */
public class ErroAtributoNaoDeclarado extends ErroSemantico {
  private final String atributo;
  private final String registro;
  private String codigo = "ErroSemantico.AtributoInexistente";

  public ErroAtributoNaoDeclarado(TrechoCodigoFonte trechoCodigoFonte, String atributo, String registro)
  {
    super(trechoCodigoFonte);
    this.atributo = atributo;
    this.registro = registro;
    super.setCodigo(codigo);
  }

  @Override
  protected String construirMensagem()
  {
    return String.format("O atibuto \"%s.\" não foi declarado na definição do registro \"%s\"", atributo, registro);
  }

}
