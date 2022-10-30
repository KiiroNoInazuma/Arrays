import java.util.Random;

public class Replacement {
    public static void main(String[] args) {
        int[] even = new int[8];
        Random random = new Random();
        for (int x = 0; x < even.length; x++) {
            even[x] = 1 + random.nextInt(10);
            if (x == even.length - 1) {
                System.out.println(even[x]+"]");
                break;
            } else if (x == 0) {
                System.out.print("[");
            }

            System.out.print(even[x] + ", ");

        }
        for (int res : even) {
            if (res % 2 != 0) {
                res = 0;
            }
            System.out.print(res+"  ");
        }

    }
}
