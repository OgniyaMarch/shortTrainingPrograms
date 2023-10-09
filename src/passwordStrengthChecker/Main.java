package passwordStrengthChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password for checking: ");
        String userPassword = scanner.nextLine().trim();


        if(userPassword.isEmpty()){
            System.out.println("Enter password");
        } if(userPassword.contains(" ")){
            System.out.println("Enter password without spaces");
        } else {
            result = PasswordStrengthChecker.checkPasswordStrength(userPassword);
        }

        if(result == 0) System.out.println("Weak");
        if(result >= 1 && result <= 3) System.out.println("Moderate");
        if(result == 4) System.out.println("Strong");
    }
}

/*
 add to program
 Presence of at least one special character (e.g., !@#$%^&*)
* */
