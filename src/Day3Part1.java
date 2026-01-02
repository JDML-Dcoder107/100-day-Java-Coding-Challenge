import java.util.Scanner;

public class Day3Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;

        try {
            System.out.print("Enter first number: ");
            num1 = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("Enter second number: ");
            num2 = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("Enter third number: ");
            num3 = Double.parseDouble(scanner.nextLine().trim());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
            scanner.close();
            return;
        }

        // Determine the largest number
        double largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Display result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
