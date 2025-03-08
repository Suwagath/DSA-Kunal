import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
       // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner input = new Scanner(System.in);

        /*list.add(67);
        list.add(354);
        list.add(12312);
        list.add(654);
        list.add(6722);
        list.add(7);*/

        /*System.out.println(list.contains(12312));
        list.set(0, 999);
        list.remove(2);*/

/*
        System.out.print(list);
*/

        // input

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get ietm at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax won't work here
        }

        // output
        System.out.println(list);

    }
}
