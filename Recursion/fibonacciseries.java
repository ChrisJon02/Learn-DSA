public class fibonacciseries {
    public static void main(String[]args){
        int n = 5;
        iterativeFibo(n);
        System.out.println();
        System.out.println("Using recursive approach : ");
        for(int i = 0; i <= n; i++){
          System.out.print(recurseFibo(i) + " ");
        }
    }
    // Iterative Approach
    static void iterativeFibo(int n){
    
        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        for(int i = 0; i < fibo.length; i++){
            System.out.print(fibo[i] + " ");
        }
    }
    // Recursive Approach
    static int recurseFibo(int n){
        if(n <= 1){
            return n;
        }
        
        return recurseFibo(n-1) + recurseFibo(n-2); 
    } 
}
