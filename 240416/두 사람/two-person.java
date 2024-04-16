import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            if (a >= 19 && str.equals("M")) {
                check = true;
            } 
        }

        if (check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}