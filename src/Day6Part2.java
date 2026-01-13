//Day 6 Part 2 Removing all white spaces in a String
import java.util.Scanner;
public class Day6Part2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("========== White Space Remover =========");
        System.out.print("Enter a String: ");
        String word = input.nextLine();
        input.close();

        StringBuilder updatedString = new StringBuilder("");
        for(int i = 0; i < word.length(); i++ ){
            if(word.charAt(i) != ' '){
                updatedString.append(word.charAt(i));
            }
        }
        System.out.printf("The updated String of %s without spaces is: %s", word, updatedString);
    }
}
