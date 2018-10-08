package com.tutorialspoint;

public class World {
    private String language;
    private String greetings;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String getLanguage() {
        System.out.println("World Language : " + language);
        return language;
    }

    public String getGreetings() {
        System.out.println("World Greetings : " + greetings);
        return greetings;
    }
}
