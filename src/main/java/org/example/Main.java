package org.example;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = new ConfigManager();
        manager.set("name", "Eli");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));

    }
}
