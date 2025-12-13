//Leetcode 151
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] words = s.split(" +"); //Split string by one or more spaces

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]); //add current word
            sb.append(" ");  //add space after each word
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s)); // Output: "blue is sky the"
    }
}

