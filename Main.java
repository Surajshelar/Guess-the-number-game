
import javax.management.StringValueExp;
import java.util.Scanner;
import java.util.Random;
    public class Main {

    static Random r = new Random();
    static int number = r.nextInt(100);
    static int guess = 0;
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        System.out.println("welcome to guess number game ");
        System.out.println("The number iss "+ String.valueOf(number));
        System.out.println("Guess the number between 1-100 ");

        while(guess != number){

            guess = player.nextInt();
            if (number > guess ){
                System.out.println("your guess too low ");
            } else if (number < guess ) {
                System.out.println("your guess too high ");
            }
            else {
                System.out.println("yess your guess is correct");

            }

        }


    }


}
