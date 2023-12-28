import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextInt();
        
        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is zero");
            } else {
                System.out.println(number + " is positive.");
            }
        } else
            System.out.println(number + " is negative.");
    }
}
