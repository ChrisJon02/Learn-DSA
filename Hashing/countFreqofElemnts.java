import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class countFreqofElemnts {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("No.of Elements : " );
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("No.of elements for which you want the frequency : ");
        int noOfElemFreq = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] input = new int[noOfElemFreq];
        for(int i = 0; i<input.length; i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Output by using Iterative Approach is :");
        for(int i = 0; i<input.length; i++){
            int ans = iterativeFreq(arr, n, input[i]);
            System.out.println("Frequency of " +input[i]+ " is " +ans);
        }
        System.out.println("Output by using Hash Array Approach is :");
        hashArrayFreq(arr, n);
        System.out.println("Output by using HashMap Approach is : ");
        hashMapFreq(arr, n);
        sc.close();
    }
    // Iterative Approach
    static int iterativeFreq(int[] arr, int n, int number){
        int count = 0;
         for(int i = 0; i<n; i++){
            if(arr[i] == number){
                count++;
            }
         }
         return count;
    }
    // Hash Array Approach
    static void hashArrayFreq(int[] arr, int n){
        int[] hash = new int[n];
        Arrays.fill(hash, 0);
        for(int i = 0; i<n; i++){
            hash[arr[i]]++;
        }
         System.out.println(Arrays.toString(hash));
    }
    //HashMap Approach
    static void hashMapFreq(int[] arr, int n){
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
         for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
         }
         for (HashMap.Entry<Integer,Integer> entry : map.entrySet())
         {
            System.out.println(entry.getKey() + " " + entry.getValue());
         }
    }

}