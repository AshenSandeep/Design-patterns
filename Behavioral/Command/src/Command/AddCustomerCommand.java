package Command;

import Command.fx.Command;

public class AddCustomerCommand implements Command{
    private CustomerService service;
    
    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void excute() {
      service.addCustomer();
        
    }
    
}
