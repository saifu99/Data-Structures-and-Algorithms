//Leetcode 485
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnesBruteForce(int[] nums) {
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int count = 1;
                for (int j = i + 1; j < nums.length && nums[j] == 1; j++) {
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }


    public int findMaxConsecutiveOnesOptimal(int[] nums) {
        int count=0, maxCount=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count); //compare and store maximum of both
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(solution.findMaxConsecutiveOnesBruteForce(nums));
    }
}


