public class Recursion_printNto1 {
    static void print(int i, int n){
        if (i<1){
            return;
        }
        System.out.println(i);
        print(i-1, n);
    }

    public static void main(String[] args) {
        int n=4;
        print(n,n);
    }
}


//    static void print(int i, int n){
//        if (i>n){
//            return;
//        }
//        print(i+1, n);
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        int n=5;
//        print(1,n);
//    }
//}
