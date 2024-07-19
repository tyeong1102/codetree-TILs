import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int a, b, ret;

    public static boolean findNum(int num) {
        while (num > 0) {
            int tmp = num % 10;

            if (num % 3 == 0) {
                return true;
            }

            if (tmp == 3 || tmp == 6 || tmp == 9) {
                return true;
            }

            num /= 10;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        for (int i = a; i <= b; i++) {
            if(findNum(i)) {
                ret++;
            }
        }

        System.out.println(ret);

    }
}