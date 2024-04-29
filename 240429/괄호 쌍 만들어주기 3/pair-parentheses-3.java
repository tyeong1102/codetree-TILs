import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int ret = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                char a = str.charAt(i);
                char b = str.charAt(j);

                if (a == ')') {
                    break;
                } else {
                    if (a != b) {
                        ret++;
                    }
                }
            }
        }

        System.out.println(ret);
    }
}