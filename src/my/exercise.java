package my;

import java.util.Locale;
import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

        Scanner readPassword = new Scanner(System.in);

        String password;
        String correctPassword = "secret123";

        while (true) {
            System.out.println("Enter password: ");
            password = readPassword.nextLine();

            if (password.toLowerCase().trim().equals(correctPassword)) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}
