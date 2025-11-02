public class BS_SqrtOfNum {
    static int floorSqrt(int x){  //Optimal  
        int low = 1, high = x;

        while (low <= high){
            int mid = (low + high)/2;
            int val = mid * mid;
            if (val <= x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int x = 28;
        int ans = floorSqrt(x);
        System.out.println("The floor of square root of " + x + " is: " + ans);
    }
}
