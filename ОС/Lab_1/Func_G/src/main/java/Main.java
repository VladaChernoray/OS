import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
        }
        int res = 2;
        System.exit(res);
    }
}
