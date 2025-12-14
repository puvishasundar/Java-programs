// Simple Login Validation Using Java

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (u.equals("puvisha") && p.equals("0000")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}
