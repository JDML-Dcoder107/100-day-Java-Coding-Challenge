import java.util.Scanner;

public class Day3Part2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Celsius to Fahrenheit =====");
        System.out.print("Enter the value of Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("The total fahrenheit of %.2f is %.2f", celsius, fahrenheit);
    }
}
