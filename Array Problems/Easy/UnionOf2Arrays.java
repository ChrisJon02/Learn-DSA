import java.util.ArrayList;
import java.util.HashSet;

public class UnionOf2Arrays {
    public static void main(String[]args){
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {1, 3, 5};
        bruteForce(arr1, arr2, arr1.length, arr2.length);
    }

    // Time Complexity: O((m+n)log(m+n))
    // Space Complexity: O(m+n)
    static void bruteForce(int arr1[], int arr2[], int n, int m) {
        HashSet <Integer> set =new HashSet<>();
        ArrayList <Integer> list =new ArrayList<>();
        for (int i = 0; i < n; i++)
            set.add(arr1[i]);
        for (int i = 0; i < m; i++)
            set.add(arr2[i]);
        list.addAll(set);
        System.out.println("Using brute force : " +list);
}
}
