public class MaxConsecutive1s {
    public static void main(String[]args){
        int[] arr = {1,1,0,1,1,1,1,0,1,1,1};
        int n = arr.length;
        bruteForce(arr, n);
        optimal(arr, n);
    }

    // Time Complexity: O(N^2)
    // Space complexity: O(1)
    static void bruteForce(int[] arr, int n){
        int max = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(arr[j] == 1){
                    count++;
                }else{
                    break;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println("Using Bruteforce : " +max);
    }

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    static void optimal(int[] arr, int n){
        int max = 0;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
                continue;
            }
        }
        max = Math.max(max, count);
        System.out.println("Using optimal approach : " +max);
    }
}
