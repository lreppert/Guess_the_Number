/**
 * Created by Larry on 1/15/2015.
 */
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static int number, guess, maxValue, guesses;

    public static Scanner scan;
    public static Random rand;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        rand = new Random();
        System.out.println("Please enter the maximal range of numbers to guess from!");
        maxValue = scan.nextInt();
        number = rand.nextInt(maxValue);
        guesses = 1;
        System.out.println("Please enter a guess:");
        while (guess != number) {
        guess = scan.nextInt();
          if (guess > number) {
              System.out.println("Your Guess is too high!");
              System.out.println("Number of Guesses:" + guesses);
          }

            if (guess < number){
                System.out.println("Your Guess is too Low!");
                System.out.println("Number of Guesses:" + guesses);
            }
            guesses = guesses + 1;
        }
        System.out.println("You Won!!!!!!! It only took" + " " + guesses + " " + "Guesses!!!!");
    }

}
