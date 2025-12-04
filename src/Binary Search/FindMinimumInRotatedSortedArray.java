//Leetcode 153
public class FindMinimumInRotatedSortedArray {
    static int findMinBruteForce(int[] nums) {
        int n = nums.length, mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, nums[i]);
        }
        return mini;
    }

    public static int finMinOptimal(int[] nums){
        int left=0, right=nums.length-1;

        while (left<right){ 
            int mid=left+(right-left)/2;
            if(nums[mid] > nums[right]){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("The minimum element is: "+finMinOptimal(nums));
    }
}
