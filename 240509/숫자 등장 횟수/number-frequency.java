import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (map.get(num) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(num)).append(" ");
            }

        }

        System.out.println(sb);
    }
}