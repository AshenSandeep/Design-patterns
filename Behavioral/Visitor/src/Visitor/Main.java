package Visitor;

public class Main {
    public static void main (String[] args){
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add( new AnchoreNode());
        document.execute(new HighlightOperation());
    }
}
