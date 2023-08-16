public class nameNtimes {

    public static void main(String[]args){
        int N = 5;
        printName(1, N);
    }
    
    /**
     * 
     */
    static void printName(int i, int N){
        if(i > N){
            return;
        }
        System.out.println("Chris");
        printName(i+1, N);
    }

}
