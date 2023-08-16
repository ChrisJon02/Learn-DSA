public class palindromicString {
    
    // Iterative approach
    static void isPalindrome(String input){
        boolean bool = false;
        int p2 = input.length() - 1;
        for(int p1 = 0; p1 < input.length()/2; p1++){
            if(input.charAt(p1) != input.charAt(p2)){
                System.out.println("Its not a palindrome");
                break;
            }else{
               p2--;
               bool = true;
            }
        }
        if(bool == true){
        System.out.println("It is a palindrome");
        }
    }
    // Recursive approach
    static boolean recurseIsPalindrome(int i, String str){
        if(i == str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt((str.length()-1) - i)){
            return false;
        }else{
            return recurseIsPalindrome(i+1, str);
        }
    }

    public static void main(String[] args) {
        String original = "ABCDAD";
        String newOne = "11211";
        System.out.print("Using iterative approach : ");
        isPalindrome(original);
        System.out.println();
        System.out.print("Using recursive approach : ");
        if(recurseIsPalindrome(0, newOne) == true){
             System.out.println("This is a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
        
    }
}

