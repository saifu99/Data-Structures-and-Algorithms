public class BS_KthMissingPositiveNum {
    static int kthMissingNum(int[] arr, int k){ //brute force
        for(int i=0; i<arr.length; i++){
            if (arr[i] <= k){
                k++;
            }else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        System.out.println("The missing number is: "+kthMissingNum(arr,4));
    }
}
