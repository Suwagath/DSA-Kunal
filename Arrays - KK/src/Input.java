import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 21;
        arr[1] = 14;
        arr[2] = 121;
        arr[3] = 111;
        arr[4] = 1334;
        // [21, 14, 121, 111, 1334]
       /// System.out.println(arr[3]);

        // input using forloop

        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }*/

        //System.out.println(Arrays.toString(arr));

      /*  for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

       // for (int num : arr) {
           // System.out.print(num + " ");
       // }
       // System.out.println(arr[5]); index out of bound error

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));

        // modify
        str[1] = "Suwagath";
        System.out.print(Arrays.toString(str));
    }
}
