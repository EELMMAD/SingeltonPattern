package org.example;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Eli");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));   //all the time have single instance of ConfigManager class

    }
}
