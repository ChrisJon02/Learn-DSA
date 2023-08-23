import java.util.Arrays;
// Find the Second Largest and second smallest element in the array
public class SecLargestElmntInArray {
    public static void main(String[]args){
        int[] arr = {11, 31, 23, 47, 92, 63};
        int n = arr.length;
        bruteForce(arr, n);
        better(arr, n);
        optimal(arr, n);
    }
    // Brute force method 
    // Time Complexity: O(NlogN)
    static void bruteForce(int[] arr, int n){
        Arrays.sort(arr);

        System.out.println("Using Brute force method : ");
        System.out.println("Second largest element of the array : " +arr[n-2]);
        System.out.println("Second smallest element of the array : " +arr[1]);
        System.out.println();
    }
    // Optimal Approach
    // Time Complexity: O(N) - two linear for loops
    static void better(int[] arr, int n){
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        int i;
        for (i = 0;i < n;i++)
        {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (i = 0;i < n;i++)
        {
            if (arr[i] < secondsmall && arr[i] != small)
            {
                secondsmall = arr[i];
            }
            if (arr[i] > secondlarge && arr[i] != large)
            {
                secondlarge = arr[i];
            }
        }
        System.out.println("Using better method : ");
        System.out.println("Second largest element of the array : " +arr[n-2]);
        System.out.println("Second smallest element of the array : " +arr[1]);
        System.out.println();
        
    }
    // Most optimal solution
    // Time Complexity : O(N) - But a single pass solution
    public static void optimal(int []arr, int n) {

        System.out.println("Using most optimal method : ");
        System.out.println("Second largest element of the array : " +secondLargest(arr, n));
        System.out.println("Second smallest element of the array : " +secondSmallest(arr, n));
        System.out.println();
        
    }
    static int secondSmallest(int[] arr, int n)
    {
        if (n < 2)
        {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
        if (arr[i] < small)
        {
            second_small = small;
            small = arr[i];
        }
        else if (arr[i] < second_small && arr[i] != small)
        {
            second_small = arr[i];
        }
        }
        return second_small;
    }
    static int secondLargest(int[] arr, int n)
    {
        if(n<2)
        return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
