/*29.	Write a program to find the roots of a given quadratic equation and print the nature of roots? */
import java.util.Scanner;

public class Prg29_QuadraticEquation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter coefficients a, b, and c:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                System.out.println("Roots are real and distinct.");
            } else if (discriminant == 0) {
                System.out.println("Roots are real and equal.");
            } else {
                System.out.println("Roots are complex.");
            }
        }
    }
}

