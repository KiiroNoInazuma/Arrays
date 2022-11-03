import java.util.Arrays;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int[] fibonacci = new int[20];
        for (int x = 0; x < fibonacci.length; x++) {
            if (x < 2) {
                fibonacci[x] = x;
            } else {
                fibonacci[x] = fibonacci[x - 1] + fibonacci[x - 2];
            }
        }
        System.out.println(Arrays.toString(fibonacci));
    }
}
