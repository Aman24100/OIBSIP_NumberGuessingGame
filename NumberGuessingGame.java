import java.util.Random; 
 import java.util.Scanner; 
  
 public class NumberGuessingGame { 
     public static void main(String[] args) { 
  
         Random Number_Gen = new Random(); 
         int Correctguess = Number_Gen.nextInt(100); 
         int NumberTry = 0; 
         int NumberGuess; 
         int Max_Attempts = 15; // This is the Maximum Number of attempts 
  
         Scanner scanner = new Scanner(System.in); 
         System.out.println("Please enter user name:"); 
         String user = scanner.nextLine(); 
  
         // validation to prompt user to input their name before starting the game. 
         while (user.length() == 0) { 
             System.out.println("Please enter user name:"); 
             user = scanner.nextLine(); 
         }; 
  
         System.out.println("Hello " + user + "! Welcome to the guessing game."+
         "Remember you have only 15 attempts for guessing correct number"); //welcome message 
  
         for (int i = 1; i <= Max_Attempts; i++) { 
             System.out.println("Guess a number between 0 and 100:"); 
             NumberGuess = scanner.nextInt(); 
             NumberTry++; 
 // Check if the input the user put is the correct value or not 
  
             if (NumberGuess == Correctguess) { 
                 System.out.println( 
                         "Congratulations " + user + "! You have successfully guessed the correct number in " + NumberTry + " attempt(s)"); 
                 break; 
             } else if ( NumberGuess < Correctguess) { 
                 System.out.println("Your guess is too low"); 
             } else { 
                 System.out.println("Your guess is too high"); 
             } 
              
  
             // Check if the user has used all the attempts 
             if (i == Max_Attempts) { 
                 System.out.println("Sorry, " + user + ", you didn't guess the number in " + Max_Attempts 
                         + " attempts. The correct number was " + Correctguess); 
             } 
         } 
          
         System.out.println("Thank you for playing"); 
  
         scanner.close(); 
     } 

 }