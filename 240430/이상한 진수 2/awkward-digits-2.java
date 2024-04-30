import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (!str.contains("0")) {
            System.out.println(Integer.parseInt(str, 2));
            return;
        }

        String modified = str.replaceFirst("0", "1");
        int ret = Integer.parseInt(modified, 2);

        System.out.println(ret);
    }
}