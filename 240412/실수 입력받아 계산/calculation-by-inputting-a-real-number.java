import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        
        System.out.println(String.format("%.2f", a + b));
    }
}