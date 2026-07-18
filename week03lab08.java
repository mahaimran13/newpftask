public public class week03lab08 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Before: ");
        for (int x = 0; x < numbers.length; x++)
            System.out.print(numbers[x] + " ");
        System.out.println();
        System.out.println("After: ");
        for (int x = numbers.length - 1; x >= 0; x--)
            System.out.print(numbers[x] + " ");
    }
}
