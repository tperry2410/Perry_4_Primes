package perry_4_guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Perry_4_GuessingGame {

    static String username;
    static int uguess;
    static int magicnumber;
    static Random rand = new Random ();
    static boolean playagain;
    static int chances = 10;
    //the statics are shared with the entire program
    
    public static void main(String[] args) {
        playagain = true;
        magicnumber = rand.nextInt(100);
        System.out.println("What is your name?");
        Scanner userinputname = new Scanner (System.in);
        username = userinputname.nextLine();
        System.out.println("Hello " + username + ". Let's get started.");
        
        //runs while the condition is true
        while(playagain = true) {
            playthegame();
        }
        
        
    }
    
    static void playthegame(){
        Scanner guess = new Scanner(System.in);
        System.out.println("Please pick a number between 1 and 100. You have " + chances + " guesses left.");
        uguess = guess.nextInt();
        if (magicnumber == uguess) {
            System.out.println("You Win!");
            playagain = false;
            chances = 0;
            
        } else if (uguess > magicnumber) {
            System.out.println("Your number is too high. " +
                    "Try again");
            chances --;
           
        } else {
            System.out.println("Your number is too low. " +
                    "Try again");
            chances --;
        }
        
        if(chances < 1) {
            System.out.println("You ran out of guesses, please restart and try again.");
            playagain = false;
        }
    }
    
}
