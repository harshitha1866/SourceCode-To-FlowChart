import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.util.Map.Entry;
public class Test {
public static void main(String[] args) throws Exception {
        CharStream input =  CharStreams.fromFileName("C:\\Users\\HARSHITHA\\Downloads\\zoho\\Sample.c");
        XLexer lexer = new XLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XParser parser = new XParser(tokens);
        ParseTree tree = parser.translationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        PrintEverything listener = new PrintEverything();
        walker.walk(listener, tree);
        System.err.println("List: " + listener.map);
        int len = listener.map.size();
        ArrayList<String> terminals = listener.map();
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("if");
        headers.add("else");
        headers.add("for");
        headers.add("while");
        headers.add("switch");
        Integer start=0, end=0;
        HashMap<Integer, ArrayList<String>> blocks = new HashMap<Integer, ArrayList<String>>();
        for(int i=0;i<len;i++){
            if(i==0 || headers.contains(terminals.get(i))){
                start = 0;
                String s = "";
                for(Integer j=i+1; j<len; j++){
                    if(terminals.equals("{"));
                }
            }
        }
    }
}