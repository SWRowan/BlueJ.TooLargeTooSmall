import java.util.Scanner;

public class Game {
   
    
    
    public static void main(String[] agrs){
            
            int mysteryNum = (int)(Math.random() * 20) + 1;
            int guessCount = 0;
            int userNum ;
            int lastGuess = 0;
    
            Scanner guessNum = new Scanner(System.in);
     
       do{
         System.out.println("Guess a Number between 1 and 20");
         userNum = guessNum.nextInt();
         guessCount++;
         
          if (userNum == lastGuess){
           System.out.println("You already guessed that!");
           guessCount--;
          }
          else if(userNum == mysteryNum) {
           System.out.println("You Got It! The number was " + mysteryNum + " !");
           System.out.println("You guessed " +guessCount+ " times.");
          }
          else if (userNum > mysteryNum) {
          System.out.println("Too high. Try again!");
          }
          else if (userNum < mysteryNum) {
          System.out.println("Too low. Try again!");
         }
         lastGuess = userNum;
        } while(userNum != mysteryNum);
    } 
  }
    
    

