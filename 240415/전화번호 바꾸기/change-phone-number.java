import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr = str.split("-");

        String tmp = arr[1];
        arr[1] = arr[2];
        arr[2] = tmp;

        System.out.println(String.join("-", arr));
    }
}