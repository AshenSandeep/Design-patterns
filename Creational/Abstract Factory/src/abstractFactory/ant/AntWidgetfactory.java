package abstractFactory.ant;

import abstractFactory.Button;
import abstractFactory.TextBox;
import abstractFactory.WidgetFactory;

public class AntWidgetfactory implements WidgetFactory{

    @Override
    public TextBox creaTextBox() {
        return new AntTextBox();
    }

    @Override
    public Button createButton() {
        return new AntButton();
    }
    
}
