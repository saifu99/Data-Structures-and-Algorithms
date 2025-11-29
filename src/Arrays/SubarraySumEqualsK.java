import java.util.HashMap;
import java.util.Map;

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

            public int subarraySumOptimal(int[] nums, int k){
        int res=0, curr=0;
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0,1);
                for(int i : nums){
                    curr += i;
                    res += map.getOrDefault(curr-k,0);
                    map.put(curr,map.getOrDefault(curr,0)+1);
                }
                return res;
            }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        int[] nums = {1,2,3};
        System.out.println(solution.subarraySumOptimal(nums, 3));
    }
}

