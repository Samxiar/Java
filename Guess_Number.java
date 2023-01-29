import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int random_Num = rand.nextInt(100) + 1;
        int guess = 0;
        
        while (guess!=random_Num) {
            System.out.println("Guess (It's Obv that the number is between 0-100 DUH) ");
            guess = input.nextInt();
            
            if (guess < random_Num) {
                System.out.println("Guess something higher than "+guess);
            } else if (guess > random_Num) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("You win!");
            }
        }
    }
}