import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if (n >= 5) {
            System.out.println(n * n);
        } else {
            System.out.println(n * n);
            System.out.println("tiny");
        }
    }
}