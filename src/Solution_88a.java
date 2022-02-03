import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * Using temporary array
 * */

public class Solution_88a {

    public static int[] merge(int[] nums1, int[] nums2, int m, int n) {
        int[] result = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] result = merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(result));
    }

}
