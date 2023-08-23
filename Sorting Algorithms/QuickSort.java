import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        System.out.println("Before Quick Sort : " +Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Quick Sort: " +Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = findPivot(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        } 
    }
    static int findPivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
