/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * */

public class Solution_1295 {

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int num: nums) {
            if(countDigits(num) % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }

    private static int countDigits(int a) {
        int numberDigits = 0;
        int temp = a;
        while(temp != 0) {
            numberDigits++;
            temp = temp/10;
        }
        return numberDigits;
    }

    public static void main(String[] args) {
        int [] nums = {555, 901, 482, 1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
