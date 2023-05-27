package org.example;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap();

    //1, make the constructor private, So we can not create instance of this class from outside
    private ConfigManager(){}

    //2.create static field for restoring an instance of this class
    private static ConfigManager instance = new ConfigManager();

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set (String key, Object value){
        settings.put(key, value);
    }

    public Object get(String key){
        return settings.get(key);
    }

}
