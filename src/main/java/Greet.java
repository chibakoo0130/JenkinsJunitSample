package main.java;

public class Greet {

    public String greet(int hour) {
        if (hour < 5 || hour >= 18) {
            return "Good Evening!";
        } else if (hour > 10) {
            return "Hello!";
        } else {
            return "Good Morning!";
        }
    }
}
