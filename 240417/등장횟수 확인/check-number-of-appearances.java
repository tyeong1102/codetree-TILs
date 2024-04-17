import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int num, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(br.readLine());

            if (num % 2 == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}