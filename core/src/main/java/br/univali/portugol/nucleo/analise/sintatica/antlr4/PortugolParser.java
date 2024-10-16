// Generated from Portugol.g4 by ANTLR 4.7.2
package br.univali.portugol.nucleo.analise.sintatica.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABRE_PARENTESES=1, FECHA_PARENTESES=2, ABRE_COLCHETES=3, FECHA_COLCHETES=4, 
		ABRE_CHAVES=5, FECHA_CHAVES=6, TIPO=7, REGISTRO=8, FACA=9, ENQUANTO=10, 
		PARA=11, SE=12, SENAO=13, CONSTANTE=14, FUNCAO=15, PROGRAMA=16, ESCOLHA=17, 
		CASO=18, CONTRARIO=19, PARE=20, RETORNE=21, INCLUA=22, BIBLIOTECA=23, 
		OP_NAO=24, OP_E_LOGICO=25, OP_OU_LOGICO=26, OP_SUBTRACAO=27, OP_ADICAO=28, 
		OP_MULTIPLICACAO=29, OP_DIVISAO=30, OP_MOD=31, OP_ATRIBUICAO=32, OP_IGUALDADE=33, 
		OP_DIFERENCA=34, OP_MAIOR=35, OP_MENOR=36, OP_MENOR_IGUAL=37, OP_MAIOR_IGUAL=38, 
		OP_INCREMENTO_UNARIO=39, OP_DECREMENTO_UNARIO=40, OP_SHIFT_LEFT=41, OP_SHIFT_RIGHT=42, 
		OP_XOR=43, OP_OU_BITWISE=44, OP_NOT_BITWISE=45, OP_ALIAS_BIBLIOTECA=46, 
		E_COMERCIAL=47, OP_MAIS_IGUAL=48, OP_MENOS_IGUAL=49, OP_MULTIPLICACAO_IGUAL=50, 
		OP_DIVISAO_IGUAL=51, LOGICO=52, VERDADEIRO=53, FALSO=54, CARACTER=55, 
		STRING=56, ID=57, ID_REGISTRO=58, ID_INSTANCIA_REGISTRO=59, REAL=60, INT=61, 
		HEXADECIMAL=62, COMENTARIO=63, COMENTARIO_SIMPLES=64, WS=65, PONTO=66, 
		VIRGULA=67, PONTOVIRGULA=68, DOISPONTOS=69;
	public static final int
		RULE_arquivo = 0, RULE_inclusaoBiblioteca = 1, RULE_listaDeclaracoes = 2, 
		RULE_listaAtributos = 3, RULE_atributo = 4, RULE_atributoVariavel = 5, 
		RULE_atributoMatriz = 6, RULE_atributoArray = 7, RULE_declaracaoRegistro = 8, 
		RULE_instanciaRegistro = 9, RULE_inicializacaoAtributoVariavel = 10, RULE_inicializacaoAtributoMatriz = 11, 
		RULE_inicializacaoAtributoArray = 12, RULE_declaracao = 13, RULE_declaracaoVariavel = 14, 
		RULE_declaracaoMatriz = 15, RULE_inicializacaoMatriz = 16, RULE_linhaMatriz = 17, 
		RULE_colunaMatriz = 18, RULE_declaracaoArray = 19, RULE_inicializacaoArray = 20, 
		RULE_tamanhoArray = 21, RULE_declaracaoFuncao = 22, RULE_parametroFuncao = 23, 
		RULE_listaParametros = 24, RULE_parametro = 25, RULE_parametroArray = 26, 
		RULE_parametroMatriz = 27, RULE_comando = 28, RULE_atribuicao = 29, RULE_atribuicaoComposta = 30, 
		RULE_retorne = 31, RULE_se = 32, RULE_senao = 33, RULE_enquanto = 34, 
		RULE_facaEnquanto = 35, RULE_para = 36, RULE_listaComandos = 37, RULE_inicializacaoPara = 38, 
		RULE_condicao = 39, RULE_incrementoPara = 40, RULE_escolha = 41, RULE_caso = 42, 
		RULE_pare = 43, RULE_indiceArray = 44, RULE_expressao = 45, RULE_listaExpressoes = 46, 
		RULE_escopoBiblioteca = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"arquivo", "inclusaoBiblioteca", "listaDeclaracoes", "listaAtributos", 
			"atributo", "atributoVariavel", "atributoMatriz", "atributoArray", "declaracaoRegistro", 
			"instanciaRegistro", "inicializacaoAtributoVariavel", "inicializacaoAtributoMatriz", 
			"inicializacaoAtributoArray", "declaracao", "declaracaoVariavel", "declaracaoMatriz", 
			"inicializacaoMatriz", "linhaMatriz", "colunaMatriz", "declaracaoArray", 
			"inicializacaoArray", "tamanhoArray", "declaracaoFuncao", "parametroFuncao", 
			"listaParametros", "parametro", "parametroArray", "parametroMatriz", 
			"comando", "atribuicao", "atribuicaoComposta", "retorne", "se", "senao", 
			"enquanto", "facaEnquanto", "para", "listaComandos", "inicializacaoPara", 
			"condicao", "incrementoPara", "escolha", "caso", "pare", "indiceArray", 
			"expressao", "listaExpressoes", "escopoBiblioteca"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, "'registro'", "'faca'", 
			"'enquanto'", "'para'", "'se'", "'senao'", "'const'", "'funcao'", "'programa'", 
			"'escolha'", "'caso'", "'contrario'", "'pare'", "'retorne'", "'inclua'", 
			"'biblioteca'", "'nao'", "'e'", "'ou'", "'-'", "'+'", "'*'", "'/'", "'%'", 
			"'='", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'++'", "'--'", 
			"'<<'", "'>>'", "'^'", "'|'", "'~'", "'-->'", "'&'", "'+='", "'-='", 
			"'*='", "'/='", null, "'verdadeiro'", "'falso'", null, null, null, null, 
			null, null, null, null, null, null, null, "'.'", "','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", "FECHA_COLCHETES", 
			"ABRE_CHAVES", "FECHA_CHAVES", "TIPO", "REGISTRO", "FACA", "ENQUANTO", 
			"PARA", "SE", "SENAO", "CONSTANTE", "FUNCAO", "PROGRAMA", "ESCOLHA", 
			"CASO", "CONTRARIO", "PARE", "RETORNE", "INCLUA", "BIBLIOTECA", "OP_NAO", 
			"OP_E_LOGICO", "OP_OU_LOGICO", "OP_SUBTRACAO", "OP_ADICAO", "OP_MULTIPLICACAO", 
			"OP_DIVISAO", "OP_MOD", "OP_ATRIBUICAO", "OP_IGUALDADE", "OP_DIFERENCA", 
			"OP_MAIOR", "OP_MENOR", "OP_MENOR_IGUAL", "OP_MAIOR_IGUAL", "OP_INCREMENTO_UNARIO", 
			"OP_DECREMENTO_UNARIO", "OP_SHIFT_LEFT", "OP_SHIFT_RIGHT", "OP_XOR", 
			"OP_OU_BITWISE", "OP_NOT_BITWISE", "OP_ALIAS_BIBLIOTECA", "E_COMERCIAL", 
			"OP_MAIS_IGUAL", "OP_MENOS_IGUAL", "OP_MULTIPLICACAO_IGUAL", "OP_DIVISAO_IGUAL", 
			"LOGICO", "VERDADEIRO", "FALSO", "CARACTER", "STRING", "ID", "ID_REGISTRO", 
			"ID_INSTANCIA_REGISTRO", "REAL", "INT", "HEXADECIMAL", "COMENTARIO", 
			"COMENTARIO_SIMPLES", "WS", "PONTO", "VIRGULA", "PONTOVIRGULA", "DOISPONTOS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArquivoContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(PortugolParser.PROGRAMA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<InclusaoBibliotecaContext> inclusaoBiblioteca() {
			return getRuleContexts(InclusaoBibliotecaContext.class);
		}
		public InclusaoBibliotecaContext inclusaoBiblioteca(int i) {
			return getRuleContext(InclusaoBibliotecaContext.class,i);
		}
		public List<DeclaracaoRegistroContext> declaracaoRegistro() {
			return getRuleContexts(DeclaracaoRegistroContext.class);
		}
		public DeclaracaoRegistroContext declaracaoRegistro(int i) {
			return getRuleContext(DeclaracaoRegistroContext.class,i);
		}
		public List<DeclaracaoFuncaoContext> declaracaoFuncao() {
			return getRuleContexts(DeclaracaoFuncaoContext.class);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao(int i) {
			return getRuleContext(DeclaracaoFuncaoContext.class,i);
		}
		public List<ListaDeclaracoesContext> listaDeclaracoes() {
			return getRuleContexts(ListaDeclaracoesContext.class);
		}
		public ListaDeclaracoesContext listaDeclaracoes(int i) {
			return getRuleContext(ListaDeclaracoesContext.class,i);
		}
		public ArquivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquivo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitArquivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArquivoContext arquivo() throws RecognitionException {
		ArquivoContext _localctx = new ArquivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arquivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PROGRAMA);
			setState(97);
			match(ABRE_CHAVES);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(98);
				inclusaoBiblioteca();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << REGISTRO) | (1L << CONSTANTE) | (1L << FUNCAO))) != 0)) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REGISTRO:
					{
					setState(104);
					declaracaoRegistro();
					}
					break;
				case FUNCAO:
					{
					setState(105);
					declaracaoFuncao();
					}
					break;
				case TIPO:
				case CONSTANTE:
					{
					setState(106);
					listaDeclaracoes();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusaoBibliotecaContext extends ParserRuleContext {
		public TerminalNode INCLUA() { return getToken(PortugolParser.INCLUA, 0); }
		public TerminalNode BIBLIOTECA() { return getToken(PortugolParser.BIBLIOTECA, 0); }
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode OP_ALIAS_BIBLIOTECA() { return getToken(PortugolParser.OP_ALIAS_BIBLIOTECA, 0); }
		public InclusaoBibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusaoBiblioteca; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInclusaoBiblioteca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusaoBibliotecaContext inclusaoBiblioteca() throws RecognitionException {
		InclusaoBibliotecaContext _localctx = new InclusaoBibliotecaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inclusaoBiblioteca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(INCLUA);
			setState(115);
			match(BIBLIOTECA);
			setState(116);
			match(ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ALIAS_BIBLIOTECA) {
				{
				setState(117);
				match(OP_ALIAS_BIBLIOTECA);
				setState(118);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TerminalNode CONSTANTE() { return getToken(PortugolParser.CONSTANTE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANTE) {
				{
				setState(121);
				match(CONSTANTE);
				}
			}

			setState(124);
			match(TIPO);
			setState(125);
			declaracao();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(126);
				match(VIRGULA);
				setState(127);
				declaracao();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaAtributosContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaAtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAtributos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaAtributosContext listaAtributos() throws RecognitionException {
		ListaAtributosContext _localctx = new ListaAtributosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaAtributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(TIPO);
			setState(134);
			atributo();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(135);
				match(VIRGULA);
				setState(136);
				atributo();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoContext extends ParserRuleContext {
		public AtributoVariavelContext atributoVariavel() {
			return getRuleContext(AtributoVariavelContext.class,0);
		}
		public AtributoArrayContext atributoArray() {
			return getRuleContext(AtributoArrayContext.class,0);
		}
		public AtributoMatrizContext atributoMatriz() {
			return getRuleContext(AtributoMatrizContext.class,0);
		}
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atributo);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				atributoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				atributoArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				atributoMatriz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoVariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public AtributoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoVariavel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtributoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoVariavelContext atributoVariavel() throws RecognitionException {
		AtributoVariavelContext _localctx = new AtributoVariavelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atributoVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoMatrizContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(PortugolParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(PortugolParser.ABRE_COLCHETES, i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(PortugolParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(PortugolParser.FECHA_COLCHETES, i);
		}
		public LinhaMatrizContext linhaMatriz() {
			return getRuleContext(LinhaMatrizContext.class,0);
		}
		public ColunaMatrizContext colunaMatriz() {
			return getRuleContext(ColunaMatrizContext.class,0);
		}
		public AtributoMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtributoMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoMatrizContext atributoMatriz() throws RecognitionException {
		AtributoMatrizContext _localctx = new AtributoMatrizContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atributoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(ABRE_COLCHETES);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(151);
				linhaMatriz();
				}
			}

			setState(154);
			match(FECHA_COLCHETES);
			setState(155);
			match(ABRE_COLCHETES);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(156);
				colunaMatriz();
				}
			}

			setState(159);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public AtributoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtributoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoArrayContext atributoArray() throws RecognitionException {
		AtributoArrayContext _localctx = new AtributoArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atributoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(ABRE_COLCHETES);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(163);
				tamanhoArray();
				}
			}

			setState(166);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoRegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(PortugolParser.REGISTRO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<ListaAtributosContext> listaAtributos() {
			return getRuleContexts(ListaAtributosContext.class);
		}
		public ListaAtributosContext listaAtributos(int i) {
			return getRuleContext(ListaAtributosContext.class,i);
		}
		public DeclaracaoRegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoRegistro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoRegistroContext declaracaoRegistro() throws RecognitionException {
		DeclaracaoRegistroContext _localctx = new DeclaracaoRegistroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoRegistro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(REGISTRO);
			setState(169);
			match(ID);
			setState(170);
			match(ABRE_CHAVES);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(171);
				listaAtributos();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanciaRegistroContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public InstanciaRegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanciaRegistro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInstanciaRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanciaRegistroContext instanciaRegistro() throws RecognitionException {
		InstanciaRegistroContext _localctx = new InstanciaRegistroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instanciaRegistro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacaoAtributoVariavelContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode PONTO() { return getToken(PortugolParser.PONTO, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InicializacaoAtributoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoAtributoVariavel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoAtributoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoAtributoVariavelContext inicializacaoAtributoVariavel() throws RecognitionException {
		InicializacaoAtributoVariavelContext _localctx = new InicializacaoAtributoVariavelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inicializacaoAtributoVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(PONTO);
			setState(184);
			match(ID);
			setState(185);
			match(OP_ATRIBUICAO);
			setState(186);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacaoAtributoMatrizContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode PONTO() { return getToken(PortugolParser.PONTO, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public InicializacaoMatrizContext inicializacaoMatriz() {
			return getRuleContext(InicializacaoMatrizContext.class,0);
		}
		public InicializacaoAtributoMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoAtributoMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoAtributoMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoAtributoMatrizContext inicializacaoAtributoMatriz() throws RecognitionException {
		InicializacaoAtributoMatrizContext _localctx = new InicializacaoAtributoMatrizContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inicializacaoAtributoMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(PONTO);
			setState(190);
			match(ID);
			setState(191);
			match(OP_ATRIBUICAO);
			setState(192);
			inicializacaoMatriz();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacaoAtributoArrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode PONTO() { return getToken(PortugolParser.PONTO, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public InicializacaoArrayContext inicializacaoArray() {
			return getRuleContext(InicializacaoArrayContext.class,0);
		}
		public InicializacaoAtributoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoAtributoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoAtributoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoAtributoArrayContext inicializacaoAtributoArray() throws RecognitionException {
		InicializacaoAtributoArrayContext _localctx = new InicializacaoAtributoArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inicializacaoAtributoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(PONTO);
			setState(196);
			match(ID);
			setState(197);
			match(OP_ATRIBUICAO);
			setState(198);
			inicializacaoArray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoArrayContext declaracaoArray() {
			return getRuleContext(DeclaracaoArrayContext.class,0);
		}
		public DeclaracaoMatrizContext declaracaoMatriz() {
			return getRuleContext(DeclaracaoMatrizContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				declaracaoArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				declaracaoMatriz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(206);
				match(OP_ATRIBUICAO);
				setState(207);
				expressao(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoMatrizContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(PortugolParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(PortugolParser.ABRE_COLCHETES, i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(PortugolParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(PortugolParser.FECHA_COLCHETES, i);
		}
		public LinhaMatrizContext linhaMatriz() {
			return getRuleContext(LinhaMatrizContext.class,0);
		}
		public ColunaMatrizContext colunaMatriz() {
			return getRuleContext(ColunaMatrizContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public InicializacaoMatrizContext inicializacaoMatriz() {
			return getRuleContext(InicializacaoMatrizContext.class,0);
		}
		public DeclaracaoMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoMatrizContext declaracaoMatriz() throws RecognitionException {
		DeclaracaoMatrizContext _localctx = new DeclaracaoMatrizContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracaoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(ABRE_COLCHETES);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(212);
				linhaMatriz();
				}
			}

			setState(215);
			match(FECHA_COLCHETES);
			setState(216);
			match(ABRE_COLCHETES);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(217);
				colunaMatriz();
				}
			}

			setState(220);
			match(FECHA_COLCHETES);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(221);
				match(OP_ATRIBUICAO);
				setState(222);
				inicializacaoMatriz();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacaoMatrizContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public List<InicializacaoArrayContext> inicializacaoArray() {
			return getRuleContexts(InicializacaoArrayContext.class);
		}
		public InicializacaoArrayContext inicializacaoArray(int i) {
			return getRuleContext(InicializacaoArrayContext.class,i);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public InicializacaoMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoMatrizContext inicializacaoMatriz() throws RecognitionException {
		InicializacaoMatrizContext _localctx = new InicializacaoMatrizContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inicializacaoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ABRE_CHAVES);
			setState(226);
			inicializacaoArray();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(227);
				match(VIRGULA);
				setState(228);
				inicializacaoArray();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinhaMatrizContext extends ParserRuleContext {
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public LinhaMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linhaMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitLinhaMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaMatrizContext linhaMatriz() throws RecognitionException {
		LinhaMatrizContext _localctx = new LinhaMatrizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_linhaMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			tamanhoArray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColunaMatrizContext extends ParserRuleContext {
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public ColunaMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colunaMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitColunaMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColunaMatrizContext colunaMatriz() throws RecognitionException {
		ColunaMatrizContext _localctx = new ColunaMatrizContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_colunaMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			tamanhoArray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public TamanhoArrayContext tamanhoArray() {
			return getRuleContext(TamanhoArrayContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public InicializacaoArrayContext inicializacaoArray() {
			return getRuleContext(InicializacaoArrayContext.class,0);
		}
		public DeclaracaoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoArrayContext declaracaoArray() throws RecognitionException {
		DeclaracaoArrayContext _localctx = new DeclaracaoArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaracaoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
			setState(241);
			match(ABRE_COLCHETES);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(242);
				tamanhoArray();
				}
			}

			setState(245);
			match(FECHA_COLCHETES);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(246);
				match(OP_ATRIBUICAO);
				setState(247);
				inicializacaoArray();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacaoArrayContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public InicializacaoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoArrayContext inicializacaoArray() throws RecognitionException {
		InicializacaoArrayContext _localctx = new InicializacaoArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inicializacaoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ABRE_CHAVES);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(251);
				listaExpressoes();
				}
			}

			setState(254);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TamanhoArrayContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TamanhoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanhoArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitTamanhoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanhoArrayContext tamanhoArray() throws RecognitionException {
		TamanhoArrayContext _localctx = new TamanhoArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tamanhoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(PortugolParser.FUNCAO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ParametroFuncaoContext parametroFuncao() {
			return getRuleContext(ParametroFuncaoContext.class,0);
		}
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(FUNCAO);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(259);
				match(TIPO);
				}
			}

			setState(262);
			match(ID);
			setState(263);
			parametroFuncao();
			setState(264);
			match(ABRE_CHAVES);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << REGISTRO) | (1L << FACA) | (1L << ENQUANTO) | (1L << PARA) | (1L << SE) | (1L << CONSTANTE) | (1L << ESCOLHA) | (1L << PARE) | (1L << RETORNE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				{
				setState(265);
				comando();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroFuncaoContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ParametroFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroFuncao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametroFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroFuncaoContext parametroFuncao() throws RecognitionException {
		ParametroFuncaoContext _localctx = new ParametroFuncaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametroFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ABRE_PARENTESES);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(274);
				listaParametros();
				}
			}

			setState(277);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			parametro();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(280);
				match(VIRGULA);
				setState(281);
				parametro();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(PortugolParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode E_COMERCIAL() { return getToken(PortugolParser.E_COMERCIAL, 0); }
		public ParametroArrayContext parametroArray() {
			return getRuleContext(ParametroArrayContext.class,0);
		}
		public ParametroMatrizContext parametroMatriz() {
			return getRuleContext(ParametroMatrizContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(TIPO);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E_COMERCIAL) {
				{
				setState(288);
				match(E_COMERCIAL);
				}
			}

			setState(291);
			match(ID);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(292);
				parametroArray();
				}
				break;
			case 2:
				{
				setState(293);
				parametroMatriz();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroArrayContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public ParametroArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametroArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroArrayContext parametroArray() throws RecognitionException {
		ParametroArrayContext _localctx = new ParametroArrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametroArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ABRE_COLCHETES);
			setState(297);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroMatrizContext extends ParserRuleContext {
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(PortugolParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(PortugolParser.ABRE_COLCHETES, i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(PortugolParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(PortugolParser.FECHA_COLCHETES, i);
		}
		public ParametroMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroMatriz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParametroMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroMatrizContext parametroMatriz() throws RecognitionException {
		ParametroMatrizContext _localctx = new ParametroMatrizContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametroMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(ABRE_COLCHETES);
			setState(300);
			match(FECHA_COLCHETES);
			setState(301);
			match(ABRE_COLCHETES);
			setState(302);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public InstanciaRegistroContext instanciaRegistro() {
			return getRuleContext(InstanciaRegistroContext.class,0);
		}
		public DeclaracaoRegistroContext declaracaoRegistro() {
			return getRuleContext(DeclaracaoRegistroContext.class,0);
		}
		public InicializacaoAtributoVariavelContext inicializacaoAtributoVariavel() {
			return getRuleContext(InicializacaoAtributoVariavelContext.class,0);
		}
		public InicializacaoAtributoArrayContext inicializacaoAtributoArray() {
			return getRuleContext(InicializacaoAtributoArrayContext.class,0);
		}
		public InicializacaoAtributoMatrizContext inicializacaoAtributoMatriz() {
			return getRuleContext(InicializacaoAtributoMatrizContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public FacaEnquantoContext facaEnquanto() {
			return getRuleContext(FacaEnquantoContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public EscolhaContext escolha() {
			return getRuleContext(EscolhaContext.class,0);
		}
		public RetorneContext retorne() {
			return getRuleContext(RetorneContext.class,0);
		}
		public PareContext pare() {
			return getRuleContext(PareContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public AtribuicaoCompostaContext atribuicaoComposta() {
			return getRuleContext(AtribuicaoCompostaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comando);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				instanciaRegistro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				declaracaoRegistro();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				inicializacaoAtributoVariavel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				inicializacaoAtributoArray();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				inicializacaoAtributoMatriz();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				se();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				enquanto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(312);
				facaEnquanto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(313);
				para();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(314);
				escolha();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(315);
				retorne();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(316);
				pare();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(317);
				atribuicao();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(318);
				atribuicaoComposta();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(319);
				expressao(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(PortugolParser.OP_ATRIBUICAO, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			expressao(0);
			setState(323);
			match(OP_ATRIBUICAO);
			setState(324);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoCompostaContext extends ParserRuleContext {
		public AtribuicaoCompostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoComposta; }
	 
		public AtribuicaoCompostaContext() { }
		public void copyFrom(AtribuicaoCompostaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaoCompostaSomaContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MAIS_IGUAL() { return getToken(PortugolParser.OP_MAIS_IGUAL, 0); }
		public AtribuicaoCompostaSomaContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaSoma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuicaoCompostaSubtracaoContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MENOS_IGUAL() { return getToken(PortugolParser.OP_MENOS_IGUAL, 0); }
		public AtribuicaoCompostaSubtracaoContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuicaoCompostaMultiplicacaoContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MULTIPLICACAO_IGUAL() { return getToken(PortugolParser.OP_MULTIPLICACAO_IGUAL, 0); }
		public AtribuicaoCompostaMultiplicacaoContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuicaoCompostaDivisaoContext extends AtribuicaoCompostaContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_DIVISAO_IGUAL() { return getToken(PortugolParser.OP_DIVISAO_IGUAL, 0); }
		public AtribuicaoCompostaDivisaoContext(AtribuicaoCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicaoCompostaDivisao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoCompostaContext atribuicaoComposta() throws RecognitionException {
		AtribuicaoCompostaContext _localctx = new AtribuicaoCompostaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atribuicaoComposta);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoCompostaSomaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				expressao(0);
				setState(327);
				match(OP_MAIS_IGUAL);
				setState(328);
				expressao(0);
				}
				break;
			case 2:
				_localctx = new AtribuicaoCompostaSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				expressao(0);
				setState(331);
				match(OP_MENOS_IGUAL);
				setState(332);
				expressao(0);
				}
				break;
			case 3:
				_localctx = new AtribuicaoCompostaMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				expressao(0);
				setState(335);
				match(OP_MULTIPLICACAO_IGUAL);
				setState(336);
				expressao(0);
				}
				break;
			case 4:
				_localctx = new AtribuicaoCompostaDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				expressao(0);
				setState(339);
				match(OP_DIVISAO_IGUAL);
				setState(340);
				expressao(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(PortugolParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorne; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetorneContext retorne() throws RecognitionException {
		RetorneContext _localctx = new RetorneContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(RETORNE);
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(345);
				expressao(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(PortugolParser.SE, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(SE);
			setState(349);
			match(ABRE_PARENTESES);
			setState(350);
			expressao(0);
			setState(351);
			match(FECHA_PARENTESES);
			setState(352);
			listaComandos();
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(353);
				senao();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(PortugolParser.SENAO, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(SENAO);
			setState(357);
			listaComandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(PortugolParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(ENQUANTO);
			setState(360);
			match(ABRE_PARENTESES);
			setState(361);
			expressao(0);
			setState(362);
			match(FECHA_PARENTESES);
			setState(363);
			listaComandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacaEnquantoContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(PortugolParser.FACA, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(PortugolParser.ENQUANTO, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public FacaEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facaEnquanto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitFacaEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacaEnquantoContext facaEnquanto() throws RecognitionException {
		FacaEnquantoContext _localctx = new FacaEnquantoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_facaEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(FACA);
			setState(366);
			listaComandos();
			setState(367);
			match(ENQUANTO);
			setState(368);
			match(ABRE_PARENTESES);
			setState(369);
			expressao(0);
			setState(370);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PortugolParser.PARA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(PortugolParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(PortugolParser.PONTOVIRGULA, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public IncrementoParaContext incrementoPara() {
			return getRuleContext(IncrementoParaContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public InicializacaoParaContext inicializacaoPara() {
			return getRuleContext(InicializacaoParaContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(PARA);
			setState(373);
			match(ABRE_PARENTESES);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << CONSTANTE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_REGISTRO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(374);
				inicializacaoPara();
				}
			}

			setState(377);
			match(PONTOVIRGULA);
			setState(378);
			condicao();
			setState(379);
			match(PONTOVIRGULA);
			setState(380);
			incrementoPara();
			setState(381);
			match(FECHA_PARENTESES);
			setState(382);
			listaComandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaComandosContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVES:
				{
				setState(384);
				match(ABRE_CHAVES);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << REGISTRO) | (1L << FACA) | (1L << ENQUANTO) | (1L << PARA) | (1L << SE) | (1L << CONSTANTE) | (1L << ESCOLHA) | (1L << PARE) | (1L << RETORNE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
					{
					{
					setState(385);
					comando();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				match(FECHA_CHAVES);
				}
				break;
			case ABRE_PARENTESES:
			case TIPO:
			case REGISTRO:
			case FACA:
			case ENQUANTO:
			case PARA:
			case SE:
			case CONSTANTE:
			case ESCOLHA:
			case PARE:
			case RETORNE:
			case OP_NAO:
			case OP_SUBTRACAO:
			case OP_ADICAO:
			case OP_INCREMENTO_UNARIO:
			case OP_DECREMENTO_UNARIO:
			case OP_NOT_BITWISE:
			case LOGICO:
			case CARACTER:
			case STRING:
			case ID:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(392);
				comando();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacaoParaContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ID_REGISTRO() { return getToken(PortugolParser.ID_REGISTRO, 0); }
		public InicializacaoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacaoPara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacaoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoParaContext inicializacaoPara() throws RecognitionException {
		InicializacaoParaContext _localctx = new InicializacaoParaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inicializacaoPara);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				listaDeclaracoes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(ID_REGISTRO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementoParaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoCompostaContext atribuicaoComposta() {
			return getRuleContext(AtribuicaoCompostaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public IncrementoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementoPara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIncrementoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoParaContext incrementoPara() throws RecognitionException {
		IncrementoParaContext _localctx = new IncrementoParaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_incrementoPara);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				atribuicaoComposta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				atribuicao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscolhaContext extends ParserRuleContext {
		public TerminalNode ESCOLHA() { return getToken(PortugolParser.ESCOLHA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ESCOLHA);
			setState(409);
			match(ABRE_PARENTESES);
			setState(410);
			expressao(0);
			setState(411);
			match(FECHA_PARENTESES);
			setState(412);
			match(ABRE_CHAVES);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(413);
				caso();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PortugolParser.CASO, 0); }
		public TerminalNode DOISPONTOS() { return getToken(PortugolParser.DOISPONTOS, 0); }
		public TerminalNode CONTRARIO() { return getToken(PortugolParser.CONTRARIO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public PareContext pare() {
			return getRuleContext(PareContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_caso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(CASO);
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRARIO:
				{
				setState(422);
				match(CONTRARIO);
				}
				break;
			case ABRE_PARENTESES:
			case OP_NAO:
			case OP_SUBTRACAO:
			case OP_ADICAO:
			case OP_INCREMENTO_UNARIO:
			case OP_DECREMENTO_UNARIO:
			case OP_NOT_BITWISE:
			case LOGICO:
			case CARACTER:
			case STRING:
			case ID:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(423);
				expressao(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(426);
			match(DOISPONTOS);
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
			case FECHA_CHAVES:
			case TIPO:
			case REGISTRO:
			case FACA:
			case ENQUANTO:
			case PARA:
			case SE:
			case CONSTANTE:
			case ESCOLHA:
			case CASO:
			case PARE:
			case RETORNE:
			case OP_NAO:
			case OP_SUBTRACAO:
			case OP_ADICAO:
			case OP_INCREMENTO_UNARIO:
			case OP_DECREMENTO_UNARIO:
			case OP_NOT_BITWISE:
			case LOGICO:
			case CARACTER:
			case STRING:
			case ID:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						comando();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case ABRE_CHAVES:
				{
				setState(433);
				match(ABRE_CHAVES);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << REGISTRO) | (1L << FACA) | (1L << ENQUANTO) | (1L << PARA) | (1L << SE) | (1L << CONSTANTE) | (1L << ESCOLHA) | (1L << PARE) | (1L << RETORNE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
					{
					{
					setState(434);
					comando();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(FECHA_CHAVES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(443);
				pare();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PareContext extends ParserRuleContext {
		public TerminalNode PARE() { return getToken(PortugolParser.PARE, 0); }
		public PareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitPare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PareContext pare() throws RecognitionException {
		PareContext _localctx = new PareContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(PARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndiceArrayContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(PortugolParser.ABRE_COLCHETES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_COLCHETES() { return getToken(PortugolParser.FECHA_COLCHETES, 0); }
		public IndiceArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indiceArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIndiceArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndiceArrayContext indiceArray() throws RecognitionException {
		IndiceArrayContext _localctx = new IndiceArrayContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indiceArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(ABRE_COLCHETES);
			setState(449);
			expressao(0);
			setState(450);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaFuncaoContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public ChamadaFuncaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressaoContext {
		public TerminalNode STRING() { return getToken(PortugolParser.STRING, 0); }
		public StringContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegacaoBitwiseContext extends ExpressaoContext {
		public TerminalNode OP_NOT_BITWISE() { return getToken(PortugolParser.OP_NOT_BITWISE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NegacaoBitwiseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNegacaoBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenciaArrayContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public IndiceArrayContext indiceArray() {
			return getRuleContext(IndiceArrayContext.class,0);
		}
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ReferenciaArrayContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitReferenciaArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroRealContext extends ExpressaoContext {
		public TerminalNode REAL() { return getToken(PortugolParser.REAL, 0); }
		public NumeroRealContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNumeroReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaisUnarioContext extends ExpressaoContext {
		public TerminalNode OP_ADICAO() { return getToken(PortugolParser.OP_ADICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MaisUnarioContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitMaisUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoDiferencaContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_DIFERENCA() { return getToken(PortugolParser.OP_DIFERENCA, 0); }
		public OperacaoDiferencaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoDiferenca(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenosUnarioContext extends ExpressaoContext {
		public TerminalNode OP_SUBTRACAO() { return getToken(PortugolParser.OP_SUBTRACAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MenosUnarioContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitMenosUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdicaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_ADICAO() { return getToken(PortugolParser.OP_ADICAO, 0); }
		public AdicaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAdicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoXorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_XOR() { return getToken(PortugolParser.OP_XOR, 0); }
		public OperacaoXorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoXor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoMaiorIgualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MAIOR_IGUAL() { return getToken(PortugolParser.OP_MAIOR_IGUAL, 0); }
		public OperacaoMaiorIgualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMaiorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementoUnarioPrefixadoContext extends ExpressaoContext {
		public TerminalNode OP_DECREMENTO_UNARIO() { return getToken(PortugolParser.OP_DECREMENTO_UNARIO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public DecrementoUnarioPrefixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecrementoUnarioPrefixado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementoUnarioPosfixadoContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode OP_INCREMENTO_UNARIO() { return getToken(PortugolParser.OP_INCREMENTO_UNARIO, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public IncrementoUnarioPosfixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIncrementoUnarioPosfixado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicacaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MULTIPLICACAO() { return getToken(PortugolParser.OP_MULTIPLICACAO, 0); }
		public MultiplicacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoOuLogicoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_OU_LOGICO() { return getToken(PortugolParser.OP_OU_LOGICO, 0); }
		public OperacaoOuLogicoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoOuLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoIgualdadeContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_IGUALDADE() { return getToken(PortugolParser.OP_IGUALDADE, 0); }
		public OperacaoIgualdadeContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoShiftRightContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_SHIFT_RIGHT() { return getToken(PortugolParser.OP_SHIFT_RIGHT, 0); }
		public OperacaoShiftRightContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoShiftRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_DIVISAO() { return getToken(PortugolParser.OP_DIVISAO, 0); }
		public DivisaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDivisao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressaoEntreParentesesContext extends ExpressaoContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PortugolParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PortugolParser.FECHA_PARENTESES, 0); }
		public ExpressaoEntreParentesesContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitExpressaoEntreParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoMenorIgualContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MENOR_IGUAL() { return getToken(PortugolParser.OP_MENOR_IGUAL, 0); }
		public OperacaoMenorIgualContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenciaMatrizContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ReferenciaMatrizContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitReferenciaMatriz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoMaiorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MAIOR() { return getToken(PortugolParser.OP_MAIOR, 0); }
		public OperacaoMaiorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroInteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(PortugolParser.INT, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(PortugolParser.HEXADECIMAL, 0); }
		public NumeroInteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNumeroInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaracterContext extends ExpressaoContext {
		public TerminalNode CARACTER() { return getToken(PortugolParser.CARACTER, 0); }
		public CaracterContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCaracter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenciaParaVariavelContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public EscopoBibliotecaContext escopoBiblioteca() {
			return getRuleContext(EscopoBibliotecaContext.class,0);
		}
		public ReferenciaParaVariavelContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitReferenciaParaVariavel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorLogicoContext extends ExpressaoContext {
		public TerminalNode LOGICO() { return getToken(PortugolParser.LOGICO, 0); }
		public ValorLogicoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitValorLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoMenorContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MENOR() { return getToken(PortugolParser.OP_MENOR, 0); }
		public OperacaoMenorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoShiftLeftContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_SHIFT_LEFT() { return getToken(PortugolParser.OP_SHIFT_LEFT, 0); }
		public OperacaoShiftLeftContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoShiftLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementoUnarioPrefixadoContext extends ExpressaoContext {
		public TerminalNode OP_INCREMENTO_UNARIO() { return getToken(PortugolParser.OP_INCREMENTO_UNARIO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public IncrementoUnarioPrefixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitIncrementoUnarioPrefixado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoELogicoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_E_LOGICO() { return getToken(PortugolParser.OP_E_LOGICO, 0); }
		public OperacaoELogicoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoELogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementoUnarioPosfixadoContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode OP_DECREMENTO_UNARIO() { return getToken(PortugolParser.OP_DECREMENTO_UNARIO, 0); }
		public List<IndiceArrayContext> indiceArray() {
			return getRuleContexts(IndiceArrayContext.class);
		}
		public IndiceArrayContext indiceArray(int i) {
			return getRuleContext(IndiceArrayContext.class,i);
		}
		public DecrementoUnarioPosfixadoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecrementoUnarioPosfixado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoOrBitwiseContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_OU_BITWISE() { return getToken(PortugolParser.OP_OU_BITWISE, 0); }
		public OperacaoOrBitwiseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoOrBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_MOD() { return getToken(PortugolParser.OP_MOD, 0); }
		public ModuloContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtracaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OP_SUBTRACAO() { return getToken(PortugolParser.OP_SUBTRACAO, 0); }
		public SubtracaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegacaoContext extends ExpressaoContext {
		public TerminalNode OP_NAO() { return getToken(PortugolParser.OP_NAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NegacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitNegacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacaoAndBitwiseContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode E_COMERCIAL() { return getToken(PortugolParser.E_COMERCIAL, 0); }
		public OperacaoAndBitwiseContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperacaoAndBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new ChamadaFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(453);
					escopoBiblioteca();
					}
					break;
				}
				setState(456);
				match(ID);
				setState(457);
				match(ABRE_PARENTESES);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
					{
					setState(458);
					listaExpressoes();
					}
				}

				setState(461);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				_localctx = new ReferenciaArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(462);
					escopoBiblioteca();
					}
					break;
				}
				setState(465);
				match(ID);
				setState(466);
				indiceArray();
				}
				break;
			case 3:
				{
				_localctx = new ReferenciaMatrizContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(467);
					escopoBiblioteca();
					}
					break;
				}
				setState(470);
				match(ID);
				setState(471);
				indiceArray();
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(472);
					indiceArray();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new MenosUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				match(OP_SUBTRACAO);
				setState(476);
				expressao(33);
				}
				break;
			case 5:
				{
				_localctx = new MaisUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(477);
				match(OP_ADICAO);
				setState(478);
				expressao(32);
				}
				break;
			case 6:
				{
				_localctx = new NegacaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(479);
				match(OP_NAO);
				setState(480);
				expressao(31);
				}
				break;
			case 7:
				{
				_localctx = new NegacaoBitwiseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481);
				match(OP_NOT_BITWISE);
				setState(482);
				expressao(30);
				}
				break;
			case 8:
				{
				_localctx = new IncrementoUnarioPosfixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				match(ID);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_COLCHETES) {
					{
					setState(484);
					indiceArray();
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABRE_COLCHETES) {
						{
						setState(485);
						indiceArray();
						}
					}

					}
				}

				setState(490);
				match(OP_INCREMENTO_UNARIO);
				}
				break;
			case 9:
				{
				_localctx = new DecrementoUnarioPosfixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491);
				match(ID);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_COLCHETES) {
					{
					setState(492);
					indiceArray();
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABRE_COLCHETES) {
						{
						setState(493);
						indiceArray();
						}
					}

					}
				}

				setState(498);
				match(OP_DECREMENTO_UNARIO);
				}
				break;
			case 10:
				{
				_localctx = new IncrementoUnarioPrefixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(OP_INCREMENTO_UNARIO);
				setState(500);
				match(ID);
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(501);
					indiceArray();
					setState(503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(502);
						indiceArray();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new DecrementoUnarioPrefixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				match(OP_DECREMENTO_UNARIO);
				setState(508);
				match(ID);
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(509);
					indiceArray();
					setState(511);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(510);
						indiceArray();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new ReferenciaParaVariavelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(515);
					escopoBiblioteca();
					}
					break;
				}
				setState(518);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new NumeroInteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==HEXADECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 14:
				{
				_localctx = new NumeroRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
				match(REAL);
				}
				break;
			case 15:
				{
				_localctx = new ValorLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(521);
				match(LOGICO);
				}
				break;
			case 16:
				{
				_localctx = new CaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				match(CARACTER);
				}
				break;
			case 17:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				match(STRING);
				}
				break;
			case 18:
				{
				_localctx = new ExpressaoEntreParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524);
				match(ABRE_PARENTESES);
				setState(525);
				expressao(0);
				setState(526);
				match(FECHA_PARENTESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(530);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(531);
						match(OP_MULTIPLICACAO);
						setState(532);
						expressao(26);
						}
						break;
					case 2:
						{
						_localctx = new DivisaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(533);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(534);
						match(OP_DIVISAO);
						setState(535);
						expressao(25);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(536);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(537);
						match(OP_MOD);
						setState(538);
						expressao(24);
						}
						break;
					case 4:
						{
						_localctx = new AdicaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(539);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(540);
						match(OP_ADICAO);
						setState(541);
						expressao(23);
						}
						break;
					case 5:
						{
						_localctx = new SubtracaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(542);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(543);
						match(OP_SUBTRACAO);
						setState(544);
						expressao(22);
						}
						break;
					case 6:
						{
						_localctx = new OperacaoIgualdadeContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(545);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(546);
						match(OP_IGUALDADE);
						setState(547);
						expressao(21);
						}
						break;
					case 7:
						{
						_localctx = new OperacaoDiferencaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(548);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(549);
						match(OP_DIFERENCA);
						setState(550);
						expressao(20);
						}
						break;
					case 8:
						{
						_localctx = new OperacaoMaiorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(551);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(552);
						match(OP_MAIOR);
						setState(553);
						expressao(19);
						}
						break;
					case 9:
						{
						_localctx = new OperacaoMenorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(554);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(555);
						match(OP_MENOR);
						setState(556);
						expressao(18);
						}
						break;
					case 10:
						{
						_localctx = new OperacaoMenorIgualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(557);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(558);
						match(OP_MENOR_IGUAL);
						setState(559);
						expressao(17);
						}
						break;
					case 11:
						{
						_localctx = new OperacaoMaiorIgualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(560);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(561);
						match(OP_MAIOR_IGUAL);
						setState(562);
						expressao(16);
						}
						break;
					case 12:
						{
						_localctx = new OperacaoELogicoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(563);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(564);
						match(OP_E_LOGICO);
						setState(565);
						expressao(15);
						}
						break;
					case 13:
						{
						_localctx = new OperacaoOuLogicoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(566);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(567);
						match(OP_OU_LOGICO);
						setState(568);
						expressao(14);
						}
						break;
					case 14:
						{
						_localctx = new OperacaoXorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(569);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(570);
						match(OP_XOR);
						setState(571);
						expressao(13);
						}
						break;
					case 15:
						{
						_localctx = new OperacaoShiftLeftContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(572);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(573);
						match(OP_SHIFT_LEFT);
						setState(574);
						expressao(12);
						}
						break;
					case 16:
						{
						_localctx = new OperacaoShiftRightContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(575);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(576);
						match(OP_SHIFT_RIGHT);
						setState(577);
						expressao(11);
						}
						break;
					case 17:
						{
						_localctx = new OperacaoAndBitwiseContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(578);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(579);
						match(E_COMERCIAL);
						setState(580);
						expressao(10);
						}
						break;
					case 18:
						{
						_localctx = new OperacaoOrBitwiseContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(581);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(582);
						match(OP_OU_BITWISE);
						setState(583);
						expressao(9);
						}
						break;
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListaExpressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<AtribuicaoCompostaContext> atribuicaoComposta() {
			return getRuleContexts(AtribuicaoCompostaContext.class);
		}
		public AtribuicaoCompostaContext atribuicaoComposta(int i) {
			return getRuleContext(AtribuicaoCompostaContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(PortugolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(PortugolParser.VIRGULA, i);
		}
		public ListaExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressoes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitListaExpressoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressoesContext listaExpressoes() throws RecognitionException {
		ListaExpressoesContext _localctx = new ListaExpressoesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_listaExpressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(589);
				expressao(0);
				}
				break;
			case 2:
				{
				setState(590);
				atribuicaoComposta();
				}
				break;
			case 3:
				{
				setState(591);
				atribuicao();
				}
				break;
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(594);
				match(VIRGULA);
				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(595);
					expressao(0);
					}
					break;
				case 2:
					{
					setState(596);
					atribuicaoComposta();
					}
					break;
				case 3:
					{
					setState(597);
					atribuicao();
					}
					break;
				}
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscopoBibliotecaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode PONTO() { return getToken(PortugolParser.PONTO, 0); }
		public EscopoBibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoBiblioteca; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEscopoBiblioteca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoBibliotecaContext escopoBiblioteca() throws RecognitionException {
		EscopoBibliotecaContext _localctx = new EscopoBibliotecaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_escopoBiblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(605);
			match(ID);
			setState(606);
			match(PONTO);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 25);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 9);
		case 17:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0263\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\7\2f\n\2\f\2\16"+
		"\2i\13\2\3\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\5\3z\n\3\3\4\5\4}\n\4\3\4\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4\u0086"+
		"\13\4\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\6\3\6\3\6\5"+
		"\6\u0094\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u009b\n\b\3\b\3\b\3\b\5\b\u00a0\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00af"+
		"\n\n\f\n\16\n\u00b2\13\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\5\17\u00ce\n\17\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\5\21\u00d8"+
		"\n\21\3\21\3\21\3\21\5\21\u00dd\n\21\3\21\3\21\3\21\5\21\u00e2\n\21\3"+
		"\22\3\22\3\22\3\22\7\22\u00e8\n\22\f\22\16\22\u00eb\13\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u00f6\n\25\3\25\3\25\3\25\5\25"+
		"\u00fb\n\25\3\26\3\26\5\26\u00ff\n\26\3\26\3\26\3\27\3\27\3\30\3\30\5"+
		"\30\u0107\n\30\3\30\3\30\3\30\3\30\7\30\u010d\n\30\f\30\16\30\u0110\13"+
		"\30\3\30\3\30\3\31\3\31\5\31\u0116\n\31\3\31\3\31\3\32\3\32\3\32\7\32"+
		"\u011d\n\32\f\32\16\32\u0120\13\32\3\33\3\33\5\33\u0124\n\33\3\33\3\33"+
		"\3\33\5\33\u0129\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0143\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \5 \u0159\n \3!\3!\5!\u015d\n!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0165\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\5&\u017a\n&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u0185\n\'\f\'\16\'\u0188"+
		"\13\'\3\'\3\'\5\'\u018c\n\'\3(\3(\3(\3(\5(\u0192\n(\3)\3)\3*\3*\3*\5*"+
		"\u0199\n*\3+\3+\3+\3+\3+\3+\7+\u01a1\n+\f+\16+\u01a4\13+\3+\3+\3,\3,\3"+
		",\5,\u01ab\n,\3,\3,\7,\u01af\n,\f,\16,\u01b2\13,\3,\3,\7,\u01b6\n,\f,"+
		"\16,\u01b9\13,\3,\5,\u01bc\n,\3,\5,\u01bf\n,\3-\3-\3.\3.\3.\3.\3/\3/\5"+
		"/\u01c9\n/\3/\3/\3/\5/\u01ce\n/\3/\3/\5/\u01d2\n/\3/\3/\3/\5/\u01d7\n"+
		"/\3/\3/\3/\5/\u01dc\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01e9\n/\5"+
		"/\u01eb\n/\3/\3/\3/\3/\5/\u01f1\n/\5/\u01f3\n/\3/\3/\3/\3/\3/\5/\u01fa"+
		"\n/\5/\u01fc\n/\3/\3/\3/\3/\5/\u0202\n/\5/\u0204\n/\3/\5/\u0207\n/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0213\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u024b"+
		"\n/\f/\16/\u024e\13/\3\60\3\60\3\60\5\60\u0253\n\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0259\n\60\7\60\u025b\n\60\f\60\16\60\u025e\13\60\3\61\3\61\3\61"+
		"\3\61\2\3\\\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`\2\3\3\2?@\2\u02a9\2b\3\2\2\2\4t\3\2\2\2\6|\3"+
		"\2\2\2\b\u0087\3\2\2\2\n\u0093\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2"+
		"\2\20\u00a3\3\2\2\2\22\u00aa\3\2\2\2\24\u00b5\3\2\2\2\26\u00b8\3\2\2\2"+
		"\30\u00be\3\2\2\2\32\u00c4\3\2\2\2\34\u00cd\3\2\2\2\36\u00cf\3\2\2\2 "+
		"\u00d4\3\2\2\2\"\u00e3\3\2\2\2$\u00ee\3\2\2\2&\u00f0\3\2\2\2(\u00f2\3"+
		"\2\2\2*\u00fc\3\2\2\2,\u0102\3\2\2\2.\u0104\3\2\2\2\60\u0113\3\2\2\2\62"+
		"\u0119\3\2\2\2\64\u0121\3\2\2\2\66\u012a\3\2\2\28\u012d\3\2\2\2:\u0142"+
		"\3\2\2\2<\u0144\3\2\2\2>\u0158\3\2\2\2@\u015a\3\2\2\2B\u015e\3\2\2\2D"+
		"\u0166\3\2\2\2F\u0169\3\2\2\2H\u016f\3\2\2\2J\u0176\3\2\2\2L\u018b\3\2"+
		"\2\2N\u0191\3\2\2\2P\u0193\3\2\2\2R\u0198\3\2\2\2T\u019a\3\2\2\2V\u01a7"+
		"\3\2\2\2X\u01c0\3\2\2\2Z\u01c2\3\2\2\2\\\u0212\3\2\2\2^\u0252\3\2\2\2"+
		"`\u025f\3\2\2\2bc\7\22\2\2cg\7\7\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2ho\3\2\2\2ig\3\2\2\2jn\5\22\n\2kn\5.\30\2ln\5\6\4\2mj"+
		"\3\2\2\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2q"+
		"o\3\2\2\2rs\7\b\2\2s\3\3\2\2\2tu\7\30\2\2uv\7\31\2\2vy\7;\2\2wx\7\60\2"+
		"\2xz\7;\2\2yw\3\2\2\2yz\3\2\2\2z\5\3\2\2\2{}\7\20\2\2|{\3\2\2\2|}\3\2"+
		"\2\2}~\3\2\2\2~\177\7\t\2\2\177\u0084\5\34\17\2\u0080\u0081\7E\2\2\u0081"+
		"\u0083\5\34\17\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\7\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7\t\2\2\u0088\u008d\5\n\6\2\u0089\u008a\7E\2\2\u008a\u008c\5\n\6\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\t\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\5\f\7\2\u0091\u0094"+
		"\5\20\t\2\u0092\u0094\5\16\b\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0092\3\2\2\2\u0094\13\3\2\2\2\u0095\u0096\7;\2\2\u0096\r\3\2\2"+
		"\2\u0097\u0098\7;\2\2\u0098\u009a\7\5\2\2\u0099\u009b\5$\23\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\6\2\2\u009d"+
		"\u009f\7\5\2\2\u009e\u00a0\5&\24\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\17\3\2\2\2\u00a3\u00a4"+
		"\7;\2\2\u00a4\u00a6\7\5\2\2\u00a5\u00a7\5,\27\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9\21\3\2\2"+
		"\2\u00aa\u00ab\7\n\2\2\u00ab\u00ac\7;\2\2\u00ac\u00b0\7\7\2\2\u00ad\u00af"+
		"\5\b\5\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\b"+
		"\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7;\2\2\u00b6\u00b7\7;\2\2\u00b7\25\3"+
		"\2\2\2\u00b8\u00b9\7;\2\2\u00b9\u00ba\7D\2\2\u00ba\u00bb\7;\2\2\u00bb"+
		"\u00bc\7\"\2\2\u00bc\u00bd\5\\/\2\u00bd\27\3\2\2\2\u00be\u00bf\7;\2\2"+
		"\u00bf\u00c0\7D\2\2\u00c0\u00c1\7;\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3"+
		"\5\"\22\2\u00c3\31\3\2\2\2\u00c4\u00c5\7;\2\2\u00c5\u00c6\7D\2\2\u00c6"+
		"\u00c7\7;\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\5*\26\2\u00c9\33\3\2\2\2"+
		"\u00ca\u00ce\5\36\20\2\u00cb\u00ce\5(\25\2\u00cc\u00ce\5 \21\2\u00cd\u00ca"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\35\3\2\2\2\u00cf"+
		"\u00d2\7;\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d3\5\\/\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7;\2\2\u00d5\u00d7"+
		"\7\5\2\2\u00d6\u00d8\5$\23\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\7\6\2\2\u00da\u00dc\7\5\2\2\u00db\u00dd\5&"+
		"\24\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e1\7\6\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e2\5\"\22\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e9"+
		"\5*\26\2\u00e5\u00e6\7E\2\2\u00e6\u00e8\5*\26\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\b\2\2\u00ed#\3\2\2\2\u00ee\u00ef"+
		"\5,\27\2\u00ef%\3\2\2\2\u00f0\u00f1\5,\27\2\u00f1\'\3\2\2\2\u00f2\u00f3"+
		"\7;\2\2\u00f3\u00f5\7\5\2\2\u00f4\u00f6\5,\27\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\7\6\2\2\u00f8\u00f9\7\""+
		"\2\2\u00f9\u00fb\5*\26\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		")\3\2\2\2\u00fc\u00fe\7\7\2\2\u00fd\u00ff\5^\60\2\u00fe\u00fd\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\b\2\2\u0101+\3"+
		"\2\2\2\u0102\u0103\5\\/\2\u0103-\3\2\2\2\u0104\u0106\7\21\2\2\u0105\u0107"+
		"\7\t\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\7;\2\2\u0109\u010a\5\60\31\2\u010a\u010e\7\7\2\2\u010b\u010d\5"+
		":\36\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\b"+
		"\2\2\u0112/\3\2\2\2\u0113\u0115\7\3\2\2\u0114\u0116\5\62\32\2\u0115\u0114"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\4\2\2\u0118"+
		"\61\3\2\2\2\u0119\u011e\5\64\33\2\u011a\u011b\7E\2\2\u011b\u011d\5\64"+
		"\33\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\63\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\t\2"+
		"\2\u0122\u0124\7\61\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0128\7;\2\2\u0126\u0129\5\66\34\2\u0127\u0129\5"+
		"8\35\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\65\3\2\2\2\u012a\u012b\7\5\2\2\u012b\u012c\7\6\2\2\u012c\67\3\2\2\2\u012d"+
		"\u012e\7\5\2\2\u012e\u012f\7\6\2\2\u012f\u0130\7\5\2\2\u0130\u0131\7\6"+
		"\2\2\u01319\3\2\2\2\u0132\u0143\5\6\4\2\u0133\u0143\5\24\13\2\u0134\u0143"+
		"\5\22\n\2\u0135\u0143\5\26\f\2\u0136\u0143\5\32\16\2\u0137\u0143\5\30"+
		"\r\2\u0138\u0143\5B\"\2\u0139\u0143\5F$\2\u013a\u0143\5H%\2\u013b\u0143"+
		"\5J&\2\u013c\u0143\5T+\2\u013d\u0143\5@!\2\u013e\u0143\5X-\2\u013f\u0143"+
		"\5<\37\2\u0140\u0143\5> \2\u0141\u0143\5\\/\2\u0142\u0132\3\2\2\2\u0142"+
		"\u0133\3\2\2\2\u0142\u0134\3\2\2\2\u0142\u0135\3\2\2\2\u0142\u0136\3\2"+
		"\2\2\u0142\u0137\3\2\2\2\u0142\u0138\3\2\2\2\u0142\u0139\3\2\2\2\u0142"+
		"\u013a\3\2\2\2\u0142\u013b\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2"+
		"\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143;\3\2\2\2\u0144\u0145\5\\/\2\u0145\u0146\7\"\2\2\u0146"+
		"\u0147\5\\/\2\u0147=\3\2\2\2\u0148\u0149\5\\/\2\u0149\u014a\7\62\2\2\u014a"+
		"\u014b\5\\/\2\u014b\u0159\3\2\2\2\u014c\u014d\5\\/\2\u014d\u014e\7\63"+
		"\2\2\u014e\u014f\5\\/\2\u014f\u0159\3\2\2\2\u0150\u0151\5\\/\2\u0151\u0152"+
		"\7\64\2\2\u0152\u0153\5\\/\2\u0153\u0159\3\2\2\2\u0154\u0155\5\\/\2\u0155"+
		"\u0156\7\65\2\2\u0156\u0157\5\\/\2\u0157\u0159\3\2\2\2\u0158\u0148\3\2"+
		"\2\2\u0158\u014c\3\2\2\2\u0158\u0150\3\2\2\2\u0158\u0154\3\2\2\2\u0159"+
		"?\3\2\2\2\u015a\u015c\7\27\2\2\u015b\u015d\5\\/\2\u015c\u015b\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015dA\3\2\2\2\u015e\u015f\7\16\2\2\u015f\u0160\7"+
		"\3\2\2\u0160\u0161\5\\/\2\u0161\u0162\7\4\2\2\u0162\u0164\5L\'\2\u0163"+
		"\u0165\5D#\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165C\3\2\2\2\u0166"+
		"\u0167\7\17\2\2\u0167\u0168\5L\'\2\u0168E\3\2\2\2\u0169\u016a\7\f\2\2"+
		"\u016a\u016b\7\3\2\2\u016b\u016c\5\\/\2\u016c\u016d\7\4\2\2\u016d\u016e"+
		"\5L\'\2\u016eG\3\2\2\2\u016f\u0170\7\13\2\2\u0170\u0171\5L\'\2\u0171\u0172"+
		"\7\f\2\2\u0172\u0173\7\3\2\2\u0173\u0174\5\\/\2\u0174\u0175\7\4\2\2\u0175"+
		"I\3\2\2\2\u0176\u0177\7\r\2\2\u0177\u0179\7\3\2\2\u0178\u017a\5N(\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7F"+
		"\2\2\u017c\u017d\5P)\2\u017d\u017e\7F\2\2\u017e\u017f\5R*\2\u017f\u0180"+
		"\7\4\2\2\u0180\u0181\5L\'\2\u0181K\3\2\2\2\u0182\u0186\7\7\2\2\u0183\u0185"+
		"\5:\36\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018c\7\b"+
		"\2\2\u018a\u018c\5:\36\2\u018b\u0182\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"M\3\2\2\2\u018d\u0192\5<\37\2\u018e\u0192\5\6\4\2\u018f\u0192\7;\2\2\u0190"+
		"\u0192\7<\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0190\3\2\2\2\u0192O\3\2\2\2\u0193\u0194\5\\/\2\u0194Q\3\2"+
		"\2\2\u0195\u0199\5\\/\2\u0196\u0199\5> \2\u0197\u0199\5<\37\2\u0198\u0195"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199S\3\2\2\2\u019a"+
		"\u019b\7\23\2\2\u019b\u019c\7\3\2\2\u019c\u019d\5\\/\2\u019d\u019e\7\4"+
		"\2\2\u019e\u01a2\7\7\2\2\u019f\u01a1\5V,\2\u01a0\u019f\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\7\b\2\2\u01a6U\3\2\2\2\u01a7\u01aa\7\24\2\2"+
		"\u01a8\u01ab\7\25\2\2\u01a9\u01ab\5\\/\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01bb\7G\2\2\u01ad\u01af\5:\36\2\u01ae"+
		"\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01bc\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b7\7\7\2\2\u01b4"+
		"\u01b6\5:\36\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bc\7\b\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01bf\5X-\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfW"+
		"\3\2\2\2\u01c0\u01c1\7\26\2\2\u01c1Y\3\2\2\2\u01c2\u01c3\7\5\2\2\u01c3"+
		"\u01c4\5\\/\2\u01c4\u01c5\7\6\2\2\u01c5[\3\2\2\2\u01c6\u01c8\b/\1\2\u01c7"+
		"\u01c9\5`\61\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cb\7;\2\2\u01cb\u01cd\7\3\2\2\u01cc\u01ce\5^\60\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u0213\7\4"+
		"\2\2\u01d0\u01d2\5`\61\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\7;\2\2\u01d4\u0213\5Z.\2\u01d5\u01d7\5`\61"+
		"\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\7;\2\2\u01d9\u01db\5Z.\2\u01da\u01dc\5Z.\2\u01db\u01da\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u0213\3\2\2\2\u01dd\u01de\7\35\2\2\u01de\u0213\5"+
		"\\/#\u01df\u01e0\7\36\2\2\u01e0\u0213\5\\/\"\u01e1\u01e2\7\32\2\2\u01e2"+
		"\u0213\5\\/!\u01e3\u01e4\7/\2\2\u01e4\u0213\5\\/ \u01e5\u01ea\7;\2\2\u01e6"+
		"\u01e8\5Z.\2\u01e7\u01e9\5Z.\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2"+
		"\u01e9\u01eb\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u0213\7)\2\2\u01ed\u01f2\7;\2\2\u01ee\u01f0\5Z.\2\u01ef"+
		"\u01f1\5Z.\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2"+
		"\2\u01f2\u01ee\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u0213"+
		"\7*\2\2\u01f5\u01f6\7)\2\2\u01f6\u01fb\7;\2\2\u01f7\u01f9\5Z.\2\u01f8"+
		"\u01fa\5Z.\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2"+
		"\2\u01fb\u01f7\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0213\3\2\2\2\u01fd\u01fe"+
		"\7*\2\2\u01fe\u0203\7;\2\2\u01ff\u0201\5Z.\2\u0200\u0202\5Z.\2\u0201\u0200"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01ff\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0213\3\2\2\2\u0205\u0207\5`\61\2\u0206\u0205\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0213\7;\2\2\u0209"+
		"\u0213\t\2\2\2\u020a\u0213\7>\2\2\u020b\u0213\7\66\2\2\u020c\u0213\79"+
		"\2\2\u020d\u0213\7:\2\2\u020e\u020f\7\3\2\2\u020f\u0210\5\\/\2\u0210\u0211"+
		"\7\4\2\2\u0211\u0213\3\2\2\2\u0212\u01c6\3\2\2\2\u0212\u01d1\3\2\2\2\u0212"+
		"\u01d6\3\2\2\2\u0212\u01dd\3\2\2\2\u0212\u01df\3\2\2\2\u0212\u01e1\3\2"+
		"\2\2\u0212\u01e3\3\2\2\2\u0212\u01e5\3\2\2\2\u0212\u01ed\3\2\2\2\u0212"+
		"\u01f5\3\2\2\2\u0212\u01fd\3\2\2\2\u0212\u0206\3\2\2\2\u0212\u0209\3\2"+
		"\2\2\u0212\u020a\3\2\2\2\u0212\u020b\3\2\2\2\u0212\u020c\3\2\2\2\u0212"+
		"\u020d\3\2\2\2\u0212\u020e\3\2\2\2\u0213\u024c\3\2\2\2\u0214\u0215\f\33"+
		"\2\2\u0215\u0216\7\37\2\2\u0216\u024b\5\\/\34\u0217\u0218\f\32\2\2\u0218"+
		"\u0219\7 \2\2\u0219\u024b\5\\/\33\u021a\u021b\f\31\2\2\u021b\u021c\7!"+
		"\2\2\u021c\u024b\5\\/\32\u021d\u021e\f\30\2\2\u021e\u021f\7\36\2\2\u021f"+
		"\u024b\5\\/\31\u0220\u0221\f\27\2\2\u0221\u0222\7\35\2\2\u0222\u024b\5"+
		"\\/\30\u0223\u0224\f\26\2\2\u0224\u0225\7#\2\2\u0225\u024b\5\\/\27\u0226"+
		"\u0227\f\25\2\2\u0227\u0228\7$\2\2\u0228\u024b\5\\/\26\u0229\u022a\f\24"+
		"\2\2\u022a\u022b\7%\2\2\u022b\u024b\5\\/\25\u022c\u022d\f\23\2\2\u022d"+
		"\u022e\7&\2\2\u022e\u024b\5\\/\24\u022f\u0230\f\22\2\2\u0230\u0231\7\'"+
		"\2\2\u0231\u024b\5\\/\23\u0232\u0233\f\21\2\2\u0233\u0234\7(\2\2\u0234"+
		"\u024b\5\\/\22\u0235\u0236\f\20\2\2\u0236\u0237\7\33\2\2\u0237\u024b\5"+
		"\\/\21\u0238\u0239\f\17\2\2\u0239\u023a\7\34\2\2\u023a\u024b\5\\/\20\u023b"+
		"\u023c\f\16\2\2\u023c\u023d\7-\2\2\u023d\u024b\5\\/\17\u023e\u023f\f\r"+
		"\2\2\u023f\u0240\7+\2\2\u0240\u024b\5\\/\16\u0241\u0242\f\f\2\2\u0242"+
		"\u0243\7,\2\2\u0243\u024b\5\\/\r\u0244\u0245\f\13\2\2\u0245\u0246\7\61"+
		"\2\2\u0246\u024b\5\\/\f\u0247\u0248\f\n\2\2\u0248\u0249\7.\2\2\u0249\u024b"+
		"\5\\/\13\u024a\u0214\3\2\2\2\u024a\u0217\3\2\2\2\u024a\u021a\3\2\2\2\u024a"+
		"\u021d\3\2\2\2\u024a\u0220\3\2\2\2\u024a\u0223\3\2\2\2\u024a\u0226\3\2"+
		"\2\2\u024a\u0229\3\2\2\2\u024a\u022c\3\2\2\2\u024a\u022f\3\2\2\2\u024a"+
		"\u0232\3\2\2\2\u024a\u0235\3\2\2\2\u024a\u0238\3\2\2\2\u024a\u023b\3\2"+
		"\2\2\u024a\u023e\3\2\2\2\u024a\u0241\3\2\2\2\u024a\u0244\3\2\2\2\u024a"+
		"\u0247\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d]\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0253\5\\/\2\u0250\u0253"+
		"\5> \2\u0251\u0253\5<\37\2\u0252\u024f\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0251\3\2\2\2\u0253\u025c\3\2\2\2\u0254\u0258\7E\2\2\u0255\u0259\5\\"+
		"/\2\u0256\u0259\5> \2\u0257\u0259\5<\37\2\u0258\u0255\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0257\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0254\3\2\2\2\u025b"+
		"\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d_\3\2\2\2"+
		"\u025e\u025c\3\2\2\2\u025f\u0260\7;\2\2\u0260\u0261\7D\2\2\u0261a\3\2"+
		"\2\2@gmoy|\u0084\u008d\u0093\u009a\u009f\u00a6\u00b0\u00cd\u00d2\u00d7"+
		"\u00dc\u00e1\u00e9\u00f5\u00fa\u00fe\u0106\u010e\u0115\u011e\u0123\u0128"+
		"\u0142\u0158\u015c\u0164\u0179\u0186\u018b\u0191\u0198\u01a2\u01aa\u01b0"+
		"\u01b7\u01bb\u01be\u01c8\u01cd\u01d1\u01d6\u01db\u01e8\u01ea\u01f0\u01f2"+
		"\u01f9\u01fb\u0201\u0203\u0206\u0212\u024a\u024c\u0252\u0258\u025c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}