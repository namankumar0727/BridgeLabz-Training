import java.util.Scanner;

class Solution {

    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        // Count characters of first string
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Reduce count using second string
        for (char ch : t.toCharArray()) {
            if (count[ch - 'a'] == 0) {
                return false;
            }
            count[ch - 'a']--;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.next();

        System.out.println("Enter second string:");
        String t = sc.next();

        Solution obj = new Solution();
        boolean result = obj.isAnagram(s, t);

        if (result) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }

        sc.close();
    }
}
