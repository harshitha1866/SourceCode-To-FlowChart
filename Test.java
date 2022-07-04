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
//System.out.println(tree.toStringTree(parser));
ParseTreeWalker walker = new ParseTreeWalker();
PrintEverything listener = new PrintEverything();
walker.walk(listener, tree);
System.err.println("List: " + listener.map);
// String[] arr = dotMap(listener.map);
// System.err.println("New hash: " + newMap);
// Integer prev = 0;
// Digraph graph = new Digraph("test_Graph");
// Integer i=0,j;
// arr[i] = "Start";
// for(int k = 0;k<arr.length;k++)
// 	System.out.println(arr[k]);
// graph.addNode(i.toString(),arr[i]);
// 	for(i=1;i<arr.length;i++){
// 	Integer key = i;
// 	if(arr[i]!=null){
// 		// if while switch condition
// 		if(arr[i].contains("if"))
// 		{
// 			graph.addNode(key.toString(),arr[i], "diamond");
// 			for(j=i+1;j<arr.length;j++){
// 				if(arr[j].contains("else"))
// 				{
// 					System.out.println("Found else..");
// 					graph.addNode(j.toString(),arr[j], "rectangle");
// 					graph.link(i.toString(), j.toString());
// 					break;
// 				}
// 			}
// 		} 
// 		else if(arr[i].contains("for")) {
// 			graph.addNode(key.toString(), arr[i], "rectangle");
// 			graph.link(i.toString(), i.toString());
// 		}
// 		else if(arr[i].contains("while")) {
// 			graph.addNode(key.toString(), arr[i], "diamond");
// 			graph.link(i.toString(), i.toString());
// 		}
// 		else if(arr[i].contains("switch")){
// 			graph.addNode(key.toString(),arr[i], "diamond");
// 			for(j=i+1;j<arr.length;j++){
// 				if(arr[j].contains("case"))
// 				{
// 					graph.addNode(j.toString(),arr[j], "rectangle");
// 					graph.link(i.toString(), j.toString());
// 				}
// 				else{
// 					break;
// 				}
// 			}
// 			i = j;
// 		}
// 		else if(!arr[i].contains("else"))
// 			graph.addNode(key.toString(), arr[i], "rectangle");
// 		graph.link(prev.toString(), key.toString());
// 	}

// 	prev =  key;
// 	}
// 	graph.generate("graph3.dot");

}
// public static String[] dotMap(HashMap<Integer, ArrayList<String>> map)
// {
// 	int i=0;
// 	String[] newMap = new String[map.size()+1];
// 	for(Entry<Integer, ArrayList<String>> entry : map.entrySet()){
// 		ArrayList<String> arr = entry.getValue();
// 		String k[] = arr.toArray(new String[arr.size()]);
// 		String s = "";
// 		for(String str : k)
// 		{
// 			if(!str.equals(" ")){
// 				if(str.contains("\"")){
// 					str = str.replaceAll("\"","");
// 				}
// 				if(str.contains("%")){
// 					str = str.replaceAll("%","mod ");
// 				}		
// 			s= s + str + " ";
// 			}
// 		//System.err.println("String: " + s);
// 		}
// 		if(s!=null)
// 		newMap[i++] = s;
// 	}
// 		return newMap;
// }
}
