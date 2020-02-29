package com.company;

public class Main {

    public static void main(String[] args) {
	createObject("Eagle").print();
	createObject("Horse").print();
	createObject("Ilbirs").print();
    }

    public static Printable createObject(String className){

        Printable printable = null;
        if ("Eagle".equals(className)) {
            printable = new Eagle("Avalon", "Forest", 8);
        } else if ("Horse".equals(className)) {
            printable = new Horse("Spirit", "Prairie", 60);
        } else if ("Ilbirs".equals(className)) {
            printable = new Ilbirs("Flint", "Mountain", 7);
        }
        return printable;
    }
}
