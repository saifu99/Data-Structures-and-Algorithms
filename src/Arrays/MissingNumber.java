public class MissingNumber {
    public int missingNumberBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for(int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }

        return -1;
    }

        public int missingNumberOptimal(int[] nums) {
            int n = nums.length;
            int expectedSum = (n * (n + 1)) / 2; //sum of all numbers including missing number
            int actualSum = 0;  //sum of numbers excluding missing number

            for (int i = 0; i < nums.length; i++) {
                actualSum += nums[i];
            }
            return expectedSum - actualSum;
        }

        public static void main(String[] args) {
            MissingNumber solution = new MissingNumber();
            int[] nums = {3, 0, 1};
            System.out.println("Optimal Solution: " + solution.missingNumberOptimal(nums));
            System.out.println("Brute Force Solution: " + solution.missingNumberBruteForce(nums));
        }
    }