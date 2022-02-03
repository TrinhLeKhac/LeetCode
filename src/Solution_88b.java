import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, length of nums1 is m+n(n elements equals 0 in the end), length of nums2 is n,
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order nums1.
 *
 * Do not allocate extra space for another array.
 * */

public class Solution_88b {

    public static void merge(int[] nums1, int[] nums2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        while(k >= 0) {
            if(i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }
}
