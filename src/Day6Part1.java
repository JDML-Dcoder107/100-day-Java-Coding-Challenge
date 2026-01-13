//Day 6 Checking if the string is a palindrome
import java.util.Scanner;
public class Day6Part1 {
    public static int isPalindrome(String word){
        int length = word.length();

        for(int i = 0; i < length/2; i++){
            if (word.charAt(i) != word.charAt(length - i -1)) {
                return 0;
            }

        }return 1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("========== Palindrome Checker ==========");
        System.out.print("Enter a String or a word: ");
        String word = input.nextLine();
        input.close();

        if (isPalindrome(word) == 1) {
            System.out.printf("The String %s is a Palindrome.", word);
        }
        else{
            System.out.printf("The String %s is not a Palindrome.", word);
        }
    }
}
