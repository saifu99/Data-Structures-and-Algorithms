//Leetcode 1021
public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s){
        StringBuilder ans = new StringBuilder();
        int count=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count != 0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                count++;
            }
        }
        return ans.toString();
    }

    static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println("After removing outer parentheses of each part: "+removeOuterParentheses(s));
    }
}
