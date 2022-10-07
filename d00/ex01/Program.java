import java.util.Scanner;

public class Program {

    public static void main(String args[]) {

        int num;
        int steps = 1;

        Scanner msg = new Scanner(System.in);
        if (!msg.hasNextInt()) {
            System.err.println("Illegal Argument");
            msg.close();
            System.exit(-1);
        }
        num = msg.nextInt();
        if (num <= 1) {
            System.err.println("Illegal Argument");
            msg.close();
            System.exit(-1);
        } else if (num == 2) {
            System.out.println("true " + steps);
        } else {

            for (int i = 2; i * i <= num; ++i) {
                if (num % i == 0) {
                    System.out.println("false "+ steps);
                    return;
                }
                steps++;
            }
            System.out.println("true " + steps);
        }
    }

}
