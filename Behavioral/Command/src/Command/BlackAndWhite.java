package Command;

import Command.fx.Command;

public class BlackAndWhite implements Command{
    private CustomerService service;
    
    public BlackAndWhite(CustomerService service) {
        this.service = service;
    }
    @Override
    public void excute() {
        System.out.println("Black nad White");
        
    }
    
}
