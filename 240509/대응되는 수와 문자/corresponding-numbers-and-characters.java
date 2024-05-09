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

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            map.put(str, i);
            reverseMap.put(i, str);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            if (Character.isDigit(str.charAt(0))) {
                int num = Integer.parseInt(str);
                System.out.println(reverseMap.get(num));
            } else {
                System.out.println(map.get(str));
            }
        }
    }
}