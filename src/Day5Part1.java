//Day 5 Part 1 Reversed a String
import java.util.Scanner;
public class Day5Part1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== String Reverser ==========");
        System.out.print("Enter a word or a String: ");
        String word = scanner.nextLine();
        scanner.close();

        String reversed_string = "";
        for(int i = word.length() - 1; i >= 0; i--){ 
            reversed_string += word.charAt(i);
        }
        System.out.printf("The reversed string of %s is: %s", word, reversed_string);
    }
}
