//LeetCode 1539
public class KthMissingPositiveNumber {
    static int findKthPositiveBruteForce(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= k){
                k++;
            }else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println("The Kth missing positive number is: "+findKthPositiveBruteForce(arr,5));
    }
}
