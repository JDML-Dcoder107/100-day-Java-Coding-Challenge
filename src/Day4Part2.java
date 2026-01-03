import java.util.Scanner;
public class Day4Part2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("===== Calculator of Power of a Number =====");
        System.out.print("Enter a base number: ");
        int base_num = input.nextInt();
        System.out.print("Enter the number where to raise the based number: ");
        int raised_num = input.nextInt();
        input.close();
        double result = Math.pow(base_num, raised_num);
        System.out.printf("The result of  %d raised to %d is %.2f", base_num, raised_num, result);
    }
}
