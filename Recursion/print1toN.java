public class print1toN{

   
    public static void main(String[]args){
        System.out.println("Forward Recursion:");
        forward1toN(1, 5);
        System.out.println("----------------------");
        System.out.println("Backward Recursion:");
        backward1toN(5, 5);
    } 
    //Forward Recursion
    static void forward1toN(int i, int N){
        if(i > N){
            return;
        }
        System.out.println(i);
        forward1toN(i+1, N);
    }
    //Backward Recursion
    static void backward1toN(int i, int N){
        if(i == 0){
            return;
        }
        backward1toN(i-1, N);
        System.out.println(i);
    }
}