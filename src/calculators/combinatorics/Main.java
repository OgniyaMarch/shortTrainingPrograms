package calculators.combinatorics;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tWelcome to Combinatorics Calculator");
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        System.out.print("Factorial: ");
        System.out.println(СalculatorOfCombinatorics.getFactorial(n));

        System.out.print("P: ");
        System.out.println(СalculatorOfCombinatorics.getP(n));

        System.out.print("A: ");
        System.out.println(СalculatorOfCombinatorics.getA(n, k));

        System.out.print("C: ");
        System.out.println(СalculatorOfCombinatorics.getC(n, k));

    }
}
