public class LinearSearch {
    public static void main(String[]args){
        int[] arr = {13, 16, 11, 7, 9};
        int n = arr.length;

        // element you want to search
        int num = 11;

        int ans = bruteForce(arr, n, num);
        if(ans != -1){
            System.out.println("The number " +num+ " is found at " +ans+ " index");
        }else{
            System.out.println("The number " +num+ " is not present in the given array");
        }
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int bruteForce(int[] arr, int n, int num){
        for(int i = 0; i<n; i++){
            if(arr[i] == num){
               return i;
            }
        }
        return -1;
    }
}
