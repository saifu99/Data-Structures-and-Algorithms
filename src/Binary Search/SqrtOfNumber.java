//Leetcode 69. Sqrt(x)
public class SqrtOfNumber {
    public static int mySqrtOptimal(int x){
        int low=1, high=x;
        
        while(low <= high){
            int mid =low + (high-low)/2;
            long square = (long) mid * mid;
            if(square == x) {
                return mid;
            }else if(square < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println("floor of square root is: " +mySqrtOptimal(8));
    }
}
