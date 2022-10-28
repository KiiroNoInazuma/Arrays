import java.util.Arrays;

public class ArrayOptions {
    public static void main(String[] args) {
        int[] arr = new int[16];
        int a = 1;
        for (int x = 1; x < arr.length; x++) {
            a *= 2;
            arr[x] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
