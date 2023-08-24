import java.util.Arrays;
import java.util.HashMap;
public class countFreqCharInStr {
    public static void main(String[] args) {
	    String str = "abacdbfghf";
	    int n = str.length();
		hashAArrayChar(str, n);
		hashFreqChar(str, n);

	}
	// Hash Array Approach
	static void hashAArrayChar(String str, int n){
	    int[] hash = new int[26];
	    for(int i = 0; i<n; i++){
	        hash[str.charAt(i) - 97]++;
	    }
		System.out.println("Using hash array approach : ");
	    System.out.println(Arrays.toString(hash));
	}
	// Using Hashmap Approach
	static void hashFreqChar(String str, int n){
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	   for(int i = 0; i<n; i++){
	       if(map.containsKey(str.charAt(i))){
	           map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
	       }else{
	           map.put(str.charAt(i), 1);
	       }
	   }
	   System.out.println("Using hashmap approach : ");
	    for (HashMap.Entry<Character, Integer> entry : map.entrySet())
         {
            System.out.println(entry.getKey() + " " + entry.getValue());
         }
	}
}
