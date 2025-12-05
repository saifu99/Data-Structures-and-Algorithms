//Leetcode 540. Single Element in a Sorted Array
public class SingleElementInSortedArray {
    public static int singleNonDuplicateOptimal(int[] nums) {
        int low=0, high=nums.length-1;

        while(low<high){
            int mid=low + (high-low)/2;
            if (mid%2 == 1) mid--;

            if(nums[mid] == nums[mid+1]){
                low=mid+2;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }

    static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicateOptimal(nums));
    }
}
