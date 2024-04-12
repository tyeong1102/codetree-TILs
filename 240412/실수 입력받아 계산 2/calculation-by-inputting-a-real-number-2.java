import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double n, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Double.parseDouble(br.readLine());
        ret = n + 1.5;

        System.out.println(String.format("%.2f", ret));
    }
}