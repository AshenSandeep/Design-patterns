package abstractFactory.Material;

import abstractFactory.Button;
import abstractFactory.TextBox;
import abstractFactory.WidgetFactory;

public class MaterialWidgetFacory implements WidgetFactory{

    @Override
    public TextBox creaTextBox() {
        return new MaterialTextBox();
    }

    @Override
    public Button createButton() {
        return new MaterialButton();
    }
    
}
