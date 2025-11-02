public class Recursion_StringPalindromeOrNot {
    static boolean palindrome(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        } else if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        } else {
            return palindrome(i + 1, s);
        }
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrome(0, s));
    }
}
