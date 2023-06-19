package abstractFactory;

import abstractFactory.Material.MaterialWidgetFacory;
import abstractFactory.ant.AntWidgetfactory;
import abstractFactory.app.ContactForm;

public class Main {
    public static void main(String [] args){
        new ContactForm().render(new MaterialWidgetFacory());
    }
}
