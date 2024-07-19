import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;

    public static boolean check(int n) {
        int num = n / 10 + n % 10;
        if (n % 2 == 0 && num % 5 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if (check(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}