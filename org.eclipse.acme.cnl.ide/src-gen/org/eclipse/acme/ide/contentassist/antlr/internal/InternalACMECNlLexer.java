package org.eclipse.acme.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalACMECNlLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=7;
    public static final int RULE_DATE=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalACMECNlLexer() {;} 
    public InternalACMECNlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalACMECNlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalACMECNl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:11:7: ( 'in' )
            // InternalACMECNl.g:11:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:12:7: ( 'a' )
            // InternalACMECNl.g:12:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13:7: ( 'an' )
            // InternalACMECNl.g:13:9: 'an'
            {
            match("an"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:14:7: ( 'implies' )
            // InternalACMECNl.g:14:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:15:7: ( 'when' )
            // InternalACMECNl.g:15:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:16:7: ( 'if' )
            // InternalACMECNl.g:16:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:17:7: ( 'where' )
            // InternalACMECNl.g:17:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:18:7: ( 'iff' )
            // InternalACMECNl.g:18:9: 'iff'
            {
            match("iff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:19:7: ( 'equals' )
            // InternalACMECNl.g:19:9: 'equals'
            {
            match("equals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:20:7: ( 'is' )
            // InternalACMECNl.g:20:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:21:7: ( 'before' )
            // InternalACMECNl.g:21:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:22:7: ( 'by' )
            // InternalACMECNl.g:22:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:23:7: ( 'after' )
            // InternalACMECNl.g:23:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:24:7: ( ',' )
            // InternalACMECNl.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:25:7: ( 'and' )
            // InternalACMECNl.g:25:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:26:7: ( 'false' )
            // InternalACMECNl.g:26:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:27:7: ( 'exists' )
            // InternalACMECNl.g:27:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:28:7: ( '+' )
            // InternalACMECNl.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:29:7: ( '-' )
            // InternalACMECNl.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:30:7: ( '*' )
            // InternalACMECNl.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:31:7: ( '/' )
            // InternalACMECNl.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:32:7: ( 'String' )
            // InternalACMECNl.g:32:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:33:7: ( 'Boolean' )
            // InternalACMECNl.g:33:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:34:7: ( 'Integer' )
            // InternalACMECNl.g:34:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:35:7: ( 'Decimal' )
            // InternalACMECNl.g:35:9: 'Decimal'
            {
            match("Decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:36:7: ( 'Date' )
            // InternalACMECNl.g:36:9: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:37:7: ( 'for' )
            // InternalACMECNl.g:37:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:38:7: ( 'all' )
            // InternalACMECNl.g:38:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:39:7: ( 'of' )
            // InternalACMECNl.g:39:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:40:7: ( 'the' )
            // InternalACMECNl.g:40:9: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:41:7: ( 'following' )
            // InternalACMECNl.g:41:9: 'following'
            {
            match("following"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:42:7: ( 'are' )
            // InternalACMECNl.g:42:9: 'are'
            {
            match("are"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:43:7: ( 'mandatory' )
            // InternalACMECNl.g:43:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:44:7: ( 'required' )
            // InternalACMECNl.g:44:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:45:7: ( 'needed' )
            // InternalACMECNl.g:45:9: 'needed'
            {
            match("needed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:46:7: ( 'obligatory' )
            // InternalACMECNl.g:46:9: 'obligatory'
            {
            match("obligatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:47:7: ( 'find' )
            // InternalACMECNl.g:47:9: 'find'
            {
            match("find"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:48:7: ( 'then' )
            // InternalACMECNl.g:48:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:49:7: ( 'data' )
            // InternalACMECNl.g:49:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:50:7: ( 'rule' )
            // InternalACMECNl.g:50:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:51:7: ( 'error' )
            // InternalACMECNl.g:51:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:52:7: ( 'message' )
            // InternalACMECNl.g:52:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:53:7: ( '<EOLExpression>' )
            // InternalACMECNl.g:53:9: '<EOLExpression>'
            {
            match("<EOLExpression>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:54:7: ( '</EOLExpression>' )
            // InternalACMECNl.g:54:9: '</EOLExpression>'
            {
            match("</EOLExpression>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:55:7: ( 'only' )
            // InternalACMECNl.g:55:9: 'only'
            {
            match("only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:56:7: ( 'or' )
            // InternalACMECNl.g:56:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:57:7: ( 'xor' )
            // InternalACMECNl.g:57:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:58:7: ( 'either' )
            // InternalACMECNl.g:58:9: 'either'
            {
            match("either"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:59:7: ( 'must' )
            // InternalACMECNl.g:59:9: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:60:7: ( 'be' )
            // InternalACMECNl.g:60:9: 'be'
            {
            match("be"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:61:7: ( 'not' )
            // InternalACMECNl.g:61:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:62:7: ( 'cannot' )
            // InternalACMECNl.g:62:9: 'cannot'
            {
            match("cannot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:63:7: ( 'greater' )
            // InternalACMECNl.g:63:9: 'greater'
            {
            match("greater"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:64:7: ( 'than' )
            // InternalACMECNl.g:64:9: 'than'
            {
            match("than"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:65:7: ( 'less' )
            // InternalACMECNl.g:65:9: 'less'
            {
            match("less"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:66:7: ( 'equal' )
            // InternalACMECNl.g:66:9: 'equal'
            {
            match("equal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:67:7: ( 'to' )
            // InternalACMECNl.g:67:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:68:7: ( 'later' )
            // InternalACMECNl.g:68:9: 'later'
            {
            match("later"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:69:7: ( 'on' )
            // InternalACMECNl.g:69:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:70:7: ( 'sum' )
            // InternalACMECNl.g:70:9: 'sum'
            {
            match("sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:71:7: ( 'average' )
            // InternalACMECNl.g:71:9: 'average'
            {
            match("average"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:72:7: ( 'maximum' )
            // InternalACMECNl.g:72:9: 'maximum'
            {
            match("maximum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:73:7: ( 'minimum' )
            // InternalACMECNl.g:73:9: 'minimum'
            {
            match("minimum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:74:7: ( 'unique' )
            // InternalACMECNl.g:74:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:75:7: ( 'any' )
            // InternalACMECNl.g:75:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:76:7: ( 'combination' )
            // InternalACMECNl.g:76:9: 'combination'
            {
            match("combination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:77:7: ( 'values' )
            // InternalACMECNl.g:77:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:78:7: ( 'from' )
            // InternalACMECNl.g:78:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:79:7: ( 'type' )
            // InternalACMECNl.g:79:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:80:7: ( ':' )
            // InternalACMECNl.g:80:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:81:7: ( 'value' )
            // InternalACMECNl.g:81:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:82:7: ( 'types' )
            // InternalACMECNl.g:82:9: 'types'
            {
            match("types"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:83:7: ( 'enumerations' )
            // InternalACMECNl.g:83:9: 'enumerations'
            {
            match("enumerations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:84:7: ( '{' )
            // InternalACMECNl.g:84:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:85:7: ( '}' )
            // InternalACMECNl.g:85:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:86:7: ( 'empty' )
            // InternalACMECNl.g:86:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:87:7: ( 'exist' )
            // InternalACMECNl.g:87:9: 'exist'
            {
            match("exist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:88:7: ( 'true' )
            // InternalACMECNl.g:88:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13021:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalACMECNl.g:13021:16: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalACMECNl.g:13021:16: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalACMECNl.g:13021:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalACMECNl.g:13021:21: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalACMECNl.g:13021:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalACMECNl.g:13021:37: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalACMECNl.g:13021:38: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13023:10: ( ( '-' )? ( '0' .. '9' )+ )
            // InternalACMECNl.g:13023:12: ( '-' )? ( '0' .. '9' )+
            {
            // InternalACMECNl.g:13023:12: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalACMECNl.g:13023:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalACMECNl.g:13023:17: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalACMECNl.g:13023:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13025:11: ( RULE_INT '-' RULE_INT '-' RULE_INT )
            // InternalACMECNl.g:13025:13: RULE_INT '-' RULE_INT '-' RULE_INT
            {
            mRULE_INT(); 
            match('-'); 
            mRULE_INT(); 
            match('-'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13027:9: ( ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | ( '`' | '[' ) ( '\\\\' . | ~ ( ( '\\\\' | '`' | '[' | ']' ) ) )* ( '`' | ']' ) ) )
            // InternalACMECNl.g:13027:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | ( '`' | '[' ) ( '\\\\' . | ~ ( ( '\\\\' | '`' | '[' | ']' ) ) )* ( '`' | ']' ) )
            {
            // InternalACMECNl.g:13027:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | ( '`' | '[' ) ( '\\\\' . | ~ ( ( '\\\\' | '`' | '[' | ']' ) ) )* ( '`' | ']' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='^' && LA9_0<='_')||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='['||LA9_0=='`') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalACMECNl.g:13027:12: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // InternalACMECNl.g:13027:12: ( '^' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='^') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalACMECNl.g:13027:12: '^'
                            {
                            match('^'); 

                            }
                            break;

                    }

                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalACMECNl.g:13027:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalACMECNl.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:13027:75: ( '`' | '[' ) ( '\\\\' . | ~ ( ( '\\\\' | '`' | '[' | ']' ) ) )* ( '`' | ']' )
                    {
                    if ( input.LA(1)=='['||input.LA(1)=='`' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalACMECNl.g:13027:85: ( '\\\\' . | ~ ( ( '\\\\' | '`' | '[' | ']' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='Z')||(LA8_0>='^' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalACMECNl.g:13027:86: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACMECNl.g:13027:93: ~ ( ( '\\\\' | '`' | '[' | ']' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    if ( input.LA(1)==']'||input.LA(1)=='`' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13029:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalACMECNl.g:13029:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalACMECNl.g:13029:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalACMECNl.g:13029:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalACMECNl.g:13029:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalACMECNl.g:13029:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACMECNl.g:13029:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalACMECNl.g:13029:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalACMECNl.g:13029:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalACMECNl.g:13029:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalACMECNl.g:13029:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13031:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalACMECNl.g:13031:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalACMECNl.g:13031:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalACMECNl.g:13031:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13033:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalACMECNl.g:13033:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalACMECNl.g:13033:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalACMECNl.g:13033:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalACMECNl.g:13033:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalACMECNl.g:13033:41: ( '\\r' )? '\\n'
                    {
                    // InternalACMECNl.g:13033:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalACMECNl.g:13033:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13035:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalACMECNl.g:13035:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalACMECNl.g:13035:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalACMECNl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalACMECNl.g:13037:16: ( . )
            // InternalACMECNl.g:13037:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalACMECNl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_DECIMAL | RULE_INT | RULE_DATE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=87;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalACMECNl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalACMECNl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalACMECNl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalACMECNl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalACMECNl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalACMECNl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalACMECNl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalACMECNl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalACMECNl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalACMECNl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalACMECNl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalACMECNl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalACMECNl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalACMECNl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalACMECNl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalACMECNl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalACMECNl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalACMECNl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalACMECNl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalACMECNl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalACMECNl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalACMECNl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalACMECNl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalACMECNl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalACMECNl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalACMECNl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalACMECNl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalACMECNl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalACMECNl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalACMECNl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalACMECNl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalACMECNl.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalACMECNl.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalACMECNl.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalACMECNl.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalACMECNl.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalACMECNl.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalACMECNl.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalACMECNl.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalACMECNl.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalACMECNl.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalACMECNl.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalACMECNl.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalACMECNl.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalACMECNl.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalACMECNl.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalACMECNl.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalACMECNl.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalACMECNl.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalACMECNl.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalACMECNl.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalACMECNl.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalACMECNl.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalACMECNl.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalACMECNl.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalACMECNl.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // InternalACMECNl.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // InternalACMECNl.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // InternalACMECNl.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // InternalACMECNl.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // InternalACMECNl.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // InternalACMECNl.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // InternalACMECNl.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // InternalACMECNl.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // InternalACMECNl.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // InternalACMECNl.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // InternalACMECNl.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // InternalACMECNl.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // InternalACMECNl.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // InternalACMECNl.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // InternalACMECNl.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // InternalACMECNl.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // InternalACMECNl.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // InternalACMECNl.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // InternalACMECNl.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // InternalACMECNl.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // InternalACMECNl.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // InternalACMECNl.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // InternalACMECNl.g:1:478: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 80 :
                // InternalACMECNl.g:1:491: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 81 :
                // InternalACMECNl.g:1:500: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 82 :
                // InternalACMECNl.g:1:510: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 83 :
                // InternalACMECNl.g:1:518: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 84 :
                // InternalACMECNl.g:1:530: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 85 :
                // InternalACMECNl.g:1:546: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // InternalACMECNl.g:1:562: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 87 :
                // InternalACMECNl.g:1:570: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\55\1\63\3\55\1\uffff\1\55\1\uffff\1\104\1\uffff\1\110\12\55\1\50\7\55\3\uffff\1\156\1\50\1\uffff\3\50\2\uffff\1\162\1\55\1\165\1\166\1\uffff\1\171\4\55\1\uffff\7\55\1\u0086\1\u0087\1\uffff\4\55\1\uffff\1\156\5\uffff\5\55\1\u0092\1\55\1\u0095\1\u0096\1\55\1\u0099\13\55\2\uffff\11\55\11\uffff\1\55\1\u00b0\2\uffff\1\u00b1\1\u00b2\1\uffff\1\55\1\u00b4\1\u00b5\11\55\2\uffff\1\55\1\u00c1\10\55\1\uffff\2\55\2\uffff\1\u00cd\1\55\1\uffff\12\55\1\u00d9\1\55\1\u00db\5\55\1\u00e1\3\55\3\uffff\1\55\2\uffff\1\55\1\u00e7\11\55\1\uffff\1\55\1\u00f2\1\u00f3\4\55\1\u00f8\1\55\1\u00fa\1\u00fb\1\uffff\1\u00fc\1\u00fe\1\u00ff\3\55\1\u0103\2\55\1\u0106\1\55\1\uffff\1\u0108\1\uffff\3\55\1\u010c\1\55\1\uffff\3\55\1\u0111\1\55\1\uffff\1\u0113\1\u0115\1\u0117\1\u0118\2\55\1\u011b\1\55\1\u011d\1\55\2\uffff\4\55\1\uffff\1\55\3\uffff\1\u0124\2\uffff\3\55\1\uffff\2\55\1\uffff\1\55\1\uffff\3\55\1\uffff\1\u012e\1\55\1\u0131\1\55\1\uffff\1\55\1\uffff\1\u0134\1\uffff\1\u0135\2\uffff\1\u0136\1\55\1\uffff\1\u0138\1\uffff\1\55\1\u013a\4\55\1\uffff\5\55\1\u0144\1\u0145\2\55\1\uffff\1\u0148\1\u0149\1\uffff\1\u014a\1\u014b\3\uffff\1\55\1\uffff\1\55\1\uffff\1\u014e\1\u014f\1\u0150\2\55\1\u0153\1\u0154\1\u0155\1\55\2\uffff\1\55\1\u0158\4\uffff\2\55\3\uffff\2\55\3\uffff\1\u015d\1\55\1\uffff\1\55\1\u0160\1\55\1\u0162\1\uffff\2\55\1\uffff\1\u0165\1\uffff\2\55\1\uffff\1\u0168\1\u0169\2\uffff";
    static final String DFA18_eofS =
        "\u016a\uffff";
    static final String DFA18_minS =
        "\1\0\1\146\1\60\1\150\1\151\1\145\1\uffff\1\141\1\uffff\1\60\1\uffff\1\52\1\164\1\157\1\156\1\141\1\142\1\150\1\141\2\145\1\141\1\57\1\157\1\141\1\162\1\141\1\165\1\156\1\141\3\uffff\1\55\1\101\1\uffff\3\0\2\uffff\1\60\1\160\2\60\1\uffff\1\60\1\164\1\154\2\145\1\uffff\1\145\1\165\1\151\1\162\1\164\1\165\1\160\2\60\1\uffff\2\154\1\156\1\157\1\uffff\1\55\5\uffff\1\162\1\157\1\164\1\143\1\164\1\60\1\154\2\60\1\141\1\60\1\160\1\165\1\156\2\163\1\156\1\161\1\154\1\145\2\164\2\uffff\1\162\1\156\1\155\1\145\1\163\1\164\1\155\1\151\1\154\11\uffff\1\154\1\60\2\uffff\2\60\1\uffff\1\145\2\60\1\162\1\156\1\141\1\163\1\157\1\150\1\155\1\164\1\157\2\uffff\1\163\1\60\1\154\1\144\1\155\1\151\1\154\1\145\1\151\1\145\1\uffff\1\151\1\171\2\uffff\1\60\1\156\1\uffff\2\145\1\144\1\151\1\163\1\164\1\151\1\165\1\145\1\144\1\60\1\141\1\60\1\156\1\142\1\141\1\163\1\145\1\60\1\161\1\165\1\151\3\uffff\1\162\2\uffff\1\141\1\60\1\145\1\154\1\164\1\162\2\145\1\171\1\162\1\145\1\uffff\1\157\2\60\1\156\1\145\1\147\1\155\1\60\1\147\2\60\1\uffff\3\60\1\141\1\155\1\141\1\60\1\155\1\151\1\60\1\145\1\uffff\1\60\1\uffff\1\157\1\151\1\164\1\60\1\162\1\uffff\1\165\2\145\1\60\1\147\1\uffff\4\60\2\162\1\60\1\145\1\60\1\167\2\uffff\1\147\1\141\1\145\1\141\1\uffff\1\141\3\uffff\1\60\2\uffff\1\164\1\165\1\147\1\uffff\1\165\1\162\1\uffff\1\144\1\uffff\1\164\1\156\1\145\1\uffff\1\60\1\145\1\60\1\163\1\uffff\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\141\1\uffff\1\60\1\uffff\1\151\1\60\1\156\1\162\1\154\1\164\1\uffff\1\157\1\155\1\145\1\155\1\145\2\60\1\141\1\162\1\uffff\2\60\1\uffff\2\60\3\uffff\1\164\1\uffff\1\156\1\uffff\3\60\1\157\1\162\3\60\1\144\2\uffff\1\164\1\60\4\uffff\1\151\1\147\3\uffff\1\162\1\171\3\uffff\1\60\1\151\1\uffff\1\157\1\60\1\171\1\60\1\uffff\1\157\1\156\1\uffff\1\60\1\uffff\1\156\1\163\1\uffff\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\163\1\172\1\150\1\170\1\171\1\uffff\1\162\1\uffff\1\71\1\uffff\1\57\1\164\1\157\1\156\1\145\1\162\1\171\2\165\1\157\1\141\1\105\2\157\1\162\1\145\1\165\1\156\1\141\3\uffff\1\71\1\172\1\uffff\3\uffff\2\uffff\1\172\1\160\2\172\1\uffff\1\172\1\164\1\154\2\145\1\uffff\1\145\1\165\1\151\1\162\1\164\1\165\1\160\2\172\1\uffff\1\154\1\162\1\156\1\157\1\uffff\1\71\5\uffff\1\162\1\157\1\164\1\143\1\164\1\172\1\154\2\172\1\145\1\172\1\160\1\165\1\170\2\163\1\156\1\161\1\154\1\145\2\164\2\uffff\1\162\1\156\1\155\1\145\1\163\1\164\1\155\1\151\1\154\11\uffff\1\154\1\172\2\uffff\2\172\1\uffff\1\145\2\172\2\162\1\141\1\163\1\157\1\150\1\155\1\164\1\157\2\uffff\1\163\1\172\1\154\1\144\1\155\1\151\1\154\1\145\1\151\1\145\1\uffff\1\151\1\171\2\uffff\1\172\1\156\1\uffff\2\145\1\144\1\151\1\163\1\164\1\151\1\165\1\145\1\144\1\172\1\141\1\172\1\156\1\142\1\141\1\163\1\145\1\172\1\161\1\165\1\151\3\uffff\1\162\2\uffff\1\141\1\172\1\145\1\154\1\164\1\162\2\145\1\171\1\162\1\145\1\uffff\1\157\2\172\1\156\1\145\1\147\1\155\1\172\1\147\2\172\1\uffff\3\172\1\141\1\155\1\141\1\172\1\155\1\151\1\172\1\145\1\uffff\1\172\1\uffff\1\157\1\151\1\164\1\172\1\162\1\uffff\1\165\2\145\1\172\1\147\1\uffff\4\172\2\162\1\172\1\145\1\172\1\167\2\uffff\1\147\1\141\1\145\1\141\1\uffff\1\141\3\uffff\1\172\2\uffff\1\164\1\165\1\147\1\uffff\1\165\1\162\1\uffff\1\144\1\uffff\1\164\1\156\1\145\1\uffff\1\172\1\145\1\172\1\163\1\uffff\1\145\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\141\1\uffff\1\172\1\uffff\1\151\1\172\1\156\1\162\1\154\1\164\1\uffff\1\157\1\155\1\145\1\155\1\145\2\172\1\141\1\162\1\uffff\2\172\1\uffff\2\172\3\uffff\1\164\1\uffff\1\156\1\uffff\3\172\1\157\1\162\3\172\1\144\2\uffff\1\164\1\172\4\uffff\1\151\1\147\3\uffff\1\162\1\171\3\uffff\1\172\1\151\1\uffff\1\157\1\172\1\171\1\172\1\uffff\1\157\1\156\1\uffff\1\172\1\uffff\1\156\1\163\1\uffff\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\6\uffff\1\16\1\uffff\1\22\1\uffff\1\24\23\uffff\1\106\1\112\1\113\2\uffff\1\122\3\uffff\1\126\1\127\4\uffff\1\122\5\uffff\1\2\11\uffff\1\16\4\uffff\1\22\1\uffff\1\23\1\24\1\124\1\125\1\25\26\uffff\1\53\1\54\11\uffff\1\106\1\112\1\113\1\117\1\120\1\121\1\123\1\126\1\1\2\uffff\1\6\1\12\2\uffff\1\3\14\uffff\1\62\1\14\12\uffff\1\35\2\uffff\1\73\1\56\2\uffff\1\71\26\uffff\1\10\1\17\1\101\1\uffff\1\34\1\40\13\uffff\1\33\13\uffff\1\36\13\uffff\1\63\1\uffff\1\57\5\uffff\1\74\5\uffff\1\5\12\uffff\1\45\1\104\4\uffff\1\32\1\uffff\1\55\1\46\1\66\1\uffff\1\105\1\116\3\uffff\1\61\2\uffff\1\50\1\uffff\1\47\3\uffff\1\67\4\uffff\1\15\1\uffff\1\7\1\uffff\1\70\1\uffff\1\115\1\51\2\uffff\1\114\1\uffff\1\20\6\uffff\1\110\11\uffff\1\72\2\uffff\1\107\2\uffff\1\11\1\21\1\60\1\uffff\1\13\1\uffff\1\26\11\uffff\1\43\1\64\2\uffff\1\100\1\103\1\4\1\75\2\uffff\1\27\1\30\1\31\2\uffff\1\76\1\52\1\77\2\uffff\1\65\4\uffff\1\42\2\uffff\1\37\1\uffff\1\41\2\uffff\1\44\2\uffff\1\102\1\111";
    static final String DFA18_specialS =
        "\1\2\43\uffff\1\1\1\3\1\0\u0143\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\50\1\45\4\50\1\46\2\50\1\12\1\10\1\6\1\11\1\50\1\13\12\41\1\36\1\50\1\26\4\50\1\43\1\15\1\43\1\17\4\43\1\16\11\43\1\14\7\43\1\44\2\50\1\42\1\43\1\44\1\2\1\5\1\30\1\25\1\4\1\7\1\31\1\43\1\1\2\43\1\32\1\22\1\24\1\20\2\43\1\23\1\33\1\21\1\34\1\35\1\3\1\27\2\43\1\37\1\50\1\40\uff82\50",
            "\1\53\6\uffff\1\52\1\51\4\uffff\1\54",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\57\5\55\1\60\1\55\1\56\3\55\1\61\3\55\1\62\4\55",
            "\1\64",
            "\1\70\3\uffff\1\72\1\71\2\uffff\1\65\1\67\5\uffff\1\66",
            "\1\73\23\uffff\1\74",
            "",
            "\1\76\7\uffff\1\100\5\uffff\1\77\2\uffff\1\101",
            "",
            "\12\103",
            "",
            "\1\106\4\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\3\uffff\1\114",
            "\1\117\3\uffff\1\116\7\uffff\1\120\3\uffff\1\121",
            "\1\122\6\uffff\1\123\2\uffff\1\125\6\uffff\1\124",
            "\1\126\3\uffff\1\127\3\uffff\1\131\13\uffff\1\130",
            "\1\132\17\uffff\1\133",
            "\1\134\11\uffff\1\135",
            "\1\136",
            "\1\140\25\uffff\1\137",
            "\1\141",
            "\1\142\15\uffff\1\143",
            "\1\144",
            "\1\146\3\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "\1\157\1\155\1\uffff\12\103",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\133\55\1\uffff\uffa4\55",
            "\0\160",
            "\0\160",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\163",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\164\24\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\167\24\55\1\170\1\55",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\u0085\24\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0088",
            "\1\u008a\5\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\157\1\155\1\uffff\12\103",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0093",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0094\16\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0098\3\uffff\1\u0097",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\11\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00af",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00b3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b6",
            "\1\u00b7\3\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\1\u00c0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u00cc\14\55",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00da",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "",
            "",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00fd\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0104",
            "\1\u0105",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0107",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0112",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0114\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0116\7\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0119",
            "\1\u011a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011e",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0130\7\55",
            "\1\u0132",
            "",
            "\1\u0133",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0137",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0139",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0146",
            "\1\u0147",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u014c",
            "",
            "\1\u014d",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0151",
            "\1\u0152",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0156",
            "",
            "",
            "\1\u0157",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "",
            "\1\u015b",
            "\1\u015c",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015e",
            "",
            "\1\u015f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0161",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0163",
            "\1\u0164",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0166",
            "\1\u0167",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_DECIMAL | RULE_INT | RULE_DATE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_38 = input.LA(1);

                        s = -1;
                        if ( ((LA18_38>='\u0000' && LA18_38<='\uFFFF')) ) {s = 112;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_36 = input.LA(1);

                        s = -1;
                        if ( ((LA18_36>='\u0000' && LA18_36<='Z')||(LA18_36>='\\' && LA18_36<='\uFFFF')) ) {s = 45;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='i') ) {s = 1;}

                        else if ( (LA18_0=='a') ) {s = 2;}

                        else if ( (LA18_0=='w') ) {s = 3;}

                        else if ( (LA18_0=='e') ) {s = 4;}

                        else if ( (LA18_0=='b') ) {s = 5;}

                        else if ( (LA18_0==',') ) {s = 6;}

                        else if ( (LA18_0=='f') ) {s = 7;}

                        else if ( (LA18_0=='+') ) {s = 8;}

                        else if ( (LA18_0=='-') ) {s = 9;}

                        else if ( (LA18_0=='*') ) {s = 10;}

                        else if ( (LA18_0=='/') ) {s = 11;}

                        else if ( (LA18_0=='S') ) {s = 12;}

                        else if ( (LA18_0=='B') ) {s = 13;}

                        else if ( (LA18_0=='I') ) {s = 14;}

                        else if ( (LA18_0=='D') ) {s = 15;}

                        else if ( (LA18_0=='o') ) {s = 16;}

                        else if ( (LA18_0=='t') ) {s = 17;}

                        else if ( (LA18_0=='m') ) {s = 18;}

                        else if ( (LA18_0=='r') ) {s = 19;}

                        else if ( (LA18_0=='n') ) {s = 20;}

                        else if ( (LA18_0=='d') ) {s = 21;}

                        else if ( (LA18_0=='<') ) {s = 22;}

                        else if ( (LA18_0=='x') ) {s = 23;}

                        else if ( (LA18_0=='c') ) {s = 24;}

                        else if ( (LA18_0=='g') ) {s = 25;}

                        else if ( (LA18_0=='l') ) {s = 26;}

                        else if ( (LA18_0=='s') ) {s = 27;}

                        else if ( (LA18_0=='u') ) {s = 28;}

                        else if ( (LA18_0=='v') ) {s = 29;}

                        else if ( (LA18_0==':') ) {s = 30;}

                        else if ( (LA18_0=='{') ) {s = 31;}

                        else if ( (LA18_0=='}') ) {s = 32;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 33;}

                        else if ( (LA18_0=='^') ) {s = 34;}

                        else if ( (LA18_0=='A'||LA18_0=='C'||(LA18_0>='E' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='R')||(LA18_0>='T' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='h'||(LA18_0>='j' && LA18_0<='k')||(LA18_0>='p' && LA18_0<='q')||(LA18_0>='y' && LA18_0<='z')) ) {s = 35;}

                        else if ( (LA18_0=='['||LA18_0=='`') ) {s = 36;}

                        else if ( (LA18_0=='\"') ) {s = 37;}

                        else if ( (LA18_0=='\'') ) {s = 38;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 39;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='(' && LA18_0<=')')||LA18_0=='.'||LA18_0==';'||(LA18_0>='=' && LA18_0<='@')||(LA18_0>='\\' && LA18_0<=']')||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_37 = input.LA(1);

                        s = -1;
                        if ( ((LA18_37>='\u0000' && LA18_37<='\uFFFF')) ) {s = 112;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}