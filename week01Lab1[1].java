
import java.util.Scanner;

public class week01Lab1 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int usernum = num.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(usernum * i);
        }
        num.close();

    }

}