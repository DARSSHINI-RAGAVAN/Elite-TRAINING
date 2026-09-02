import java.util.Scanner;

public class SearchCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char search = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
} 


