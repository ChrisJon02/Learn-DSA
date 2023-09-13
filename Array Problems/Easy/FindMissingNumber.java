public class FindMissingNumber {
    
    // Input : arr, n
    // Output: Must print the missing number.
    // Suppose in a given array there are 'n' elements, so the range is {0, n}.
    // If one of the number is missing number from 0 to n, return that number
    // Input - 1: {1, 3, 0}, n=3  --> Output: 2  since 2 is missing 
    // Input - 2: {1, 2}, n=2 --> Output: 0 since 0 is missing
    public static void main(String[]args){
          int[] arr = {1, 3, 0};
          int n = arr.length;
          bruteForce(arr, n);
          System.out.println("Using Better Approach, missing number: " +betterApproach(arr));
          optimal(arr);
    }
 
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    static void bruteForce(int[] arr, int n){
        for(int i = 0; i <= n; i++){
            int flag = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("By using Brute Force, missing number : " +i);
            }
        }
    }

    // Time Complexity : O(N) + O(N) ~ O(2*N)
    // Space Complexity : O(N)
    static int betterApproach(int[] arr){
        int n = arr.length+1;
        int[] hash = new int[n];
        for(int i = 0; i < n-1; i++){
             hash[arr[i]]++;
        }
        for(int i = 0; i<=n; i++){
            if(hash[i] == 0){
               return i;
            }
        }
        return 0;
    }
    
    // Time Complexity : O(N)
    // Space Complexity : O(1)
    // Summation approach
    static void optimal(int[] arr){
        int n = arr.length;
        int s1 = (n*(n+1))/2;
        int s2 = 0;
        for(int i = 0; i<n; i++){
            s2 = s2+arr[i];
        }
        int ans = s1-s2;
        System.out.println("Using optimal approach, missing number : " +ans);
    }
    
}
