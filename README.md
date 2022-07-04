# SourceCode-To-FlowChart
Generate flowchart by parsing the source code using antlr4 and graphviz<br><br>
<b>Steps to generate Flowchart:</b><br>
<ol>
<li>Install antlr4 and add the jar file</li>
<li>Write grammar .g4 for your code</li>
<li>Generate lexer, parser, tokens, Listener and BaseListener for grammar file</li>
<li>Enter the source code path and starting rule in the main java program</li>
<li>Use commands to generate parse tree (optional)</li>
<li>Compile and run java file</li>
<li>Generate a dot file using graphviz</li>
<li>Convert dot file to png image file</li>
</ol>
