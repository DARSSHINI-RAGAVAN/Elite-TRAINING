import java.util.Scanner;

public class MergeTwoStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            result = result + str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            result = result + str2.charAt(i);
        }

        System.out.println(result);
    }
}
