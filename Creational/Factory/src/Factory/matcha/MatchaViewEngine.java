package Factory.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    @Override
    public String render(String veiwName, Map<String,Object> contex){
        return "View render by Matcha";
    }

}
