public class sumNnumbers {
    public static void main(String[] args) {
		int N = 4;
		sum1toN(N);
        parameterizedsum(N, 0);
        System.out.println("Using functional Approach : " + functionalsum(N));
	}
	// Using for-loop
	static void sum1toN(int N){
	    int sum = 0;
	    for(int i = 0; i <= N; i++){
	       sum = sum + i;
	    }
	    System.out.println("Sum of first " + N + " natural numbers using for-loop : " + sum);
	}
    // Parameterised Approach
    static void parameterizedsum(int i, int sum){
        if(i == 0){
            System.out.println("Using parameterised approach : " + sum);
            return;
        }
        parameterizedsum(i-1, sum+i);
    }
    // Functional Approach
    static int functionalsum(int N){
        if(N == 0){
            return 0;
        }

        return N + functionalsum(N - 1);
    }
}
