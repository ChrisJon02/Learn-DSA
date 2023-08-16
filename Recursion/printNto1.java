public class printNto1 {
    public static void main(String[]args){
       int N = 5;
       System.out.println("Forward Recursion:");
       forwardNto1(5, N);
       System.out.println("----------------------");
       System.out.println("Backward Recursion:");
       backwardNto1(1, N);
    }
    // Forward Recursion
    static void forwardNto1(int i, int N){
        if(i == 0){
            return;
        }
        System.out.println(i);
        forwardNto1(i-1, N);
    }
    // Backward Recursion
    static void backwardNto1(int i, int N){
        if(i > N){
            return;
        }
        backwardNto1(i+1, N);
        System.out.println(i);
    }
}
