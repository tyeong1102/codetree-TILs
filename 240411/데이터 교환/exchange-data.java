public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tmp1, tmp2;

        tmp1 = a;
        tmp2 = b;
        a = c;
        b = tmp1;
        c = tmp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}