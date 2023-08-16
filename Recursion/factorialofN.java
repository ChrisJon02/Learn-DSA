public class factorialofN {
    public static void main(String[]args){
        System.out.println("Using Iterative Approach : " +iterativeFact(5));
        System.out.println("Using Recursive Approach : " +recursiveFact(5));
    }
    // Iterative Approach
    static int iterativeFact(int N){
        int ans = 1;
        for(int i = 1; i <= N; i++){
            ans = ans * i;
        }
        return ans;
    }
    // Recursive Approach
    static int recursiveFact(int N){
        if(N == 1){
            return 1;
        }
        return N * recursiveFact(N-1);
    }
}
