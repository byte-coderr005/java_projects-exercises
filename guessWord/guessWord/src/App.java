import java.util.Random;
import java.util.Scanner;

public class App{
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean wordExists = false;
        String[] words = new String[]{"bmw", "yamaha", "burak", "msi", "kawasaki"}; //Our Array for guess.
        
        System.out.println(String.join(" ", words));
        System.out.println("Please enter one of the above words");

        Random rand = new Random();
        int guessIndex = rand.nextInt(5);  // Creates 0 between 4 random numbers. 
        int life = 3;
        
        Scanner sc = new Scanner(System.in);

        while (life > 0) { // IF life bigger than zero than program continues.
            String word = sc.nextLine();
            for (String w : words) {
                if (w.toLowerCase().equals(word.toLowerCase())) { // Entered word is equal or not to case sensitive.
                    wordExists = true;
                }
            }
            if (!(word == words[guessIndex])){ //We controlling index of words  for guessed word true or not.
                System.out.println("Please enter accepted characters.");
                life--;
                System.out.println("Lives remaining: " + life);
            } else if(word == words[guessIndex]) {
                System.out.println("You entered a correct word.");
                break;
            }
        }
        if (life == 0) {
            System.out.println("No lives left. Game over.");
        }
    }
}
