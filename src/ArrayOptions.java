import java.util.Arrays;

public class ArrayOptions {
    public static void main(String[] args) {
        int[] arr = new int[16];
        int a = 1;
        for (int x = 1; x < arr.length; x++) {
            a *= 2;
            arr[x] = a;
            if(x==arr.length-1){
                System.out.print(x);
            }else {
                System.out.print(x+",");
            }
        }
        System.out.println("\n"+Arrays.toString(arr));
    }
}
