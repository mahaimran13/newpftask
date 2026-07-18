
import java.util.Scanner;

public class week02lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String user = sc.nextLine();

        String reversed = "";

        // PREPEND
        for (int i = 0; i < user.length(); i++) {
            reversed = user.charAt(i) + reversed;
        }

        if (user.equals(reversed)) {
            System.out.print("String is Palindrome!");
        } else {
            System.out.print("String is NOT Palindrome!");
        }

        sc.close();
    }
}
}
