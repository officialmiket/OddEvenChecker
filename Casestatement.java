import java.util.Scanner;

public class Casestatement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int points = scanner.nextInt();

        int range = points / 25;


        switch (range) {
            case 0:
                System.out.println("Vitsord ar 4");
                break;
            case 1:
                System.out.println("Vitsord ar 5");
                break;
            case 2: 
                System.out.println("vitsord ar 6");
                break;
            default:
            System.out.println("vitsord 7");
            break;
        }
    }
}