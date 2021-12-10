public class Main {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
        }
        int res = 2;
        System.out.println(res);
        System.exit(res);
    }
}
