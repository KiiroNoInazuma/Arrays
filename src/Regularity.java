import java.util.Arrays;
import java.util.Scanner;


public class Regularity {
    static void iterationOne(int x) {
        int[] arr = new int[10];
        switch (x) {

            case 1:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (i + 1) * (i + 1);
                }
                System.out.println(Arrays.toString(arr));
                break;

            case 2:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (i + 1) * (i + 1);
                    if (i % 2 != 0) {
                        arr[i] = -arr[i];
                    }
                }
                System.out.println(Arrays.toString(arr));
                break;

            case 3:
                Arrays.fill(arr, 1);
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 != 0) {
                        arr[i] = -arr[i];
                    }
                }
                System.out.println(Arrays.toString(arr));
                break;

            case 4:
                Arrays.fill(arr, 0);
                int count = 1;
                for (int i = 0; i < arr.length; i += 2) {
                    arr[i] = count++;
                }
                System.out.println(Arrays.toString(arr));
                break;

            default:
                System.exit(0);
        }
    }

    public static void main(String[] arg) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Номер задания: ");
        iterationOne(ent.nextInt());
        main(arg);
    }
}
