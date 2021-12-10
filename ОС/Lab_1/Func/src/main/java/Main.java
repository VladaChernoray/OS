
public class Main {
        public static void main(String[] args) {
            int num=0;
            try {
                num = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nfe) {
            }
            int res=0;
            if(args[1].equals("F")) {
                System.out.println("Res == " + res);
                res = 2;
            }
            if(args[1].equals("G")) {
                System.out.println("Res == " + res);
                res = 2;
            }
            System.exit(res);
        }
    }

