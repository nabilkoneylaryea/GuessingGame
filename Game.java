import java.util.*;
public class GuessingGameV2
{
 public static void main(String[] args)
 {
     Scanner in = new Scanner(System.in);
     int rand = (int)(Math.random() * 51);
     int count = 1;
     int number;
     System.out.print("Would you like to play a guessing game (Y or N)? ");
     String answer = in.next();
     System.out.println();
     boolean go = answer.equalsIgnoreCase("Y");
     if (go)
     {
         while (go)
         {
             System.out.print("Please enter a number: ");
             number = in.nextInt();
             System.out.println();
             go = number != rand;
             if(go)
             {
                 if (number < rand)
                 {
                     System.out.println("Too low!");
                     System.out.println();
                 }
                 else if (number > rand)
                 {
                  System.out.println("Too high!");
                 }
                 System.out.print("Would you like to continue (Y or N)? ");
                 answer = in.next();
                 System.out.println();
                 if(answer.equalsIgnoreCase("N"))
                 { 
                     System.out.println("You made " + count + " guesses.");
                     go = !go;
                }
                }
                else
                {
                    System.out.println("Congratulations!");
                    System.out.println();
                    System.out.println("The random number was " + rand);
                    System.out.println();
                    System.out.println("Your number of guesses was " + count);
                    System.out.println();
                }
             count ++;
          }
     }
     else
      System.out.print("");
     System.out.println("Have a nice day!");
   }
 }

