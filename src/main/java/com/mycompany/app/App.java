package com.mycompany.app;

/**
 * Hello world!
 * Angel
 */
public class App
{

    private final String message = "Hello World!";
    private final String name= "Angel";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getName());
    }

    private final String getMessage() {
        return message;
    }

    private final String getName() {
        return name;
    }

}