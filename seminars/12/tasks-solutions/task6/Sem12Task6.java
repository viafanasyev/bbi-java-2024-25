package task6;

import java.util.Scanner;

public class Sem12Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter initial number: ");
                double initial = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Enter q: ");
                double q = Double.parseDouble(scanner.nextLine().trim());

                GeometricProgression progression = new GeometricProgression(initial, q);

                System.out.print("Enter n: ");
                int n = Integer.parseInt(scanner.nextLine().trim());

                System.out.println(progression.nth(n));
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
