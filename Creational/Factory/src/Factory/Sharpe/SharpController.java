package Factory.Sharpe;

import Factory.matcha.Controller;
import Factory.matcha.ViewEngine;

public class SharpController extends Controller{

    @Override
    protected ViewEngine createViewEngine() {
        return new sharpViewEngine();
    }
    
}
