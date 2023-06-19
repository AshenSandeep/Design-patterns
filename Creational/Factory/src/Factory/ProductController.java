package Factory;

import java.util.HashMap;
import java.util.Map;

import Factory.Sharpe.SharpController;
import Factory.matcha.Controller;
import Factory.matcha.MatchaViewEngine;


public class ProductController extends SharpController{
    public void listProducts(){
        //get product from database
        Map<String, Object> context = new HashMap<>();
        //context.put(products)
        render("Product.html", context);
        
    }
    
}
