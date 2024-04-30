import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int r, c, ret;
    public static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new String[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {
                        if (!arr[0][0].equals(arr[i][j]) && !arr[i][j].equals(arr[k][l]) && !arr[k][l].equals(arr[r - 1][c - 1])) {
                            ret++;
                        }
                    }
                }
            }
        }
        System.out.println(ret);
    }
}