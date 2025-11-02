//Leetcode 560
public class SubarraySumEqualsK {
    public int subarraySumBruteForce(int[] nums, int k) {
                int count=0;
                for(int i=0; i<nums.length; i++){

                    int sum=0;
                    for(int j=i; j<nums.length; j++){
                        sum += nums[j];
                        if(sum == k){
                            count++;
                        }
                    }
                }
                return count;
            }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        int[] nums = {1, 1, 1};
        System.out.println(solution.subarraySumBruteForce(nums, 2));
    }
}

