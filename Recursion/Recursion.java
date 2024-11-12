public class Recursion {
    public static void main(String[] args) {
//        Recursion recursion = new Recursion();
//        recursion.print();
        print();
    }
    static int count = 0;
    static void print() {
        if (count == 3)
            return;

        System.out.println(count);
        count++;
        print();
    }
}




//public class Recursion {
//    public static void main(String[] args) {
////        while (true) {
//            System.out.println("1");
//        }
//    }
//}




//add 2 numbers using recursion
//public class A1 {
//    static int add(int n1, int n2){
//        return n1+n2;
//    }
//    public static void main(String[] args) {
//        int result=add(2,3);
//        System.out.println(result);
//    }
//}
