import java.util.Arrays;
public class InsertionSort {
    public static void main(String[]args){
        int[] arr1 = {5,4,3,2,1};
        int n = arr1.length;
        iterativeSort(arr1, n);
        System.out.println("Using Iterative Approach : " +Arrays.toString(arr1));
        int[] arr2 = {5,4,3,2,1};
        recursiveSort1(arr2, n);
        System.out.println("Using Recursive Approach 1 : " +Arrays.toString(arr2));
        int[] arr3 = {5,4,3,2,1};
        recursiveSort2(arr3, 0, n);
        System.out.println("Using Recursive Approach 2 : " +Arrays.toString(arr3));
    }
    // Iterative Approach
    public static void iterativeSort(int[] arr, int n) {
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                swap(arr, j-1, j);
                j--;
            }
        }
    }
    // Recursive Approach method-1
    public static void recursiveSort1(int[] arr, int n){
        if (n<=1) return;

            recursiveSort1(arr, n-1);
            int lastElement = arr[n-1];
            int j = n-2;
            while(j >= 0 && arr[j] > lastElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = lastElement;
    }
    // Recursive Approach method-2
    public static void recursiveSort2(int[] arr, int i, int n){
         
        if(i == n) return;
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
             swap(arr, j-1, j);
             j--;
        }

        recursiveSort2(arr, i+1, n);
    }
    public static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
