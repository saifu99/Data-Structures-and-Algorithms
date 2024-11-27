public class BS_LowerBound {
    static int lowerBound(int[] arr, int n, int x){
        for (int i=0; i<arr.length; i++){
            if (arr[i] >= x){
                return i;
            }
        }
        return n;
    }

    static int lowerBoundOptimal(int[] arr, int x){
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = n;

        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        System.out.println("The lower bound is the index: "+lowerBoundOptimal(arr,9));
    }
}
