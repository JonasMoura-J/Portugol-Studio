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
		STRING=56, ID=57, ID_COMPOSTO=58, REAL=59, INT=60, HEXADECIMAL=61, COMENTARIO=62, 
		COMENTARIO_SIMPLES=63, WS=64, PONTO=65, VIRGULA=66, PONTOVIRGULA=67, DOISPONTOS=68;
	public static final int
		RULE_arquivo = 0, RULE_inclusaoBiblioteca = 1, RULE_listaDeclaracoes = 2, 
		RULE_declaracaoRegistro = 3, RULE_instanciaRegistro = 4, RULE_id = 5, 
		RULE_declaracao = 6, RULE_declaracaoVariavel = 7, RULE_declaracaoMatriz = 8, 
		RULE_inicializacaoMatriz = 9, RULE_linhaMatriz = 10, RULE_colunaMatriz = 11, 
		RULE_declaracaoArray = 12, RULE_inicializacaoArray = 13, RULE_tamanhoArray = 14, 
		RULE_declaracaoFuncao = 15, RULE_parametroFuncao = 16, RULE_listaParametros = 17, 
		RULE_parametro = 18, RULE_parametroArray = 19, RULE_parametroMatriz = 20, 
		RULE_comando = 21, RULE_atribuicao = 22, RULE_atribuicaoComposta = 23, 
		RULE_retorne = 24, RULE_se = 25, RULE_senao = 26, RULE_enquanto = 27, 
		RULE_facaEnquanto = 28, RULE_para = 29, RULE_listaComandos = 30, RULE_inicializacaoPara = 31, 
		RULE_condicao = 32, RULE_incrementoPara = 33, RULE_escolha = 34, RULE_caso = 35, 
		RULE_pare = 36, RULE_indiceArray = 37, RULE_expressao = 38, RULE_listaExpressoes = 39, 
		RULE_escopoBiblioteca = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"arquivo", "inclusaoBiblioteca", "listaDeclaracoes", "declaracaoRegistro", 
			"instanciaRegistro", "id", "declaracao", "declaracaoVariavel", "declaracaoMatriz", 
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
			null, null, null, null, null, null, "'.'", "','", "';'", "':'"
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
			"LOGICO", "VERDADEIRO", "FALSO", "CARACTER", "STRING", "ID", "ID_COMPOSTO", 
			"REAL", "INT", "HEXADECIMAL", "COMENTARIO", "COMENTARIO_SIMPLES", "WS", 
			"PONTO", "VIRGULA", "PONTOVIRGULA", "DOISPONTOS"
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
			setState(82);
			match(PROGRAMA);
			setState(83);
			match(ABRE_CHAVES);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(84);
				inclusaoBiblioteca();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << REGISTRO) | (1L << CONSTANTE) | (1L << FUNCAO))) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REGISTRO:
					{
					setState(90);
					declaracaoRegistro();
					}
					break;
				case FUNCAO:
					{
					setState(91);
					declaracaoFuncao();
					}
					break;
				case TIPO:
				case CONSTANTE:
					{
					setState(92);
					listaDeclaracoes();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(100);
			match(INCLUA);
			setState(101);
			match(BIBLIOTECA);
			setState(102);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ALIAS_BIBLIOTECA) {
				{
				setState(103);
				match(OP_ALIAS_BIBLIOTECA);
				setState(104);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANTE) {
				{
				setState(107);
				match(CONSTANTE);
				}
			}

			setState(110);
			match(TIPO);
			setState(111);
			declaracao();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(112);
				match(VIRGULA);
				setState(113);
				declaracao();
				}
				}
				setState(118);
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

	public static class DeclaracaoRegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(PortugolParser.REGISTRO, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(PortugolParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PortugolParser.FECHA_CHAVES, 0); }
		public List<ListaDeclaracoesContext> listaDeclaracoes() {
			return getRuleContexts(ListaDeclaracoesContext.class);
		}
		public ListaDeclaracoesContext listaDeclaracoes(int i) {
			return getRuleContext(ListaDeclaracoesContext.class,i);
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
		enterRule(_localctx, 6, RULE_declaracaoRegistro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(REGISTRO);
			setState(120);
			match(ID);
			setState(121);
			match(ABRE_CHAVES);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO || _la==CONSTANTE) {
				{
				{
				setState(122);
				listaDeclaracoes();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
		enterRule(_localctx, 8, RULE_instanciaRegistro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ID_COMPOSTO() { return getToken(PortugolParser.ID_COMPOSTO, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==ID_COMPOSTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 12, RULE_declaracao);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				declaracaoArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
		enterRule(_localctx, 14, RULE_declaracaoVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(141);
				match(OP_ATRIBUICAO);
				setState(142);
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
		enterRule(_localctx, 16, RULE_declaracaoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(ABRE_COLCHETES);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(147);
				linhaMatriz();
				}
			}

			setState(150);
			match(FECHA_COLCHETES);
			setState(151);
			match(ABRE_COLCHETES);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(152);
				colunaMatriz();
				}
			}

			setState(155);
			match(FECHA_COLCHETES);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(156);
				match(OP_ATRIBUICAO);
				setState(157);
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
		enterRule(_localctx, 18, RULE_inicializacaoMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ABRE_CHAVES);
			setState(161);
			inicializacaoArray();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(162);
				match(VIRGULA);
				setState(163);
				inicializacaoArray();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
		enterRule(_localctx, 20, RULE_linhaMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		enterRule(_localctx, 22, RULE_colunaMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 24, RULE_declaracaoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(176);
			match(ABRE_COLCHETES);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(177);
				tamanhoArray();
				}
			}

			setState(180);
			match(FECHA_COLCHETES);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIBUICAO) {
				{
				setState(181);
				match(OP_ATRIBUICAO);
				setState(182);
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
		enterRule(_localctx, 26, RULE_inicializacaoArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ABRE_CHAVES);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(186);
				listaExpressoes();
				}
			}

			setState(189);
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
		enterRule(_localctx, 28, RULE_tamanhoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 30, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(FUNCAO);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(194);
				match(TIPO);
				}
			}

			setState(197);
			match(ID);
			setState(198);
			parametroFuncao();
			setState(199);
			match(ABRE_CHAVES);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << REGISTRO) | (1L << FACA) | (1L << ENQUANTO) | (1L << PARA) | (1L << SE) | (1L << CONSTANTE) | (1L << ESCOLHA) | (1L << PARE) | (1L << RETORNE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				{
				setState(200);
				comando();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
		enterRule(_localctx, 32, RULE_parametroFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ABRE_PARENTESES);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(209);
				listaParametros();
				}
			}

			setState(212);
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
		enterRule(_localctx, 34, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			parametro();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(215);
				match(VIRGULA);
				setState(216);
				parametro();
				}
				}
				setState(221);
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
		enterRule(_localctx, 36, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(TIPO);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E_COMERCIAL) {
				{
				setState(223);
				match(E_COMERCIAL);
				}
			}

			setState(226);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(227);
				parametroArray();
				}
				break;
			case 2:
				{
				setState(228);
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
		enterRule(_localctx, 38, RULE_parametroArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ABRE_COLCHETES);
			setState(232);
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
		enterRule(_localctx, 40, RULE_parametroMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ABRE_COLCHETES);
			setState(235);
			match(FECHA_COLCHETES);
			setState(236);
			match(ABRE_COLCHETES);
			setState(237);
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
		enterRule(_localctx, 42, RULE_comando);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				instanciaRegistro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				declaracaoRegistro();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				se();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				enquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				facaEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				para();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				escolha();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
				retorne();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(248);
				pare();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(249);
				atribuicao();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(250);
				atribuicaoComposta();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(251);
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
		enterRule(_localctx, 44, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expressao(0);
			setState(255);
			match(OP_ATRIBUICAO);
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
		enterRule(_localctx, 46, RULE_atribuicaoComposta);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoCompostaSomaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				expressao(0);
				setState(259);
				match(OP_MAIS_IGUAL);
				setState(260);
				expressao(0);
				}
				break;
			case 2:
				_localctx = new AtribuicaoCompostaSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				expressao(0);
				setState(263);
				match(OP_MENOS_IGUAL);
				setState(264);
				expressao(0);
				}
				break;
			case 3:
				_localctx = new AtribuicaoCompostaMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				expressao(0);
				setState(267);
				match(OP_MULTIPLICACAO_IGUAL);
				setState(268);
				expressao(0);
				}
				break;
			case 4:
				_localctx = new AtribuicaoCompostaDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				expressao(0);
				setState(271);
				match(OP_DIVISAO_IGUAL);
				setState(272);
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
		enterRule(_localctx, 48, RULE_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(RETORNE);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(277);
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
		enterRule(_localctx, 50, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(SE);
			setState(281);
			match(ABRE_PARENTESES);
			setState(282);
			expressao(0);
			setState(283);
			match(FECHA_PARENTESES);
			setState(284);
			listaComandos();
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(285);
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
		enterRule(_localctx, 52, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(SENAO);
			setState(289);
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
		enterRule(_localctx, 54, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ENQUANTO);
			setState(292);
			match(ABRE_PARENTESES);
			setState(293);
			expressao(0);
			setState(294);
			match(FECHA_PARENTESES);
			setState(295);
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
		enterRule(_localctx, 56, RULE_facaEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FACA);
			setState(298);
			listaComandos();
			setState(299);
			match(ENQUANTO);
			setState(300);
			match(ABRE_PARENTESES);
			setState(301);
			expressao(0);
			setState(302);
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
		enterRule(_localctx, 58, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(PARA);
			setState(305);
			match(ABRE_PARENTESES);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << CONSTANTE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
				{
				setState(306);
				inicializacaoPara();
				}
			}

			setState(309);
			match(PONTOVIRGULA);
			setState(310);
			condicao();
			setState(311);
			match(PONTOVIRGULA);
			setState(312);
			incrementoPara();
			setState(313);
			match(FECHA_PARENTESES);
			setState(314);
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
		enterRule(_localctx, 60, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVES:
				{
				setState(316);
				match(ABRE_CHAVES);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << REGISTRO) | (1L << FACA) | (1L << ENQUANTO) | (1L << PARA) | (1L << SE) | (1L << CONSTANTE) | (1L << ESCOLHA) | (1L << PARE) | (1L << RETORNE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
					{
					{
					setState(317);
					comando();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
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
			case ID_COMPOSTO:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(324);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_inicializacaoPara);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				listaDeclaracoes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				id();
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
		enterRule(_localctx, 64, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		enterRule(_localctx, 66, RULE_incrementoPara);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				atribuicaoComposta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
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
		enterRule(_localctx, 68, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ESCOLHA);
			setState(340);
			match(ABRE_PARENTESES);
			setState(341);
			expressao(0);
			setState(342);
			match(FECHA_PARENTESES);
			setState(343);
			match(ABRE_CHAVES);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(344);
				caso();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
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
		enterRule(_localctx, 70, RULE_caso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(CASO);
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRARIO:
				{
				setState(353);
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
			case ID_COMPOSTO:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(354);
				expressao(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(357);
			match(DOISPONTOS);
			setState(372);
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
			case ID_COMPOSTO:
			case REAL:
			case INT:
			case HEXADECIMAL:
				{
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(358);
						comando();
						}
						} 
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case ABRE_CHAVES:
				{
				setState(364);
				match(ABRE_CHAVES);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TIPO) | (1L << REGISTRO) | (1L << FACA) | (1L << ENQUANTO) | (1L << PARA) | (1L << SE) | (1L << CONSTANTE) | (1L << ESCOLHA) | (1L << PARE) | (1L << RETORNE) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
					{
					{
					setState(365);
					comando();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(FECHA_CHAVES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(374);
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
		enterRule(_localctx, 72, RULE_pare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 74, RULE_indiceArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ABRE_COLCHETES);
			setState(380);
			expressao(0);
			setState(381);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ChamadaFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(384);
					escopoBiblioteca();
					}
					break;
				}
				setState(387);
				match(ID);
				setState(388);
				match(ABRE_PARENTESES);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << OP_NAO) | (1L << OP_SUBTRACAO) | (1L << OP_ADICAO) | (1L << OP_INCREMENTO_UNARIO) | (1L << OP_DECREMENTO_UNARIO) | (1L << OP_NOT_BITWISE) | (1L << LOGICO) | (1L << CARACTER) | (1L << STRING) | (1L << ID) | (1L << ID_COMPOSTO) | (1L << REAL) | (1L << INT) | (1L << HEXADECIMAL))) != 0)) {
					{
					setState(389);
					listaExpressoes();
					}
				}

				setState(392);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				_localctx = new ReferenciaArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(393);
					escopoBiblioteca();
					}
					break;
				}
				setState(396);
				match(ID);
				setState(397);
				indiceArray();
				}
				break;
			case 3:
				{
				_localctx = new ReferenciaMatrizContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(398);
					escopoBiblioteca();
					}
					break;
				}
				setState(401);
				match(ID);
				setState(402);
				indiceArray();
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(403);
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
				setState(406);
				match(OP_SUBTRACAO);
				setState(407);
				expressao(33);
				}
				break;
			case 5:
				{
				_localctx = new MaisUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(OP_ADICAO);
				setState(409);
				expressao(32);
				}
				break;
			case 6:
				{
				_localctx = new NegacaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				match(OP_NAO);
				setState(411);
				expressao(31);
				}
				break;
			case 7:
				{
				_localctx = new NegacaoBitwiseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				match(OP_NOT_BITWISE);
				setState(413);
				expressao(30);
				}
				break;
			case 8:
				{
				_localctx = new IncrementoUnarioPosfixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(414);
				match(ID);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_COLCHETES) {
					{
					setState(415);
					indiceArray();
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABRE_COLCHETES) {
						{
						setState(416);
						indiceArray();
						}
					}

					}
				}

				setState(421);
				match(OP_INCREMENTO_UNARIO);
				}
				break;
			case 9:
				{
				_localctx = new DecrementoUnarioPosfixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				match(ID);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_COLCHETES) {
					{
					setState(423);
					indiceArray();
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ABRE_COLCHETES) {
						{
						setState(424);
						indiceArray();
						}
					}

					}
				}

				setState(429);
				match(OP_DECREMENTO_UNARIO);
				}
				break;
			case 10:
				{
				_localctx = new IncrementoUnarioPrefixadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				match(OP_INCREMENTO_UNARIO);
				setState(431);
				match(ID);
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(432);
					indiceArray();
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(433);
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
				setState(438);
				match(OP_DECREMENTO_UNARIO);
				setState(439);
				match(ID);
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(440);
					indiceArray();
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(441);
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
				setState(446);
				id();
				}
				break;
			case 13:
				{
				_localctx = new NumeroInteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(447);
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
				setState(448);
				match(REAL);
				}
				break;
			case 15:
				{
				_localctx = new ValorLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(449);
				match(LOGICO);
				}
				break;
			case 16:
				{
				_localctx = new CaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(450);
				match(CARACTER);
				}
				break;
			case 17:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(451);
				match(STRING);
				}
				break;
			case 18:
				{
				_localctx = new ExpressaoEntreParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(452);
				match(ABRE_PARENTESES);
				setState(453);
				expressao(0);
				setState(454);
				match(FECHA_PARENTESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(458);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(459);
						match(OP_MULTIPLICACAO);
						setState(460);
						expressao(26);
						}
						break;
					case 2:
						{
						_localctx = new DivisaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(461);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(462);
						match(OP_DIVISAO);
						setState(463);
						expressao(25);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(464);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(465);
						match(OP_MOD);
						setState(466);
						expressao(24);
						}
						break;
					case 4:
						{
						_localctx = new AdicaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(467);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(468);
						match(OP_ADICAO);
						setState(469);
						expressao(23);
						}
						break;
					case 5:
						{
						_localctx = new SubtracaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(470);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(471);
						match(OP_SUBTRACAO);
						setState(472);
						expressao(22);
						}
						break;
					case 6:
						{
						_localctx = new OperacaoIgualdadeContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(473);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(474);
						match(OP_IGUALDADE);
						setState(475);
						expressao(21);
						}
						break;
					case 7:
						{
						_localctx = new OperacaoDiferencaContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(476);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(477);
						match(OP_DIFERENCA);
						setState(478);
						expressao(20);
						}
						break;
					case 8:
						{
						_localctx = new OperacaoMaiorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(479);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(480);
						match(OP_MAIOR);
						setState(481);
						expressao(19);
						}
						break;
					case 9:
						{
						_localctx = new OperacaoMenorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(482);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(483);
						match(OP_MENOR);
						setState(484);
						expressao(18);
						}
						break;
					case 10:
						{
						_localctx = new OperacaoMenorIgualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(485);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(486);
						match(OP_MENOR_IGUAL);
						setState(487);
						expressao(17);
						}
						break;
					case 11:
						{
						_localctx = new OperacaoMaiorIgualContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(488);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(489);
						match(OP_MAIOR_IGUAL);
						setState(490);
						expressao(16);
						}
						break;
					case 12:
						{
						_localctx = new OperacaoELogicoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(491);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(492);
						match(OP_E_LOGICO);
						setState(493);
						expressao(15);
						}
						break;
					case 13:
						{
						_localctx = new OperacaoOuLogicoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(494);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(495);
						match(OP_OU_LOGICO);
						setState(496);
						expressao(14);
						}
						break;
					case 14:
						{
						_localctx = new OperacaoXorContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(497);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(498);
						match(OP_XOR);
						setState(499);
						expressao(13);
						}
						break;
					case 15:
						{
						_localctx = new OperacaoShiftLeftContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(500);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(501);
						match(OP_SHIFT_LEFT);
						setState(502);
						expressao(12);
						}
						break;
					case 16:
						{
						_localctx = new OperacaoShiftRightContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(503);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(504);
						match(OP_SHIFT_RIGHT);
						setState(505);
						expressao(11);
						}
						break;
					case 17:
						{
						_localctx = new OperacaoAndBitwiseContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(506);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(507);
						match(E_COMERCIAL);
						setState(508);
						expressao(10);
						}
						break;
					case 18:
						{
						_localctx = new OperacaoOrBitwiseContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(509);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(510);
						match(OP_OU_BITWISE);
						setState(511);
						expressao(9);
						}
						break;
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 78, RULE_listaExpressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(517);
				expressao(0);
				}
				break;
			case 2:
				{
				setState(518);
				atribuicaoComposta();
				}
				break;
			case 3:
				{
				setState(519);
				atribuicao();
				}
				break;
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(522);
				match(VIRGULA);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(523);
					expressao(0);
					}
					break;
				case 2:
					{
					setState(524);
					atribuicaoComposta();
					}
					break;
				case 3:
					{
					setState(525);
					atribuicao();
					}
					break;
				}
				}
				}
				setState(532);
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
		enterRule(_localctx, 80, RULE_escopoBiblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(533);
			match(ID);
			setState(534);
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
		case 38:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u021b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\5\4o\n\4\3\4\3\4\3\4\3\4\7\4u\n\4"+
		"\f\4\16\4x\13\4\3\5\3\5\3\5\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\5\t\u0092\n\t"+
		"\3\n\3\n\3\n\5\n\u0097\n\n\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3\n\3\n\5\n\u00a1"+
		"\n\n\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u00b5\n\16\3\16\3\16\3\16\5\16"+
		"\u00ba\n\16\3\17\3\17\5\17\u00be\n\17\3\17\3\17\3\20\3\20\3\21\3\21\5"+
		"\21\u00c6\n\21\3\21\3\21\3\21\3\21\7\21\u00cc\n\21\f\21\16\21\u00cf\13"+
		"\21\3\21\3\21\3\22\3\22\5\22\u00d5\n\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u00dc\n\23\f\23\16\23\u00df\13\23\3\24\3\24\5\24\u00e3\n\24\3\24\3\24"+
		"\3\24\5\24\u00e8\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ff\n\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0115\n\31\3\32\3\32\5\32\u0119\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0121\n\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\5\37\u0136\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u0141"+
		"\n \f \16 \u0144\13 \3 \3 \5 \u0148\n \3!\3!\3!\5!\u014d\n!\3\"\3\"\3"+
		"#\3#\3#\5#\u0154\n#\3$\3$\3$\3$\3$\3$\7$\u015c\n$\f$\16$\u015f\13$\3$"+
		"\3$\3%\3%\3%\5%\u0166\n%\3%\3%\7%\u016a\n%\f%\16%\u016d\13%\3%\3%\7%\u0171"+
		"\n%\f%\16%\u0174\13%\3%\5%\u0177\n%\3%\5%\u017a\n%\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\5(\u0184\n(\3(\3(\3(\5(\u0189\n(\3(\3(\5(\u018d\n(\3(\3(\3(\5"+
		"(\u0192\n(\3(\3(\3(\5(\u0197\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01a4"+
		"\n(\5(\u01a6\n(\3(\3(\3(\3(\5(\u01ac\n(\5(\u01ae\n(\3(\3(\3(\3(\3(\5("+
		"\u01b5\n(\5(\u01b7\n(\3(\3(\3(\3(\5(\u01bd\n(\5(\u01bf\n(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\5(\u01cb\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0203\n(\f("+
		"\16(\u0206\13(\3)\3)\3)\5)\u020b\n)\3)\3)\3)\3)\5)\u0211\n)\7)\u0213\n"+
		")\f)\16)\u0216\13)\3*\3*\3*\3*\2\3N+\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\4\3\2;<\3\2>?\2\u025d\2T\3"+
		"\2\2\2\4f\3\2\2\2\6n\3\2\2\2\by\3\2\2\2\n\u0084\3\2\2\2\f\u0087\3\2\2"+
		"\2\16\u008c\3\2\2\2\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u00a2\3\2\2\2"+
		"\26\u00ad\3\2\2\2\30\u00af\3\2\2\2\32\u00b1\3\2\2\2\34\u00bb\3\2\2\2\36"+
		"\u00c1\3\2\2\2 \u00c3\3\2\2\2\"\u00d2\3\2\2\2$\u00d8\3\2\2\2&\u00e0\3"+
		"\2\2\2(\u00e9\3\2\2\2*\u00ec\3\2\2\2,\u00fe\3\2\2\2.\u0100\3\2\2\2\60"+
		"\u0114\3\2\2\2\62\u0116\3\2\2\2\64\u011a\3\2\2\2\66\u0122\3\2\2\28\u0125"+
		"\3\2\2\2:\u012b\3\2\2\2<\u0132\3\2\2\2>\u0147\3\2\2\2@\u014c\3\2\2\2B"+
		"\u014e\3\2\2\2D\u0153\3\2\2\2F\u0155\3\2\2\2H\u0162\3\2\2\2J\u017b\3\2"+
		"\2\2L\u017d\3\2\2\2N\u01ca\3\2\2\2P\u020a\3\2\2\2R\u0217\3\2\2\2TU\7\22"+
		"\2\2UY\7\7\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Za\3\2"+
		"\2\2[Y\3\2\2\2\\`\5\b\5\2]`\5 \21\2^`\5\6\4\2_\\\3\2\2\2_]\3\2\2\2_^\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\b\2\2e\3"+
		"\3\2\2\2fg\7\30\2\2gh\7\31\2\2hk\7;\2\2ij\7\60\2\2jl\7;\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\5\3\2\2\2mo\7\20\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\t\2"+
		"\2qv\5\16\b\2rs\7D\2\2su\5\16\b\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2w\7\3\2\2\2xv\3\2\2\2yz\7\n\2\2z{\7;\2\2{\177\7\7\2\2|~\5\6\4\2}|"+
		"\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\u0083\7\b\2\2\u0083\t\3\2\2\2\u0084\u0085"+
		"\7;\2\2\u0085\u0086\7;\2\2\u0086\13\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\r\3\2\2\2\u0089\u008d\5\20\t\2\u008a\u008d\5\32\16\2\u008b\u008d\5\22"+
		"\n\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\17\3\2\2\2\u008e\u0091\7;\2\2\u008f\u0090\7\"\2\2\u0090\u0092\5N(\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7;\2\2"+
		"\u0094\u0096\7\5\2\2\u0095\u0097\5\26\f\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009b\7\5\2\2\u009a"+
		"\u009c\5\30\r\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u00a0\7\6\2\2\u009e\u009f\7\"\2\2\u009f\u00a1\5\24\13\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\7\2"+
		"\2\u00a3\u00a8\5\34\17\2\u00a4\u00a5\7D\2\2\u00a5\u00a7\5\34\17\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ae\5\36\20\2\u00ae\27\3\2\2\2\u00af\u00b0\5\36\20"+
		"\2\u00b0\31\3\2\2\2\u00b1\u00b2\7;\2\2\u00b2\u00b4\7\5\2\2\u00b3\u00b5"+
		"\5\36\20\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b9\7\6\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00ba\5\34\17\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bd\7\7\2\2\u00bc"+
		"\u00be\5P)\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2"+
		"\2\u00bf\u00c0\7\b\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\5N(\2\u00c2\37\3\2"+
		"\2\2\u00c3\u00c5\7\21\2\2\u00c4\u00c6\7\t\2\2\u00c5\u00c4\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7;\2\2\u00c8\u00c9\5\""+
		"\22\2\u00c9\u00cd\7\7\2\2\u00ca\u00cc\5,\27\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1!\3\2\2\2\u00d2\u00d4"+
		"\7\3\2\2\u00d3\u00d5\5$\23\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\7\4\2\2\u00d7#\3\2\2\2\u00d8\u00dd\5&\24\2"+
		"\u00d9\u00da\7D\2\2\u00da\u00dc\5&\24\2\u00db\u00d9\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de%\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\7\t\2\2\u00e1\u00e3\7\61\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\7;\2\2\u00e5"+
		"\u00e8\5(\25\2\u00e6\u00e8\5*\26\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\'\3\2\2\2\u00e9\u00ea\7\5\2\2\u00ea\u00eb"+
		"\7\6\2\2\u00eb)\3\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\7\6\2\2\u00ee"+
		"\u00ef\7\5\2\2\u00ef\u00f0\7\6\2\2\u00f0+\3\2\2\2\u00f1\u00ff\5\6\4\2"+
		"\u00f2\u00ff\5\n\6\2\u00f3\u00ff\5\b\5\2\u00f4\u00ff\5\64\33\2\u00f5\u00ff"+
		"\58\35\2\u00f6\u00ff\5:\36\2\u00f7\u00ff\5<\37\2\u00f8\u00ff\5F$\2\u00f9"+
		"\u00ff\5\62\32\2\u00fa\u00ff\5J&\2\u00fb\u00ff\5.\30\2\u00fc\u00ff\5\60"+
		"\31\2\u00fd\u00ff\5N(\2\u00fe\u00f1\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe"+
		"\u00f3\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2"+
		"\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe"+
		"\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff-\3\2\2\2\u0100\u0101\5N(\2\u0101\u0102\7\"\2\2\u0102\u0103"+
		"\5N(\2\u0103/\3\2\2\2\u0104\u0105\5N(\2\u0105\u0106\7\62\2\2\u0106\u0107"+
		"\5N(\2\u0107\u0115\3\2\2\2\u0108\u0109\5N(\2\u0109\u010a\7\63\2\2\u010a"+
		"\u010b\5N(\2\u010b\u0115\3\2\2\2\u010c\u010d\5N(\2\u010d\u010e\7\64\2"+
		"\2\u010e\u010f\5N(\2\u010f\u0115\3\2\2\2\u0110\u0111\5N(\2\u0111\u0112"+
		"\7\65\2\2\u0112\u0113\5N(\2\u0113\u0115\3\2\2\2\u0114\u0104\3\2\2\2\u0114"+
		"\u0108\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0110\3\2\2\2\u0115\61\3\2\2"+
		"\2\u0116\u0118\7\27\2\2\u0117\u0119\5N(\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\63\3\2\2\2\u011a\u011b\7\16\2\2\u011b\u011c\7\3\2\2\u011c"+
		"\u011d\5N(\2\u011d\u011e\7\4\2\2\u011e\u0120\5> \2\u011f\u0121\5\66\34"+
		"\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\65\3\2\2\2\u0122\u0123"+
		"\7\17\2\2\u0123\u0124\5> \2\u0124\67\3\2\2\2\u0125\u0126\7\f\2\2\u0126"+
		"\u0127\7\3\2\2\u0127\u0128\5N(\2\u0128\u0129\7\4\2\2\u0129\u012a\5> \2"+
		"\u012a9\3\2\2\2\u012b\u012c\7\13\2\2\u012c\u012d\5> \2\u012d\u012e\7\f"+
		"\2\2\u012e\u012f\7\3\2\2\u012f\u0130\5N(\2\u0130\u0131\7\4\2\2\u0131;"+
		"\3\2\2\2\u0132\u0133\7\r\2\2\u0133\u0135\7\3\2\2\u0134\u0136\5@!\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7E"+
		"\2\2\u0138\u0139\5B\"\2\u0139\u013a\7E\2\2\u013a\u013b\5D#\2\u013b\u013c"+
		"\7\4\2\2\u013c\u013d\5> \2\u013d=\3\2\2\2\u013e\u0142\7\7\2\2\u013f\u0141"+
		"\5,\27\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0148\7\b"+
		"\2\2\u0146\u0148\5,\27\2\u0147\u013e\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"?\3\2\2\2\u0149\u014d\5.\30\2\u014a\u014d\5\6\4\2\u014b\u014d\5\f\7\2"+
		"\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014dA\3"+
		"\2\2\2\u014e\u014f\5N(\2\u014fC\3\2\2\2\u0150\u0154\5N(\2\u0151\u0154"+
		"\5\60\31\2\u0152\u0154\5.\30\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2"+
		"\u0153\u0152\3\2\2\2\u0154E\3\2\2\2\u0155\u0156\7\23\2\2\u0156\u0157\7"+
		"\3\2\2\u0157\u0158\5N(\2\u0158\u0159\7\4\2\2\u0159\u015d\7\7\2\2\u015a"+
		"\u015c\5H%\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2"+
		"\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161"+
		"\7\b\2\2\u0161G\3\2\2\2\u0162\u0165\7\24\2\2\u0163\u0166\7\25\2\2\u0164"+
		"\u0166\5N(\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2"+
		"\2\u0167\u0176\7F\2\2\u0168\u016a\5,\27\2\u0169\u0168\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0177\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0172\7\7\2\2\u016f\u0171\5,\27\2\u0170\u016f\3\2"+
		"\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\7\b\2\2\u0176\u016b\3\2"+
		"\2\2\u0176\u016e\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u017a\5J&\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017aI\3\2\2\2\u017b\u017c\7\26\2\2\u017c"+
		"K\3\2\2\2\u017d\u017e\7\5\2\2\u017e\u017f\5N(\2\u017f\u0180\7\6\2\2\u0180"+
		"M\3\2\2\2\u0181\u0183\b(\1\2\u0182\u0184\5R*\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7;\2\2\u0186\u0188\7\3"+
		"\2\2\u0187\u0189\5P)\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u01cb\7\4\2\2\u018b\u018d\5R*\2\u018c\u018b\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7;\2\2\u018f\u01cb\5L\'"+
		"\2\u0190\u0192\5R*\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0194\7;\2\2\u0194\u0196\5L\'\2\u0195\u0197\5L\'\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01cb\3\2\2\2\u0198\u0199\7\35"+
		"\2\2\u0199\u01cb\5N(#\u019a\u019b\7\36\2\2\u019b\u01cb\5N(\"\u019c\u019d"+
		"\7\32\2\2\u019d\u01cb\5N(!\u019e\u019f\7/\2\2\u019f\u01cb\5N( \u01a0\u01a5"+
		"\7;\2\2\u01a1\u01a3\5L\'\2\u01a2\u01a4\5L\'\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01cb\7)\2\2\u01a8\u01ad\7;\2\2\u01a9\u01ab"+
		"\5L\'\2\u01aa\u01ac\5L\'\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01cb\7*\2\2\u01b0\u01b1\7)\2\2\u01b1\u01b6\7;\2\2\u01b2\u01b4"+
		"\5L\'\2\u01b3\u01b5\5L\'\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01cb\3\2"+
		"\2\2\u01b8\u01b9\7*\2\2\u01b9\u01be\7;\2\2\u01ba\u01bc\5L\'\2\u01bb\u01bd"+
		"\5L\'\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01ba\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01cb\3\2\2\2\u01c0\u01cb\5\f"+
		"\7\2\u01c1\u01cb\t\3\2\2\u01c2\u01cb\7=\2\2\u01c3\u01cb\7\66\2\2\u01c4"+
		"\u01cb\79\2\2\u01c5\u01cb\7:\2\2\u01c6\u01c7\7\3\2\2\u01c7\u01c8\5N(\2"+
		"\u01c8\u01c9\7\4\2\2\u01c9\u01cb\3\2\2\2\u01ca\u0181\3\2\2\2\u01ca\u018c"+
		"\3\2\2\2\u01ca\u0191\3\2\2\2\u01ca\u0198\3\2\2\2\u01ca\u019a\3\2\2\2\u01ca"+
		"\u019c\3\2\2\2\u01ca\u019e\3\2\2\2\u01ca\u01a0\3\2\2\2\u01ca\u01a8\3\2"+
		"\2\2\u01ca\u01b0\3\2\2\2\u01ca\u01b8\3\2\2\2\u01ca\u01c0\3\2\2\2\u01ca"+
		"\u01c1\3\2\2\2\u01ca\u01c2\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2"+
		"\2\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\u0204\3\2\2\2\u01cc"+
		"\u01cd\f\33\2\2\u01cd\u01ce\7\37\2\2\u01ce\u0203\5N(\34\u01cf\u01d0\f"+
		"\32\2\2\u01d0\u01d1\7 \2\2\u01d1\u0203\5N(\33\u01d2\u01d3\f\31\2\2\u01d3"+
		"\u01d4\7!\2\2\u01d4\u0203\5N(\32\u01d5\u01d6\f\30\2\2\u01d6\u01d7\7\36"+
		"\2\2\u01d7\u0203\5N(\31\u01d8\u01d9\f\27\2\2\u01d9\u01da\7\35\2\2\u01da"+
		"\u0203\5N(\30\u01db\u01dc\f\26\2\2\u01dc\u01dd\7#\2\2\u01dd\u0203\5N("+
		"\27\u01de\u01df\f\25\2\2\u01df\u01e0\7$\2\2\u01e0\u0203\5N(\26\u01e1\u01e2"+
		"\f\24\2\2\u01e2\u01e3\7%\2\2\u01e3\u0203\5N(\25\u01e4\u01e5\f\23\2\2\u01e5"+
		"\u01e6\7&\2\2\u01e6\u0203\5N(\24\u01e7\u01e8\f\22\2\2\u01e8\u01e9\7\'"+
		"\2\2\u01e9\u0203\5N(\23\u01ea\u01eb\f\21\2\2\u01eb\u01ec\7(\2\2\u01ec"+
		"\u0203\5N(\22\u01ed\u01ee\f\20\2\2\u01ee\u01ef\7\33\2\2\u01ef\u0203\5"+
		"N(\21\u01f0\u01f1\f\17\2\2\u01f1\u01f2\7\34\2\2\u01f2\u0203\5N(\20\u01f3"+
		"\u01f4\f\16\2\2\u01f4\u01f5\7-\2\2\u01f5\u0203\5N(\17\u01f6\u01f7\f\r"+
		"\2\2\u01f7\u01f8\7+\2\2\u01f8\u0203\5N(\16\u01f9\u01fa\f\f\2\2\u01fa\u01fb"+
		"\7,\2\2\u01fb\u0203\5N(\r\u01fc\u01fd\f\13\2\2\u01fd\u01fe\7\61\2\2\u01fe"+
		"\u0203\5N(\f\u01ff\u0200\f\n\2\2\u0200\u0201\7.\2\2\u0201\u0203\5N(\13"+
		"\u0202\u01cc\3\2\2\2\u0202\u01cf\3\2\2\2\u0202\u01d2\3\2\2\2\u0202\u01d5"+
		"\3\2\2\2\u0202\u01d8\3\2\2\2\u0202\u01db\3\2\2\2\u0202\u01de\3\2\2\2\u0202"+
		"\u01e1\3\2\2\2\u0202\u01e4\3\2\2\2\u0202\u01e7\3\2\2\2\u0202\u01ea\3\2"+
		"\2\2\u0202\u01ed\3\2\2\2\u0202\u01f0\3\2\2\2\u0202\u01f3\3\2\2\2\u0202"+
		"\u01f6\3\2\2\2\u0202\u01f9\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01ff\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"O\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u020b\5N(\2\u0208\u020b\5\60\31\2"+
		"\u0209\u020b\5.\30\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209"+
		"\3\2\2\2\u020b\u0214\3\2\2\2\u020c\u0210\7D\2\2\u020d\u0211\5N(\2\u020e"+
		"\u0211\5\60\31\2\u020f\u0211\5.\30\2\u0210\u020d\3\2\2\2\u0210\u020e\3"+
		"\2\2\2\u0210\u020f\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u020c\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215Q\3\2\2\2"+
		"\u0216\u0214\3\2\2\2\u0217\u0218\7;\2\2\u0218\u0219\7C\2\2\u0219S\3\2"+
		"\2\2:Y_aknv\177\u008c\u0091\u0096\u009b\u00a0\u00a8\u00b4\u00b9\u00bd"+
		"\u00c5\u00cd\u00d4\u00dd\u00e2\u00e7\u00fe\u0114\u0118\u0120\u0135\u0142"+
		"\u0147\u014c\u0153\u015d\u0165\u016b\u0172\u0176\u0179\u0183\u0188\u018c"+
		"\u0191\u0196\u01a3\u01a5\u01ab\u01ad\u01b4\u01b6\u01bc\u01be\u01ca\u0202"+
		"\u0204\u020a\u0210\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}