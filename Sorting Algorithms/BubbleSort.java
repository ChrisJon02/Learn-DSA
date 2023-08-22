import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int[] arr = {15, 27, 13, 6, 87, 4};
        int n = arr.length;
        System.out.println("Using Iterative approach : ");
        iterativeSort(arr, n);
        System.out.println(Arrays.toString(arr));
        System.out.println("Using Recursive Approach : ");
        int[] recArr = {15, 27, 13, 6, 87, 4};
        recursiveSort(recArr, n);
        System.out.println(Arrays.toString(recArr));
    }
    // Iterative Approach
    public static void iterativeSort(int[] arr, int n) {
        for(int i = n-1; i>=1; i--){
            boolean ifSwapped = false;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    ifSwapped = true;
                }
            }
            if(ifSwapped == false){
                break;
            }
        }
    }
    // Recursive Approach
    public static void recursiveSort(int[] arr, int n) {
        //Your code goes here
        if (n==1) return;
        for(int j = 0; j <= n-2; j++){
            if(arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
        }
        recursiveSort(arr, n-1);
        
    }
    public static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
