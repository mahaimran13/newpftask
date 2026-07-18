import java.util.Scanner;

public class week02lab3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Sum(0 to exit): ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            sum += num;
            num = sc.nextInt();
        }

        System.out.print("The sum is: " + sum);

        sc.close();
    }
}
