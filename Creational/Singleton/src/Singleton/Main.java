package Singleton;

public class Main {
    public static void main( String [] args){
        //ConfigManager man = new ConfigManager();
        ConfigManager maneger =  ConfigManager.getInstance();
        maneger.set("name","Ashen");

        ConfigManager other =  ConfigManager.getInstance();
        System.out.println(other.get("name"));
        
       // System.out.println(other.get("name"));

        
    }
}
