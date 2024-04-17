import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (a > 0) {
            for (int i = 0; i < b; i++) {
                sb.append(a);
            }
        } else {
            System.out.println(0);
            return;
        }
        
        System.out.println(sb);
    }
}