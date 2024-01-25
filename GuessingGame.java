import java.util.Scanner;


public class GuessingGame {

  public static void guessingGame()
  {
         Scanner sc = new Scanner(System.in);
         int number = 1+(int)(50*Math.random());

         int k = 4;

         int i, guess;

         System.out.println("A number is choosen" + " between 1 to 50 " + " within 4 trials.");

         for(i = 0 ; i<k; i++)
         {
          System.out.println("Guess the number:");

          guess = sc.nextInt();

          if(number == guess){
            System.out.println("Congrulations!"+ " You guessed the number. ");
            break;
          }
          else if (number >guess && i != k-1 )
          {
           System.out.println("The number is " + " greater than  " + guess);
          }
          else if (number < guess && i != k-1)
          {
            System.out.println("The number is" + " less than " + guess);
          }

         }

         if (i == k) {
          System.out.println("You have exhausted" + " k trials ");
          System.out.println("The number was " + number);
         }
  }

  public static void main (String arg[]){
    guessingGame();
  }
  
}
