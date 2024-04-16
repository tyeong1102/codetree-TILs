import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 1) {
            a += 3;
        }

        if (a % 3 == 0) {
            System.out.println(a / 3);
            return;
        }

        System.out.println(a);
    }
}