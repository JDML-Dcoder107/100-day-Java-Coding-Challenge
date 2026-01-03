import java.util.Scanner;
public class Day4Part1 {

    public static int factorial(int n){
        if(n < 0){
            throw new IllegalArgumentException("Invalid input, Factorial cannot be define in negative number");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("===== Getting the Factorial using iteration =====");

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.printf("The factorial of %d are: %d", num, factorial(num));
        input.close();
    }
}
