import java.util.Random;
import java.util.Scanner;

public class NumberguessingGame {
    public static void main(String args[]) {
        Random rand = new Random();

        int n = rand.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        n += 1;

        for (int i = 0; i < 5;) {
            i++;

            System.out.println("Enter a number: ");
            int guess = scanner.nextInt();
                            System.out.println(n);
            if (guess > n) {
                System.out.println("Its is lower");
            } else if(guess < n) {
                System.out.println("It is higher");
            } else {
                System.out.println("Correct");
                break;
            }
        }
    scanner.close();
    }
}