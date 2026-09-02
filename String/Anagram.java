
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            int index = str1.charAt(i) - 'a';
            count[index]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            count[index]++;
        }

        boolean anagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0 && count[i] != 2) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}


