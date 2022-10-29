import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] even = new int[10];
        for (int x = 0; x < even.length; x++) {
            even[x] = (int) (Math.random() * 10);
            even[x] = (even[x] % 2 != 0) ? even[x] + 1 : even[x];
        }
        System.out.println(Arrays.toString(even));
    }
}
