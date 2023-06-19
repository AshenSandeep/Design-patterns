package Mediator;

public class Button extends UIcontrol {
    public Button(DialogBox owner) {
        super(owner);
        
    }

    private boolean isEnable;

    public boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
        owner.changed(this);
    }
    
}