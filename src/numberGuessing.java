import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args){
//        Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 0;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game! ");
        System.out.printf("Guess a Number between %d-%d\n  ", min , max);

        do{
            System.out.print("Enter a Guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomNumber){
                System.out.println("TOO HIGH! Try Again");
            }else if(guess < randomNumber){
                System.out.println("TOO LOW! Try Again ");
            }

        }while(guess != randomNumber);

        System.out.println("# Number of Attempts :" + attempts);
        scanner.close();
    }
}
