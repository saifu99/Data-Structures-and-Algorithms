//Leetcode 1903
public class LargestOddNumberString {
    public static String largestOddNumber(String num) {
        int len = num.length() - 1;

        while(len >= 0){
            int d = num.charAt(len) - '0';
            if(d%2 != 0)
                return num.substring(0, len + 1);
            len--;
        }
        return "";
    }

    static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
}

