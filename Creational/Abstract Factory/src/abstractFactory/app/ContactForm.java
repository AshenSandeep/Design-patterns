package abstractFactory.app;

import abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.creaTextBox().render();
        factory.createButton().render();

        
    }
}
