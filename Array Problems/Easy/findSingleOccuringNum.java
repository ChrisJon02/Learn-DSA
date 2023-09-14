import java.util.HashMap;
import java.util.Map;

public class findSingleOccuringNum {
    public static void main(String[]args){
        int[] arr = {2, 1, 2, 3, 1};
        int n = arr.length;
        System.out.println("Using bruteforce : " +bruteForce(arr, n));
        System.out.println("Using better approach (hasharray) : " +better1(arr, n));
        System.out.println("Using better approach (hashmap) : " +better2(arr, n));
        System.out.println("Using optimal approach (XOR) : " +optimal(arr, n));
    }

    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    static int bruteForce(int[] arr, int n){
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    
    // Note: In case of negative numbers you'll get indexoutofBounds error due to hash collisions
    // Time Complexity : O(N) + O(N) + O(N)
    // Space Complexity : O(maximumElement + 1)
    static int better1(int[] arr, int n){
        int max = arr[0];
        // find the maximum element 
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }
        int[] hash = new int[max+1];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return 0;
    }

    // Time Complexity : O(N) + O(M), where M is the size of the map
    // Space Complexity : O(N)
    static int better2(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    static int optimal(int[] arr, int n){
        int xor = 0;
        for(int i = 0; i<n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

}
