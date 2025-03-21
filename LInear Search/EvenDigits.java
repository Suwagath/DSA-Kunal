// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {245, 6966, 12, 126, 1, 005};
        System.out.println(findNumbers(nums));
        System.out.println(digit2(3456));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    };

    // func to check whether a number contains even digits inside
    static boolean even(int num){
        int noOfDigits = digit2(num);
        if (noOfDigits % 2 == 0){
            return true;
        };
        return false;
    };

    static int digit2(int num){
        return (int)Math.log10(num) + 1;
    };

    static int digits(int num){
        int count = 0;

        if (num < 0){
            num *= -1;
        };

        while (num > 0){
            count++;
            num = num / 10;
        };

        if (num == 0){
            return 1;
        }
        return count;


    };
}
