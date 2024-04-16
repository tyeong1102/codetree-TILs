import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}