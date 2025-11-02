public class Bubble_Sort {
    static void bubble_sort(int[] arr, int n) {     //time complexity=O(n^2)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    static void bubbleSortOptimize(int[] arr, int n) {      //time complexity=O(n)
        for (int i = n - 1; i >= 0; i--) {
            int didSwap=0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap=1;
                }
            }
            if (didSwap==0){
                break;
            }
            System.out.println("runs");
        }
    }

    public static void main(String[] args) {
        int[] arr={3,7,4,87,45};
        int n=arr.length;

        bubble_sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




