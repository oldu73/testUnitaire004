package main.java.com.company;

public class Main {

    public static void main(String[] args) {

        // Hello world
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getHello());
        helloWorld.setHello("Hello, you ;-)");
        System.out.println(helloWorld.getHello());

        System.out.println();

        // Operations

        final long addition = Operations.add(2);
        System.out.println("addition: " + addition);

        System.out.println();

        try {
            final long division = Operations.diviser(24, 4, 2);
            System.out.println("division: " + division);
        } catch (IllegalArgumentException | ArithmeticException e) {
            //System.out.println("Exception!!");
            System.out.println(e);
            //e.printStackTrace();
        }

    }
}
