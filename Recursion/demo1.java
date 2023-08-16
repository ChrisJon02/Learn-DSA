public class demo1 {
    static int count = 0;

    public static void main(String[]args){
        print();
    }

    public static void print(){
        if(count == 3){
            return;
        }
        System.out.println(count);
        count++;
        print();
    }
}
