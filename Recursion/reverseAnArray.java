import java.util.Arrays;  
public class reverseAnArray {

    
    public static void main(String[]args){
        int arr[] = {1, 2, 3, 4, 5};
        int newArray[] = {5, 4, 3, 2, 1};
        System.out.println("Using Extra Array Approach : " +Arrays.toString(extraArray(arr)));
        System.out.println("Using Optimized space approach : " +Arrays.toString(spaceOptimized(arr)));
        recursiveReverrse(newArray, 0, arr.length - 1);
        System.out.println("Using Recursive Approach : " +Arrays.toString(newArray));

       
    }
    // Extra Array
    static int[] extraArray(int[] arr){
        int newArr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[(arr.length - 1) - i]; 
        }
        return newArr;
    }
    // Space optimized Approach
    static int[] spaceOptimized(int[] arr){
        int p2 = arr.length-1;
        for(int p1 = 0; p1 < arr.length/2; p1++){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p2--;
        }
        return arr;
    }
    // Recursive Approach
    static void recursiveReverrse(int[] arr, int p1, int p2){
        if(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            recursiveReverrse(arr, p1 + 1, p2 - 1);
        }
    }
    

}
