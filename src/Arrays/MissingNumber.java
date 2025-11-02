public class Arrays_MissingNumInArray {
    public static int missingNumber(int[] nums, int n){   //brute force
        for (int i=1; i<=n; i++){
            int flag=0;

            for (int j=0; j<n-1; j++){
                if (nums[j] == i){
                    flag=1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2; //sum of all numbers including missing number

        int actualSum = 0; //sum of numbers excluding missing number
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
}

    public static void main(String[] args){
        int n=5;
        int[] nums = {1,2,4,5};

        int ans = (nums,n);
        System.out.println("The missing number is: "+ans);
    }
}
