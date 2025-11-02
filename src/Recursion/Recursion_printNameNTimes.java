public class Recursion_printNameNTimes {
    static void name(int i, int n) {
        if (i > n)
            return;
        System.out.println("Saifu");
            name(i + 1, n);
        }

    public static void main(String[] args) {
        int n=4;
        name(1, n);
    }
}
