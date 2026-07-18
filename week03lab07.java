import java.util.Scanner;

public class week03lab07 {
    public static void main(String[] args) {
        Scanner search = new Scanner(System.in);
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("What Number You Wanna Find?");
        int userinput = search.nextInt();
        int index = -1;
        for (int x = 0; x < numbers.length; x++) {
            if (userinput == numbers[x]) {
                index = x;
                break;
            }
        }
        if (index != -1)
            System.out.println("Found At Index: " + index);
        else
            System.out.print("Not Found!");
        search.close();
    }
}