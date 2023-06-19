package Factory.Sharpe;

import java.util.Map;

import Factory.matcha.ViewEngine;

public class sharpViewEngine implements ViewEngine {

    @Override
    public String render(String veiwName, Map<String, Object> contex) {
        return "View render by sharp";
    }
    
}
