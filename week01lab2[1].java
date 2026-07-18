import java.util.Scanner;

public class week01lab2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Array of Numbers: ");
        String num = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {

            sum += Character.getNumericValue(num.charAt(i));

        }
        System.out.print(sum);
        sc.close();

    }

}
