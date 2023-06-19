package Command;

import Command.fx.Command;

public class ReSize implements Command{
    private CustomerService service;
    
    public ReSize(CustomerService service) {
        this.service = service;
    }

    @Override
    public void excute() {
        System.out.println("Resize");        
    }
    
}
