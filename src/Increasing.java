import java.util.Arrays;
import java.util.Random;

public class Increasing {
    public static void main(String[] args) {
        boolean check = true;
        Random rd = new Random();

        int[] arg = new int[4];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = 10 + rd.nextInt(90);
        }

        for (int x = 0; x < arg.length - 1; x++) {
            if (arg[x] > arg[x + 1]) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("The array is strictly increasing.");
        }
        System.out.println(Arrays.toString(arg));
    }
}


