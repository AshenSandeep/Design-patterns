package Mediator;

public class TextBox extends UIcontrol {
    private String content;

    public TextBox(DialogBox owner) {
        super(owner);
       
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}
