package Mediator;

public class ListBox extends UIcontrol {
    
    private String selection;
    
    public ListBox(DialogBox owner) {
        super(owner);
        
    }
    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this);
    }
    
}
