package com.tutorialspoint;

public class Bangladesh {
    private String language;
    private String greetings;
    private String primaryLanguage;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public String getLanguage() {
        System.out.println("Bangladesh Language : " + language);
        return language;
    }

    public String getGreetings() {
        System.out.println("Bangladesh Greetings : " + greetings);
        return greetings;
    }

    public String getPrimaryLanguage() {
        System.out.println("Bangladesh PrimaryLanguage : " + primaryLanguage);
        return primaryLanguage;
    }
}
