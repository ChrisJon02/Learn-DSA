import java.util.Arrays;
public class SelectionSort{
    public static void main(String[]args){
        int[] arr = {15, 27, 13, 6, 87, 4};
        int n = arr.length;
        iterativeSort(arr, n);
    }
    // Iterative Approach
    public static void iterativeSort(int[] arr, int n) {

        for(int i = 0; i<=n-2; i++){
            int min = i;
            for(int j = i; j<=n-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            } 
           swap(arr, i, min);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}