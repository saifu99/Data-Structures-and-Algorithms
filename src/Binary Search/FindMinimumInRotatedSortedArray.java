//Leetcode 153
public class FindMinimumInRotatedSortedArray {
    static int finMinBruteForce(int[] arr) {   //Brute force
        int n = arr.length;
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }



    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println("The minimum element is: "+finMinBruteForce(arr));
    }
}
