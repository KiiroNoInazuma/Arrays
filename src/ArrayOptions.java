import java.util.Arrays;

public class ArrayOptions {
    public static void main(String[] args) {
        int[] arr = new int[16];
        int a = 1;
        for (int x = 1; x < arr.length; x++) {
            a *= 2;
            arr[x] = a;
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }

        }
        System.out.println();
        for (int z = arr.length - 1; z >= 0; z--) {
            if (z == 0) {
                System.out.print(arr[z]);
            } else {
                System.out.print(arr[z] + ",");
            }
        }

        System.out.println("\n" + Arrays.toString(arr));
    }
}
