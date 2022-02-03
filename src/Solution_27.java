import java.util.Arrays;

/**
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums
 *
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory
 * */

public class Solution_27 {

    public static int[] removeElements_v1(int[] a, int val) {
        int size = a.length;
        for (int i = 0; i < size; ) {
            if(a[i] == val) {
                for(int j = i; j < size - 1; j++) {
                    a[j] = a[j+1];
                }
                size--;
            }
            else {
                i++;
            }
        }
        for(int i = size; i < a.length; i++){
            a[i] = 0;
        }
        return a;
    }

    /**
     * Using 2 pointer
     * */
    public static int[] removeElements_v2(int[] a, int val) {
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != val) {
                a[k] = a[i];
                k++;
            }
        }
        for(int j = k; j < a.length; j++) {
            a[j] = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int[] result = removeElements_v2(nums, val);
        System.out.println(Arrays.toString(result));
    }
}
