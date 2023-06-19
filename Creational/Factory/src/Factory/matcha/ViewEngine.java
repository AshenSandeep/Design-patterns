package Factory.matcha;

import java.util.Map;

public interface ViewEngine {

    String render(String veiwName, Map<String, Object> contex);

}