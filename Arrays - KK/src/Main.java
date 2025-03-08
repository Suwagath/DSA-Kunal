public class Main {
    public static void main(String[] args) {
        // Q: store roll number
        int a = 19;

        // Q: store a person's name
        String name = "Suwagath Srithar";

        // Q: store 5 roll numebrs
        int rNo1 = 21;
        int rNo2 = 23;
        int rNo3 = 26;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
       /* int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {23, 12, 45, 32, 50};*/

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];

        System.out.println(arr[0]);


    }
}