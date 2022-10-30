import java.util.Arrays;
import java.util.Random;

public class Average {
    public static void main(String[] args) {
        double avgFirst = 0;
        double avgSecond = 0;
        Random random = new Random();
        int[] first = new int[5];
        for (int x = 0; x < first.length; x++) {
            first[x] = (int) (Math.random() * 6);
            avgFirst += first[x];
        }
        avgFirst /= first.length;
        int[] second = new int[5];
        for (int i = 0; i < second.length; i++) {
            second[i] = random.nextInt(6);
            avgSecond += second[i];
        }
        avgSecond /= second.length;


        if (avgFirst > avgSecond) {
            System.out.println("The first array is larger than the second array.");
        } else if (avgFirst < avgSecond) {
            System.out.println("The second array is larger than the first array.");
        } else {
            System.out.println("The arrays are equal");
        }
        System.out.println(Arrays.toString(first));
        System.out.println(avgFirst);
        System.out.println(Arrays.toString(second));
        System.out.println(avgSecond);

    }

}

