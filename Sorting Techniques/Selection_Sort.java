import java.util.Scanner;

public class Selection_Sort {
    static void selection_sort(int arr[], int n) {    //time complexity=O(n^2)
        for (int i = 0; i <= n - 1; i++) {
            int min = i;
            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
//        int n=6;
        int[] arr = {13,46,24,52,20,9};
        int n=arr.length;

        selection_sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

