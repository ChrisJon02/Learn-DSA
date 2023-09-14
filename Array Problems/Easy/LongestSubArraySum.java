public class LongestSubArraySum {
    
    // Problem statement --> Find the length of longest SubArray of the Array whose 
    // sum is equal to 'K'
    public static void main(String[]args){
        int[] arr = {1, 2, 3, 4, 1, 5, 1, 1, 2, 1};
        int k = 5;
        int n = arr.length;
        bruteForce(arr, n, k);
    }

    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    static void bruteForce(int[] arr, int n, int k){
        int max = 0;
        for(int i = 0; i<n; i++){
            int sum = 0;
           for(int j = i; j < n; j++){
               sum = sum + arr[j];
               if(sum == k){
                max = Math.max(max, j - i + 1);
               }
           }
        }
        System.out.println("Using Brute force approach, longest subarray : " +max);
    }
}
