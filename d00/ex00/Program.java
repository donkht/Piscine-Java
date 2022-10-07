public class Program {
    public static void main(String args[]) {
        int number = 479598;
        int ret = 0;

        ret = ret + (number % 10);
        number = number / 10;
        ret = ret + (number % 10);
        number = number / 10;
        ret = ret + (number % 10);
        number = number / 10;
        ret = ret + (number % 10);
        number = number / 10;
        ret = ret + (number % 10);
        number = number / 10;
        ret = ret + (number % 10);
        number = number / 10;
        System.out.println(ret);
    }
 }