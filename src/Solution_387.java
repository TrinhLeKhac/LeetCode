/**
 * Given a string s,
 * find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * */

public class Solution_387 {

    public static int firstUniqueChar(String s) {

        char[] chars = s.toCharArray();
        int[] count = new int[123];

        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int index = (int)c;
            count[index]++;
        }

        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int index = (int)c;
            if(count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int val = firstUniqueChar(s);
        System.out.println(val);
    }
}
