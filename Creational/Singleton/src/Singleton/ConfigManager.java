package Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String,Object> setting = new HashMap<>();
    private static ConfigManager instance = null;

    private ConfigManager(){}
   

    public static ConfigManager getInstance() {
        if(instance == null)
        {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void set(String key,Object value){
        setting.put(key, value);
    }

    public Object get(String key){
        return setting.get(key);
    }
}
