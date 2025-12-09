//Leetcode 125
public class RecursionValidPalindrome {
    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(s, 0, s.length()-1);
    }

    private static boolean check(String s, int l, int r) {
        return l >= r || (s.charAt(l) == s.charAt(r) && check(s, l + 1, r - 1));
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
