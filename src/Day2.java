import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_num = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second_num = scanner.nextInt();
        scanner.close();

        int result = first_num + second_num;
        System.out.printf("The sum of %d and %d is %d.\n", first_num, second_num, result);

        if(result % 2 == 0){
            System.out.println("Odd or Even: \"Even\"");
        }
        else{
            System.out.println("Odd or Even: \"Odd\"");
        }
    }
}
