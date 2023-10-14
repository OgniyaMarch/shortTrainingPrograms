package calculators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorHoursSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hours = 0;
        double rate = 0;
        try {
            System.out.print("Enter amount of hours: ");
            hours = scanner.nextDouble();
            System.out.print("Enter the rate of pay per hour: ");
            rate = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error: " + e);
        }

        if(hours == 0 || rate == 0){
            System.out.println("Attention you work 0 hours or don't enter rate");
        }

        System.out.printf("Your salary: %.2f", (hours * rate));

    }
}
