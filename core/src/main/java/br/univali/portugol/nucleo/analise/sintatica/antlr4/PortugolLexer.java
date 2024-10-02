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
		STRING=56, ID=57, ID_REGISTRO=58, ID_INSTANCIA_REGISTRO=59, REAL=60, INT=61, 
		HEXADECIMAL=62, COMENTARIO=63, COMENTARIO_SIMPLES=64, WS=65, PONTO=66, 
		VIRGULA=67, PONTOVIRGULA=68, DOISPONTOS=69;
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
			"ESC_UNICODE", "ESC_CARACTER", "DIGIT_HEX", "STRING", "ID", "ID_REGISTRO", 
			"ID_INSTANCIA_REGISTRO", "LETRA", "REAL", "DIGITO", "INT", "HEXADECIMAL", 
			"SIMBOLO_HEXADECIMAL", "COMENTARIO", "COMENTARIO_SIMPLES", "WS", "PONTO", 
			"VIRGULA", "PONTOVIRGULA", "DOISPONTOS"
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
		case 67:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u024f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00ce\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\5\65\u018c\n\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\58\u01a2\n8\38\38\39\39\39\39\59\u01aa\n9\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\5:\u01b5\n:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\5<\u01c1\n<\3=\3=\3>\3"+
		">\3>\7>\u01c8\n>\f>\16>\u01cb\13>\3>\3>\3?\3?\5?\u01d1\n?\3?\3?\7?\u01d5"+
		"\n?\f?\16?\u01d8\13?\3@\3@\5@\u01dc\n@\3@\3@\7@\u01e0\n@\f@\16@\u01e3"+
		"\13@\3A\3A\5A\u01e7\nA\3A\3A\7A\u01eb\nA\fA\16A\u01ee\13A\3B\3B\3C\6C"+
		"\u01f3\nC\rC\16C\u01f4\3C\3C\7C\u01f9\nC\fC\16C\u01fc\13C\3C\3C\6C\u0200"+
		"\nC\rC\16C\u0201\5C\u0204\nC\3D\3D\3E\6E\u0209\nE\rE\16E\u020a\3E\3E\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\5F\u0217\nF\5F\u0219\nF\5F\u021b\nF\5F\u021d\n"+
		"F\5F\u021f\nF\3G\3G\5G\u0223\nG\3H\3H\3H\3H\7H\u0229\nH\fH\16H\u022c\13"+
		"H\3H\3H\3H\3H\3H\3I\3I\3I\3I\7I\u0237\nI\fI\16I\u023a\13I\3I\5I\u023d"+
		"\nI\3I\3I\3J\6J\u0242\nJ\rJ\16J\u0243\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\5"+
		"\u01c9\u022a\u0238\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q\2s\2u\2w\2y\2{:};\177<\u0081=\u0083\2\u0085>\u0087"+
		"\2\u0089?\u008b@\u008d\2\u008fA\u0091B\u0093C\u0095D\u0097E\u0099F\u009b"+
		"G\3\2\f\3\2))\t\2$$^^ddhhppttvv\5\2\62;CHch\4\2\62;aa\4\2C\\c|\3\2\62"+
		";\4\2ZZzz\4\2CHch\3\3\f\f\5\2\13\f\17\17\"\"\2\u026b\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\3\u009d"+
		"\3\2\2\2\5\u009f\3\2\2\2\7\u00a1\3\2\2\2\t\u00a3\3\2\2\2\13\u00a5\3\2"+
		"\2\2\r\u00a7\3\2\2\2\17\u00cd\3\2\2\2\21\u00cf\3\2\2\2\23\u00d8\3\2\2"+
		"\2\25\u00dd\3\2\2\2\27\u00e6\3\2\2\2\31\u00eb\3\2\2\2\33\u00ee\3\2\2\2"+
		"\35\u00f4\3\2\2\2\37\u00fa\3\2\2\2!\u0101\3\2\2\2#\u010a\3\2\2\2%\u0112"+
		"\3\2\2\2\'\u0117\3\2\2\2)\u0121\3\2\2\2+\u0126\3\2\2\2-\u012e\3\2\2\2"+
		"/\u0135\3\2\2\2\61\u0140\3\2\2\2\63\u0144\3\2\2\2\65\u0146\3\2\2\2\67"+
		"\u0149\3\2\2\29\u014b\3\2\2\2;\u014d\3\2\2\2=\u014f\3\2\2\2?\u0151\3\2"+
		"\2\2A\u0153\3\2\2\2C\u0155\3\2\2\2E\u0158\3\2\2\2G\u015b\3\2\2\2I\u015d"+
		"\3\2\2\2K\u015f\3\2\2\2M\u0162\3\2\2\2O\u0165\3\2\2\2Q\u0168\3\2\2\2S"+
		"\u016b\3\2\2\2U\u016e\3\2\2\2W\u0171\3\2\2\2Y\u0173\3\2\2\2[\u0175\3\2"+
		"\2\2]\u0177\3\2\2\2_\u017b\3\2\2\2a\u017d\3\2\2\2c\u0180\3\2\2\2e\u0183"+
		"\3\2\2\2g\u0186\3\2\2\2i\u018b\3\2\2\2k\u018d\3\2\2\2m\u0198\3\2\2\2o"+
		"\u019e\3\2\2\2q\u01a9\3\2\2\2s\u01b4\3\2\2\2u\u01b6\3\2\2\2w\u01c0\3\2"+
		"\2\2y\u01c2\3\2\2\2{\u01c4\3\2\2\2}\u01d0\3\2\2\2\177\u01db\3\2\2\2\u0081"+
		"\u01e6\3\2\2\2\u0083\u01ef\3\2\2\2\u0085\u0203\3\2\2\2\u0087\u0205\3\2"+
		"\2\2\u0089\u0208\3\2\2\2\u008b\u020e\3\2\2\2\u008d\u0222\3\2\2\2\u008f"+
		"\u0224\3\2\2\2\u0091\u0232\3\2\2\2\u0093\u0241\3\2\2\2\u0095\u0247\3\2"+
		"\2\2\u0097\u0249\3\2\2\2\u0099\u024b\3\2\2\2\u009b\u024d\3\2\2\2\u009d"+
		"\u009e\7*\2\2\u009e\4\3\2\2\2\u009f\u00a0\7+\2\2\u00a0\6\3\2\2\2\u00a1"+
		"\u00a2\7]\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7_\2\2\u00a4\n\3\2\2\2\u00a5"+
		"\u00a6\7}\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8\16\3\2\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ce\7n\2\2"+
		"\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7t\2\2\u00b3\u00ce\7q\2\2\u00b4"+
		"\u00b5\7x\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7|\2\2\u00b7\u00b8\7k\2\2"+
		"\u00b8\u00ce\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7i\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7e\2\2\u00be\u00ce\7q\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00ce\7c\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7e\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\u00ce\7t\2\2\u00cd\u00a9\3\2\2"+
		"\2\u00cd\u00ad\3\2\2\2\u00cd\u00b4\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00bf"+
		"\3\2\2\2\u00cd\u00c5\3\2\2\2\u00ce\20\3\2\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7i\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\22\3\2"+
		"\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\24\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7s\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7q\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7c\2\2\u00ea\30\3\2\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\32\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7q\2\2"+
		"\u00f3\34\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7"+
		"p\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7v\2\2\u00f9\36\3\2\2\2\u00fa\u00fb"+
		"\7h\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7e\2\2\u00fe"+
		"\u00ff\7c\2\2\u00ff\u0100\7q\2\2\u0100 \3\2\2\2\u0101\u0102\7r\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104\u0105\7i\2\2\u0105\u0106\7t\2\2"+
		"\u0106\u0107\7c\2\2\u0107\u0108\7o\2\2\u0108\u0109\7c\2\2\u0109\"\3\2"+
		"\2\2\u010a\u010b\7g\2\2\u010b\u010c\7u\2\2\u010c\u010d\7e\2\2\u010d\u010e"+
		"\7q\2\2\u010e\u010f\7n\2\2\u010f\u0110\7j\2\2\u0110\u0111\7c\2\2\u0111"+
		"$\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7c\2\2\u0114\u0115\7u\2\2\u0115"+
		"\u0116\7q\2\2\u0116&\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119\7q\2\2\u0119"+
		"\u011a\7p\2\2\u011a\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c\u011d\7c\2\2"+
		"\u011d\u011e\7t\2\2\u011e\u011f\7k\2\2\u011f\u0120\7q\2\2\u0120(\3\2\2"+
		"\2\u0121\u0122\7r\2\2\u0122\u0123\7c\2\2\u0123\u0124\7t\2\2\u0124\u0125"+
		"\7g\2\2\u0125*\3\2\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129"+
		"\7v\2\2\u0129\u012a\7q\2\2\u012a\u012b\7t\2\2\u012b\u012c\7p\2\2\u012c"+
		"\u012d\7g\2\2\u012d,\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130"+
		"\u0131\7e\2\2\u0131\u0132\7n\2\2\u0132\u0133\7w\2\2\u0133\u0134\7c\2\2"+
		"\u0134.\3\2\2\2\u0135\u0136\7d\2\2\u0136\u0137\7k\2\2\u0137\u0138\7d\2"+
		"\2\u0138\u0139\7n\2\2\u0139\u013a\7k\2\2\u013a\u013b\7q\2\2\u013b\u013c"+
		"\7v\2\2\u013c\u013d\7g\2\2\u013d\u013e\7e\2\2\u013e\u013f\7c\2\2\u013f"+
		"\60\3\2\2\2\u0140\u0141\7p\2\2\u0141\u0142\7c\2\2\u0142\u0143\7q\2\2\u0143"+
		"\62\3\2\2\2\u0144\u0145\7g\2\2\u0145\64\3\2\2\2\u0146\u0147\7q\2\2\u0147"+
		"\u0148\7w\2\2\u0148\66\3\2\2\2\u0149\u014a\7/\2\2\u014a8\3\2\2\2\u014b"+
		"\u014c\7-\2\2\u014c:\3\2\2\2\u014d\u014e\7,\2\2\u014e<\3\2\2\2\u014f\u0150"+
		"\7\61\2\2\u0150>\3\2\2\2\u0151\u0152\7\'\2\2\u0152@\3\2\2\2\u0153\u0154"+
		"\7?\2\2\u0154B\3\2\2\2\u0155\u0156\7?\2\2\u0156\u0157\7?\2\2\u0157D\3"+
		"\2\2\2\u0158\u0159\7#\2\2\u0159\u015a\7?\2\2\u015aF\3\2\2\2\u015b\u015c"+
		"\7@\2\2\u015cH\3\2\2\2\u015d\u015e\7>\2\2\u015eJ\3\2\2\2\u015f\u0160\7"+
		">\2\2\u0160\u0161\7?\2\2\u0161L\3\2\2\2\u0162\u0163\7@\2\2\u0163\u0164"+
		"\7?\2\2\u0164N\3\2\2\2\u0165\u0166\7-\2\2\u0166\u0167\7-\2\2\u0167P\3"+
		"\2\2\2\u0168\u0169\7/\2\2\u0169\u016a\7/\2\2\u016aR\3\2\2\2\u016b\u016c"+
		"\7>\2\2\u016c\u016d\7>\2\2\u016dT\3\2\2\2\u016e\u016f\7@\2\2\u016f\u0170"+
		"\7@\2\2\u0170V\3\2\2\2\u0171\u0172\7`\2\2\u0172X\3\2\2\2\u0173\u0174\7"+
		"~\2\2\u0174Z\3\2\2\2\u0175\u0176\7\u0080\2\2\u0176\\\3\2\2\2\u0177\u0178"+
		"\7/\2\2\u0178\u0179\7/\2\2\u0179\u017a\7@\2\2\u017a^\3\2\2\2\u017b\u017c"+
		"\7(\2\2\u017c`\3\2\2\2\u017d\u017e\7-\2\2\u017e\u017f\7?\2\2\u017fb\3"+
		"\2\2\2\u0180\u0181\7/\2\2\u0181\u0182\7?\2\2\u0182d\3\2\2\2\u0183\u0184"+
		"\7,\2\2\u0184\u0185\7?\2\2\u0185f\3\2\2\2\u0186\u0187\7\61\2\2\u0187\u0188"+
		"\7?\2\2\u0188h\3\2\2\2\u0189\u018c\5k\66\2\u018a\u018c\5m\67\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018a\3\2\2\2\u018cj\3\2\2\2\u018d\u018e\7x\2\2\u018e\u018f"+
		"\7g\2\2\u018f\u0190\7t\2\2\u0190\u0191\7f\2\2\u0191\u0192\7c\2\2\u0192"+
		"\u0193\7f\2\2\u0193\u0194\7g\2\2\u0194\u0195\7k\2\2\u0195\u0196\7t\2\2"+
		"\u0196\u0197\7q\2\2\u0197l\3\2\2\2\u0198\u0199\7h\2\2\u0199\u019a\7c\2"+
		"\2\u019a\u019b\7n\2\2\u019b\u019c\7u\2\2\u019c\u019d\7q\2\2\u019dn\3\2"+
		"\2\2\u019e\u01a1\7)\2\2\u019f\u01a2\5w<\2\u01a0\u01a2\n\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7)\2\2\u01a4"+
		"p\3\2\2\2\u01a5\u01a6\7^\2\2\u01a6\u01aa\t\3\2\2\u01a7\u01aa\5u;\2\u01a8"+
		"\u01aa\5s:\2\u01a9\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2"+
		"\2\u01aar\3\2\2\2\u01ab\u01ac\7^\2\2\u01ac\u01ad\4\62\65\2\u01ad\u01ae"+
		"\4\629\2\u01ae\u01b5\4\629\2\u01af\u01b0\7^\2\2\u01b0\u01b1\4\629\2\u01b1"+
		"\u01b5\4\629\2\u01b2\u01b3\7^\2\2\u01b3\u01b5\4\629\2\u01b4\u01ab\3\2"+
		"\2\2\u01b4\u01af\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5t\3\2\2\2\u01b6\u01b7"+
		"\7^\2\2\u01b7\u01b8\7w\2\2\u01b8\u01b9\5y=\2\u01b9\u01ba\5y=\2\u01ba\u01bb"+
		"\5y=\2\u01bb\u01bc\5y=\2\u01bcv\3\2\2\2\u01bd\u01c1\5q9\2\u01be\u01bf"+
		"\7^\2\2\u01bf\u01c1\7)\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"x\3\2\2\2\u01c2\u01c3\t\4\2\2\u01c3z\3\2\2\2\u01c4\u01c9\7$\2\2\u01c5"+
		"\u01c8\5q9\2\u01c6\u01c8\13\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7$\2\2\u01cd|\3\2\2\2\u01ce"+
		"\u01d1\5\u0083B\2\u01cf\u01d1\7a\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3"+
		"\2\2\2\u01d1\u01d6\3\2\2\2\u01d2\u01d5\5\u0083B\2\u01d3\u01d5\t\5\2\2"+
		"\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7~\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01dc\5\u0083B\2\u01da\u01dc\7a\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3"+
		"\2\2\2\u01dc\u01e1\3\2\2\2\u01dd\u01e0\5\u0083B\2\u01de\u01e0\t\5\2\2"+
		"\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u0080\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4"+
		"\u01e7\5\u0083B\2\u01e5\u01e7\7a\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3"+
		"\2\2\2\u01e7\u01ec\3\2\2\2\u01e8\u01eb\5\u0083B\2\u01e9\u01eb\t\5\2\2"+
		"\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0082\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\t\6\2\2\u01f0\u0084\3\2\2\2\u01f1\u01f3\5\u0087D\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01fa\7\60\2\2\u01f7\u01f9\5\u0087D\2\u01f8\u01f7"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u0204\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\7\60\2\2\u01fe\u0200\5"+
		"\u0087D\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2"+
		"\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01f2\3\2\2\2\u0203\u01fd"+
		"\3\2\2\2\u0204\u0086\3\2\2\2\u0205\u0206\t\7\2\2\u0206\u0088\3\2\2\2\u0207"+
		"\u0209\5\u0087D\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\bE\2\2\u020d"+
		"\u008a\3\2\2\2\u020e\u020f\7\62\2\2\u020f\u0210\t\b\2\2\u0210\u021e\5"+
		"\u008dG\2\u0211\u021c\5\u008dG\2\u0212\u021a\5\u008dG\2\u0213\u0218\5"+
		"\u008dG\2\u0214\u0216\5\u008dG\2\u0215\u0217\5\u008dG\2\u0216\u0215\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0214\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0213\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021d\3\2\2\2\u021c\u0212\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0211\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u008c\3\2"+
		"\2\2\u0220\u0223\5\u0087D\2\u0221\u0223\t\t\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0221\3\2\2\2\u0223\u008e\3\2\2\2\u0224\u0225\7\61\2\2\u0225\u0226\7"+
		",\2\2\u0226\u022a\3\2\2\2\u0227\u0229\13\2\2\2\u0228\u0227\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\3\2"+
		"\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7,\2\2\u022e\u022f\7\61\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0231\bH\3\2\u0231\u0090\3\2\2\2\u0232\u0233\7\61"+
		"\2\2\u0233\u0234\7\61\2\2\u0234\u0238\3\2\2\2\u0235\u0237\13\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0239\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\t\n\2\2\u023c"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\bI\3\2\u023f\u0092\3\2"+
		"\2\2\u0240\u0242\t\13\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\bJ"+
		"\3\2\u0246\u0094\3\2\2\2\u0247\u0248\7\60\2\2\u0248\u0096\3\2\2\2\u0249"+
		"\u024a\7.\2\2\u024a\u0098\3\2\2\2\u024b\u024c\7=\2\2\u024c\u009a\3\2\2"+
		"\2\u024d\u024e\7<\2\2\u024e\u009c\3\2\2\2#\2\u00cd\u018b\u01a1\u01a9\u01b4"+
		"\u01c0\u01c7\u01c9\u01d0\u01d4\u01d6\u01db\u01df\u01e1\u01e6\u01ea\u01ec"+
		"\u01f4\u01fa\u0201\u0203\u020a\u0216\u0218\u021a\u021c\u021e\u0222\u022a"+
		"\u0238\u023c\u0243\4\3E\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}