import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int number;
        int counter = 0;

        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        while (number != 42){

            if (checker(number))
                counter++;
            number = in.nextInt();
        }
        in.close();
        System.out.println("Count of coffee-request - " + counter);
    }

    private static boolean checker(int number) {
        boolean isPrime = true;

        if (number < 2)
            return (false);
        for (int i = 2; i < number; i++){

            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return (isPrime);
    }
}