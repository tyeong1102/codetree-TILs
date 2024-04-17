import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        b = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (a <= b) {
            if (b % 2 == 0) {
                sb.append(b).append(" ");
            }
            b--;
        }

        System.out.println(sb);
    }
}