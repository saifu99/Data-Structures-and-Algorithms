public class Recursion_sum_of_firstN {
    //Sum of first N Natural Numbers

    static void parameterizedWay(int i, int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        parameterizedWay(i-1,sum+i);
    }

    public static void main(String[] args) {
        int n=3;
        parameterizedWay(n,0);
    }
}



//    static int functionalWay(int n){
//        if (n==0){
//            return 0;
//        }
//        return n+functionalWay(n-1);
//    }
//    public static void main(String[] args) {
//        int n=4;
//        System.out.println(functionalWay(n));
//    }
//}




