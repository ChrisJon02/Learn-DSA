import java.util.ArrayList;
import java.util.HashSet;

public class UnionOf2Arrays {
    public static void main(String[]args){
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {1, 3, 5};
        bruteForce(arr1, arr2, arr1.length, arr2.length);
        optimal(arr1, arr2, arr1.length, arr2.length);
    }

    // Time Complexity: O((m+n)log(m+n))
    // Space Complexity: O(m+n) - if space of union arraylist is considered
    //                   O(1) - if space of union arraylist is not considered
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

    // Time Complexity: O(m+n)
    // Space Complexity: O(m+n) - if space of union arraylist is considered
    //                   O(1) - if space of union arraylist is not considered
    static void optimal(int arr1[], int arr2[], int n, int m){
        int i = 0, j=0;
        ArrayList<Integer> arrList = new ArrayList<>();
        while(i < n && j<m){
            if(arr1[i] <= arr2[j]){
                 if(arrList.size() == 0 || arrList.get(arrList.size()-1) != arr1[i]){
                      arrList.add(arr1[i]);
                 }
                 i++;
            }else{
                if(arrList.size() == 0 || arrList.get(arrList.size()-1) != arr2[j]){
                    arrList.add(arr2[j]);
                }
                 j++;
            }
        }

        while(i < n){
            if(arrList.get(arrList.size()-1) != arr1[i]){
                arrList.add(arr1[i]);
            }
            i++;
        }
        while(j < m){
            if(arrList.get(arrList.size()-1) != arr2[j]){
                arrList.add(arr2[j]);
            }
            j++;
        }

        System.out.println("Using Optimal : " +arrList);
    }
}
