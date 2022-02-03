/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * */

public class Solution_1662 {

    public static boolean arrayStringAreEqual_v1(String[] arr1, String[] arr2) {

        String r1 = "";
        String r2 = "";

        for(String s: arr1) {
            r1 += s;
        }

        for(String s: arr2) {
            r2 += s;
        }

        return r1.equals(r2);
    }

    public static boolean arrayStringAreEqual_v2(String[] arr1, String[] arr2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s: arr1) {
            sb1.append(s);
        }

        for(String s: arr2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean bool1 = arrayStringAreEqual_v1(word1, word2);
        boolean bool2 = arrayStringAreEqual_v2(word1, word2);

        System.out.println(bool1);
        System.out.println(bool2);
    }
 }
