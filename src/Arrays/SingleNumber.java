//Leetcode 136
public class SingleNumber {
    public int singleNumberBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public int singleNumberOptimal(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num; //XOR cancels duplicates
        }
        return ans;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        System.out.println(solution.singleNumberOptimal(nums));
    }
}
