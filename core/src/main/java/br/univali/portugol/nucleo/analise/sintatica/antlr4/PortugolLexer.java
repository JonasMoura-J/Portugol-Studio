// Generated from Portugol.g4 by ANTLR 4.7.2
package br.univali.portugol.nucleo.analise.sintatica.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", "FECHA_COLCHETES", 
			"ABRE_CHAVES", "FECHA_CHAVES", "TIPO", "REGISTRO", "FACA", "ENQUANTO", 
			"PARA", "SE", "SENAO", "CONSTANTE", "FUNCAO", "PROGRAMA", "ESCOLHA", 
			"CASO", "CONTRARIO", "PARE", "RETORNE", "INCLUA", "BIBLIOTECA", "OP_NAO", 
			"OP_E_LOGICO", "OP_OU_LOGICO", "OP_SUBTRACAO", "OP_ADICAO", "OP_MULTIPLICACAO", 
			"OP_DIVISAO", "OP_MOD", "OP_ATRIBUICAO", "OP_IGUALDADE", "OP_DIFERENCA", 
			"OP_MAIOR", "OP_MENOR", "OP_MENOR_IGUAL", "OP_MAIOR_IGUAL", "OP_INCREMENTO_UNARIO", 
			"OP_DECREMENTO_UNARIO", "OP_SHIFT_LEFT", "OP_SHIFT_RIGHT", "OP_XOR", 
			"OP_OU_BITWISE", "OP_NOT_BITWISE", "OP_ALIAS_BIBLIOTECA", "E_COMERCIAL", 
			"OP_MAIS_IGUAL", "OP_MENOS_IGUAL", "OP_MULTIPLICACAO_IGUAL", "OP_DIVISAO_IGUAL", 
			"LOGICO", "VERDADEIRO", "FALSO", "CARACTER", "SEQ_ESC", "ESC_OCTAL", 
			"ESC_UNICODE", "ESC_CARACTER", "DIGIT_HEX", "STRING", "ID", "ID_COMPOSTO", 
			"LETRA", "REAL", "DIGITO", "INT", "HEXADECIMAL", "SIMBOLO_HEXADECIMAL", 
			"COMENTARIO", "COMENTARIO_SIMPLES", "WS", "PONTO", "VIRGULA", "PONTOVIRGULA", 
			"DOISPONTOS"
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


	public PortugolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 66:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 
			    try {
			        Integer.parseInt(getText());
			    }
			    catch(NumberFormatException e) {
			        LexerNoViableAltException ex = new LexerNoViableAltException(this, _input, actionIndex, null);
			        ex.initCause(e);
				throw ex;
			    }

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0240\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00cc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\5\65\u018a\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\58\u01a0"+
		"\n8\38\38\39\39\39\39\59\u01a8\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01b3"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\5<\u01bf\n<\3=\3=\3>\3>\3>\7>\u01c6"+
		"\n>\f>\16>\u01c9\13>\3>\3>\3?\3?\5?\u01cf\n?\3?\3?\7?\u01d3\n?\f?\16?"+
		"\u01d6\13?\3@\3@\3@\3@\7@\u01dc\n@\f@\16@\u01df\13@\3A\3A\3B\6B\u01e4"+
		"\nB\rB\16B\u01e5\3B\3B\7B\u01ea\nB\fB\16B\u01ed\13B\3B\3B\6B\u01f1\nB"+
		"\rB\16B\u01f2\5B\u01f5\nB\3C\3C\3D\6D\u01fa\nD\rD\16D\u01fb\3D\3D\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\5E\u0208\nE\5E\u020a\nE\5E\u020c\nE\5E\u020e\nE\5"+
		"E\u0210\nE\3F\3F\5F\u0214\nF\3G\3G\3G\3G\7G\u021a\nG\fG\16G\u021d\13G"+
		"\3G\3G\3G\3G\3G\3H\3H\3H\3H\7H\u0228\nH\fH\16H\u022b\13H\3H\5H\u022e\n"+
		"H\3H\3H\3I\6I\u0233\nI\rI\16I\u0234\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\5\u01c7"+
		"\u021b\u0229\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q\2s\2u\2w\2y\2{:};\177<\u0081\2\u0083=\u0085\2\u0087"+
		">\u0089?\u008b\2\u008d@\u008fA\u0091B\u0093C\u0095D\u0097E\u0099F\3\2"+
		"\f\3\2))\t\2$$^^ddhhppttvv\5\2\62;CHch\4\2\62;aa\4\2C\\c|\3\2\62;\4\2"+
		"ZZzz\4\2CHch\3\3\f\f\5\2\13\f\17\17\"\"\2\u0257\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0083\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2"+
		"\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u009d"+
		"\3\2\2\2\7\u009f\3\2\2\2\t\u00a1\3\2\2\2\13\u00a3\3\2\2\2\r\u00a5\3\2"+
		"\2\2\17\u00cb\3\2\2\2\21\u00cd\3\2\2\2\23\u00d6\3\2\2\2\25\u00db\3\2\2"+
		"\2\27\u00e4\3\2\2\2\31\u00e9\3\2\2\2\33\u00ec\3\2\2\2\35\u00f2\3\2\2\2"+
		"\37\u00f8\3\2\2\2!\u00ff\3\2\2\2#\u0108\3\2\2\2%\u0110\3\2\2\2\'\u0115"+
		"\3\2\2\2)\u011f\3\2\2\2+\u0124\3\2\2\2-\u012c\3\2\2\2/\u0133\3\2\2\2\61"+
		"\u013e\3\2\2\2\63\u0142\3\2\2\2\65\u0144\3\2\2\2\67\u0147\3\2\2\29\u0149"+
		"\3\2\2\2;\u014b\3\2\2\2=\u014d\3\2\2\2?\u014f\3\2\2\2A\u0151\3\2\2\2C"+
		"\u0153\3\2\2\2E\u0156\3\2\2\2G\u0159\3\2\2\2I\u015b\3\2\2\2K\u015d\3\2"+
		"\2\2M\u0160\3\2\2\2O\u0163\3\2\2\2Q\u0166\3\2\2\2S\u0169\3\2\2\2U\u016c"+
		"\3\2\2\2W\u016f\3\2\2\2Y\u0171\3\2\2\2[\u0173\3\2\2\2]\u0175\3\2\2\2_"+
		"\u0179\3\2\2\2a\u017b\3\2\2\2c\u017e\3\2\2\2e\u0181\3\2\2\2g\u0184\3\2"+
		"\2\2i\u0189\3\2\2\2k\u018b\3\2\2\2m\u0196\3\2\2\2o\u019c\3\2\2\2q\u01a7"+
		"\3\2\2\2s\u01b2\3\2\2\2u\u01b4\3\2\2\2w\u01be\3\2\2\2y\u01c0\3\2\2\2{"+
		"\u01c2\3\2\2\2}\u01ce\3\2\2\2\177\u01d7\3\2\2\2\u0081\u01e0\3\2\2\2\u0083"+
		"\u01f4\3\2\2\2\u0085\u01f6\3\2\2\2\u0087\u01f9\3\2\2\2\u0089\u01ff\3\2"+
		"\2\2\u008b\u0213\3\2\2\2\u008d\u0215\3\2\2\2\u008f\u0223\3\2\2\2\u0091"+
		"\u0232\3\2\2\2\u0093\u0238\3\2\2\2\u0095\u023a\3\2\2\2\u0097\u023c\3\2"+
		"\2\2\u0099\u023e\3\2\2\2\u009b\u009c\7*\2\2\u009c\4\3\2\2\2\u009d\u009e"+
		"\7+\2\2\u009e\6\3\2\2\2\u009f\u00a0\7]\2\2\u00a0\b\3\2\2\2\u00a1\u00a2"+
		"\7_\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\f\3\2\2\2\u00a5\u00a6"+
		"\7\177\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00cc\7n\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00cc\7q\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7|\2\2\u00b5\u00b6\7k\2\2\u00b6\u00cc\7q\2\2\u00b7\u00b8\7n\2\2"+
		"\u00b8\u00b9\7q\2\2\u00b9\u00ba\7i\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7e\2\2\u00bc\u00cc\7q\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7f\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7k\2\2\u00c2\u00cc\7c\2\2"+
		"\u00c3\u00c4\7e\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cc\7t\2\2\u00cb\u00a7\3\2\2\2\u00cb\u00ab\3\2\2\2\u00cb\u00b2\3\2"+
		"\2\2\u00cb\u00b7\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cc"+
		"\20\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7i\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2"+
		"\u00d4\u00d5\7q\2\2\u00d5\22\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7"+
		"c\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7c\2\2\u00da\24\3\2\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7s\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7q\2\2"+
		"\u00e3\26\3\2\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7"+
		"t\2\2\u00e7\u00e8\7c\2\2\u00e8\30\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\32\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7q\2\2\u00f1\34\3\2\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7u\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7\36\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7q\2\2"+
		"\u00fe \3\2\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7t\2\2\u0101\u0102\7q\2"+
		"\2\u0102\u0103\7i\2\2\u0103\u0104\7t\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7o\2\2\u0106\u0107\7c\2\2\u0107\"\3\2\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7e\2\2\u010b\u010c\7q\2\2\u010c\u010d\7n\2\2\u010d"+
		"\u010e\7j\2\2\u010e\u010f\7c\2\2\u010f$\3\2\2\2\u0110\u0111\7e\2\2\u0111"+
		"\u0112\7c\2\2\u0112\u0113\7u\2\2\u0113\u0114\7q\2\2\u0114&\3\2\2\2\u0115"+
		"\u0116\7e\2\2\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118\u0119\7v\2\2"+
		"\u0119\u011a\7t\2\2\u011a\u011b\7c\2\2\u011b\u011c\7t\2\2\u011c\u011d"+
		"\7k\2\2\u011d\u011e\7q\2\2\u011e(\3\2\2\2\u011f\u0120\7r\2\2\u0120\u0121"+
		"\7c\2\2\u0121\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123*\3\2\2\2\u0124\u0125"+
		"\7t\2\2\u0125\u0126\7g\2\2\u0126\u0127\7v\2\2\u0127\u0128\7q\2\2\u0128"+
		"\u0129\7t\2\2\u0129\u012a\7p\2\2\u012a\u012b\7g\2\2\u012b,\3\2\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7e\2\2\u012f\u0130\7n\2\2"+
		"\u0130\u0131\7w\2\2\u0131\u0132\7c\2\2\u0132.\3\2\2\2\u0133\u0134\7d\2"+
		"\2\u0134\u0135\7k\2\2\u0135\u0136\7d\2\2\u0136\u0137\7n\2\2\u0137\u0138"+
		"\7k\2\2\u0138\u0139\7q\2\2\u0139\u013a\7v\2\2\u013a\u013b\7g\2\2\u013b"+
		"\u013c\7e\2\2\u013c\u013d\7c\2\2\u013d\60\3\2\2\2\u013e\u013f\7p\2\2\u013f"+
		"\u0140\7c\2\2\u0140\u0141\7q\2\2\u0141\62\3\2\2\2\u0142\u0143\7g\2\2\u0143"+
		"\64\3\2\2\2\u0144\u0145\7q\2\2\u0145\u0146\7w\2\2\u0146\66\3\2\2\2\u0147"+
		"\u0148\7/\2\2\u01488\3\2\2\2\u0149\u014a\7-\2\2\u014a:\3\2\2\2\u014b\u014c"+
		"\7,\2\2\u014c<\3\2\2\2\u014d\u014e\7\61\2\2\u014e>\3\2\2\2\u014f\u0150"+
		"\7\'\2\2\u0150@\3\2\2\2\u0151\u0152\7?\2\2\u0152B\3\2\2\2\u0153\u0154"+
		"\7?\2\2\u0154\u0155\7?\2\2\u0155D\3\2\2\2\u0156\u0157\7#\2\2\u0157\u0158"+
		"\7?\2\2\u0158F\3\2\2\2\u0159\u015a\7@\2\2\u015aH\3\2\2\2\u015b\u015c\7"+
		">\2\2\u015cJ\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7?\2\2\u015fL\3\2"+
		"\2\2\u0160\u0161\7@\2\2\u0161\u0162\7?\2\2\u0162N\3\2\2\2\u0163\u0164"+
		"\7-\2\2\u0164\u0165\7-\2\2\u0165P\3\2\2\2\u0166\u0167\7/\2\2\u0167\u0168"+
		"\7/\2\2\u0168R\3\2\2\2\u0169\u016a\7>\2\2\u016a\u016b\7>\2\2\u016bT\3"+
		"\2\2\2\u016c\u016d\7@\2\2\u016d\u016e\7@\2\2\u016eV\3\2\2\2\u016f\u0170"+
		"\7`\2\2\u0170X\3\2\2\2\u0171\u0172\7~\2\2\u0172Z\3\2\2\2\u0173\u0174\7"+
		"\u0080\2\2\u0174\\\3\2\2\2\u0175\u0176\7/\2\2\u0176\u0177\7/\2\2\u0177"+
		"\u0178\7@\2\2\u0178^\3\2\2\2\u0179\u017a\7(\2\2\u017a`\3\2\2\2\u017b\u017c"+
		"\7-\2\2\u017c\u017d\7?\2\2\u017db\3\2\2\2\u017e\u017f\7/\2\2\u017f\u0180"+
		"\7?\2\2\u0180d\3\2\2\2\u0181\u0182\7,\2\2\u0182\u0183\7?\2\2\u0183f\3"+
		"\2\2\2\u0184\u0185\7\61\2\2\u0185\u0186\7?\2\2\u0186h\3\2\2\2\u0187\u018a"+
		"\5k\66\2\u0188\u018a\5m\67\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"j\3\2\2\2\u018b\u018c\7x\2\2\u018c\u018d\7g\2\2\u018d\u018e\7t\2\2\u018e"+
		"\u018f\7f\2\2\u018f\u0190\7c\2\2\u0190\u0191\7f\2\2\u0191\u0192\7g\2\2"+
		"\u0192\u0193\7k\2\2\u0193\u0194\7t\2\2\u0194\u0195\7q\2\2\u0195l\3\2\2"+
		"\2\u0196\u0197\7h\2\2\u0197\u0198\7c\2\2\u0198\u0199\7n\2\2\u0199\u019a"+
		"\7u\2\2\u019a\u019b\7q\2\2\u019bn\3\2\2\2\u019c\u019f\7)\2\2\u019d\u01a0"+
		"\5w<\2\u019e\u01a0\n\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\7)\2\2\u01a2p\3\2\2\2\u01a3\u01a4\7^\2\2\u01a4"+
		"\u01a8\t\3\2\2\u01a5\u01a8\5u;\2\u01a6\u01a8\5s:\2\u01a7\u01a3\3\2\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8r\3\2\2\2\u01a9\u01aa\7"+
		"^\2\2\u01aa\u01ab\4\62\65\2\u01ab\u01ac\4\629\2\u01ac\u01b3\4\629\2\u01ad"+
		"\u01ae\7^\2\2\u01ae\u01af\4\629\2\u01af\u01b3\4\629\2\u01b0\u01b1\7^\2"+
		"\2\u01b1\u01b3\4\629\2\u01b2\u01a9\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3t\3\2\2\2\u01b4\u01b5\7^\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7"+
		"\5y=\2\u01b7\u01b8\5y=\2\u01b8\u01b9\5y=\2\u01b9\u01ba\5y=\2\u01bav\3"+
		"\2\2\2\u01bb\u01bf\5q9\2\u01bc\u01bd\7^\2\2\u01bd\u01bf\7)\2\2\u01be\u01bb"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01bfx\3\2\2\2\u01c0\u01c1\t\4\2\2\u01c1"+
		"z\3\2\2\2\u01c2\u01c7\7$\2\2\u01c3\u01c6\5q9\2\u01c4\u01c6\13\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cb\7$\2\2\u01cb|\3\2\2\2\u01cc\u01cf\5\u0081A\2\u01cd\u01cf\7a\2\2"+
		"\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d4\3\2\2\2\u01d0\u01d3"+
		"\5\u0081A\2\u01d1\u01d3\t\5\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2"+
		"\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5~"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01dd\5}?\2\u01d8\u01d9\5\u0093J\2"+
		"\u01d9\u01da\5}?\2\u01da\u01dc\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u0080\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e1\t\6\2\2\u01e1\u0082\3\2\2\2\u01e2\u01e4\5\u0085"+
		"C\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\7\60\2\2\u01e8\u01ea\5"+
		"\u0085C\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01f5\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0"+
		"\7\60\2\2\u01ef\u01f1\5\u0085C\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2"+
		"\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01e3"+
		"\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f5\u0084\3\2\2\2\u01f6\u01f7\t\7\2\2\u01f7"+
		"\u0086\3\2\2\2\u01f8\u01fa\5\u0085C\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\bD\2\2\u01fe\u0088\3\2\2\2\u01ff\u0200\7\62\2\2\u0200\u0201\t\b"+
		"\2\2\u0201\u020f\5\u008bF\2\u0202\u020d\5\u008bF\2\u0203\u020b\5\u008b"+
		"F\2\u0204\u0209\5\u008bF\2\u0205\u0207\5\u008bF\2\u0206\u0208\5\u008b"+
		"F\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u0205\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0204\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u0203\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0202\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u008a\3\2\2\2\u0211\u0214\5\u0085C\2\u0212\u0214\t\t\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u008c\3\2\2\2\u0215\u0216\7\61"+
		"\2\2\u0216\u0217\7,\2\2\u0217\u021b\3\2\2\2\u0218\u021a\13\2\2\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021c\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7,\2\2\u021f"+
		"\u0220\7\61\2\2\u0220\u0221\3\2\2\2\u0221\u0222\bG\3\2\u0222\u008e\3\2"+
		"\2\2\u0223\u0224\7\61\2\2\u0224\u0225\7\61\2\2\u0225\u0229\3\2\2\2\u0226"+
		"\u0228\13\2\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u022a\3"+
		"\2\2\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022c"+
		"\u022e\t\n\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\bH"+
		"\3\2\u0230\u0090\3\2\2\2\u0231\u0233\t\13\2\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0237\bI\3\2\u0237\u0092\3\2\2\2\u0238\u0239\7\60\2\2\u0239"+
		"\u0094\3\2\2\2\u023a\u023b\7.\2\2\u023b\u0096\3\2\2\2\u023c\u023d\7=\2"+
		"\2\u023d\u0098\3\2\2\2\u023e\u023f\7<\2\2\u023f\u009a\3\2\2\2\36\2\u00cb"+
		"\u0189\u019f\u01a7\u01b2\u01be\u01c5\u01c7\u01ce\u01d2\u01d4\u01dd\u01e5"+
		"\u01eb\u01f2\u01f4\u01fb\u0207\u0209\u020b\u020d\u020f\u0213\u021b\u0229"+
		"\u022d\u0234\4\3D\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}