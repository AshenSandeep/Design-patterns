package abstractFactory.Material;

import abstractFactory.Button;

public class MaterialButton implements Button{

    @Override
    public void render() {
                System.out.println("Material Button");
    }
    

}
