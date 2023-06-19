package Visitor;

public class HighlightOperation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight heading");
        
    }

    @Override
    public void apply(AnchoreNode anchor) {
        System.out.println("highlight anchor");
        
    }
    
}
