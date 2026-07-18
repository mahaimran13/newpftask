public class week03lab6 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int even = 0, odd = 0;
        for (int x = 0; x < numbers.length; x++) {
            int Z = numbers[x] % 2;
            if (Z == 0)
                even++;
            if (Z == 1)
                odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}