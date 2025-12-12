//Leetcode 151
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();

        for (int i = str.length - 1; i > 0; i--) {
            out.append(str[i]).append(" ");
        }
        out.append(str[0]); // append the last word without extra space
        return out.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s)); // Output: "blue is sky the"
    }
}

