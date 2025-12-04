//Leetcode 153
public class FindMinimumInRotatedSortedArray {
    static int findMinBruteForce(int[] nums) {
        int n = nums.length, mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, nums[i]);
        }
        return mini;
    }
    
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("The minimum element is: "+findMinBruteForce(arr));
    }
}
