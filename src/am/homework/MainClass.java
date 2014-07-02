package am.homework;

import java.util.Scanner;

/**
 * Created by nadya on 6/30/14.
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("for validate email write e , for password p");
        Scanner scanner =  new Scanner(System.in);
        Validation validation  = new Validation();
        String value = scanner.nextLine().trim();
        if(value.equals("e")) {
            System.out.println("please enter your email address");
            String email = scanner.next();
            System.out.print("your email is");
            if(validation.validateEmail(email)) {
                System.out.println(" valid");
            } else {
                System.out.println(" invalid");
            }
        } else if(value.equals("p")) {
            System.out.println("please enter your password");
            String password = scanner.next();
            System.out.print("your password is");
            if(validation.validatePassword(password)) {
                System.out.println(" valid");
            } else {
                System.out.println(" invalid");
            }
        } else {
            System.out.println("You didn't choose anything");
        }



    }
}
