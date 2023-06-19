package Command;

import Command.fx.Button;
import Command.fx.Command;

public class Main {
    public static void main(String [] args){
        var service= new  CustomerService ();

        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var command1 = new BlackAndWhite(service);
        var button1 = new Button(command1);
        button1.click();

        var command2 = new ReSize(service);
        var button2 = new Button(command2);
        button2.click();
            
        };
    }

