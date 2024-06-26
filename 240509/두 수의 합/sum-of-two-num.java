import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int n, k, ret;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i]) && map.get(arr[i]) > 0) {
                ret += map.get(k - arr[i]);

                if (arr[i] == k - arr[i]) {
                    ret--;
                }

                map.put(arr[i], map.get(arr[i]) - 1);
            }
        }

        System.out.println(ret);
    }
}