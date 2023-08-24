import java.util.*;
import java.util.Arrays;
public class highLowFreq {
    public static void main(String[]args){
        int[] arr = {2, 3, 4, 3, 6, 1, 3};
       getFrequencies(arr);
    }
    public static void getFrequencies(int[] v) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        // Calculate frequencies using a map
        for (int num : v) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        int minNum = Integer.MAX_VALUE;
        
        // Find the most frequent number and the least frequent number
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
            else if (count == maxCount && num < maxNum) {
                maxNum = num;
            }
            if (count < minCount) {
                minCount = count;
                minNum = num;
            }
            else if (count == minCount && num < minNum) {
                minNum = num;
            }
        }
        
        arr[0] = maxNum;
        arr[1] = minNum;
        System.out.println(Arrays.toString(arr));
    }
}
