package my;

import java.util.Scanner;

public class exersisetrain {

    public static void main(String[] args) {

        whileLoopExample();
        doWhileLoopExample();
        forLoopExample();
        forEachLoopExample();

    }

    public static void whileLoopExample() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a password");
        String password = s.nextLine();

        String expectedPassword = "secret123";

        while (!password.equals(expectedPassword)) {
            System.out.println("Please enter a password");
            password = s.nextLine();
        }
    }

    public static void doWhileLoopExample() {

        Scanner s = new Scanner(System.in);
        String password;

        String expectedPassword = "secret123";

        do {
            System.out.println("Please enter a password");
            password = s.nextLine();
        }
        while (!password.equals(expectedPassword));
    }

    public static void forLoopExample() {
    }

    public static void forEachLoopExample() {
    }
}