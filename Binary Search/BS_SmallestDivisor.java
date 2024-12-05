public class BS_SmallestDivisor {
    static int sumByD(int[] arr, int div) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
    static int smallestDivisor(int[] arr, int threshold){
        int n = arr.length;
        if(n > threshold) return -1;

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int low = 1, high = maxi;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The minimum divisor is: "+smallestDivisor(arr,8));
    }
}
