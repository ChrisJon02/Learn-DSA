import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int[] arr = {15, 27, 13, 6, 87, 4};
        int n = arr.length;
        iterativeSort(arr, n);
        System.out.println(Arrays.toString(arr));
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
    public static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
