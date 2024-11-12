public class Recursion_print1ToN {
    static void print(int i, int N) {
        if (i > N) {
            return;
        }else {
            System.out.println(i);
        }
            print(i + 1, N);
        }

    public static void main(String[] args) {
      // int N=4;
       print(1, 4);
    }
}


//    static void using_backtracking(int i, int n) {
//        if (i < 1) {
//            return;
//        }
//        using_backtracking(i - 1, n);
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        using_backtracking(n, n);
//    }
//}




