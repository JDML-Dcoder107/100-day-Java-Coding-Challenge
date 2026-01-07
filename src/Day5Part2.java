import java.util.Scanner;

public class Day5Part2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int vowel_count = 0;
        System.out.println("========== Vowel Counter ==========");
        System.out.print("Enter a word or string: ");
        String word = scanner.nextLine();

        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'A' || word.charAt(i) == 'a' || word.charAt(i) == 'E' ||word.charAt(i) == 'e' ||
                    word.charAt(i) == 'I' ||word.charAt(i) == 'i' || word.charAt(i) == 'O' || word.charAt(i) == 'o' || word.charAt(i) == 'U' || word.charAt(i) == 'u'){
                vowel_count ++;
            }
        }
        System.out.printf("The total count of vowels inside the string %s is: %d", word, vowel_count);
    }
}
