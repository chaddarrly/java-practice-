/* Chaddarrly Brown
   This program will let the user play Rock, Paper,Scissors
   against the computer.Then will display the wins, loses, and
   draws once the program is terminated
*/
import java.util.*;
class GameCB{
   public static void main(String [] args){
      
       //variable and objects used
       Scanner kb = new Scanner(System.in);
       Random rand = new Random();
       int userPick,computerPick,win,lose,draw;
       
       win  =  0;
       lose =  0;
       draw =  0;
       
       //header 
       System.out.println("Let's play Rock, Paper, Scissors!!");
       System.out.println();

       //start do loop
        do{
              System.out.println("Press 1 for Rock, 2 for Paper, 3 for Scissors,\n"
                             + "and 0 to exit");
              userPick = kb.nextInt();
              computerPick = rand.nextInt((3 - 1) + 1) + 1;
       
              if (userPick == 0){
                 System.out.println("Thank you for playing");
              }
               else if((userPick ==1) && (computerPick==1)){
                        System.out.println("You chose Rock. The computer chose Rock. It's a Draw !");
                        System.out.println();
                        draw++;
              }
               else if((userPick== 1) && (computerPick ==2)){
                        System.out.println("You chose Rock.The computer chose Paper. You Lose !");
                        System.out.println();
                        lose++;
               }     
                else if((userPick == 1) && (computerPick == 3)){
                        System.out.println("You chose Rock. The computer chose Scissors. You Win !");
                        System.out.println();
                        win++;
               }
                else if((userPick ==2) && (computerPick==2)){
                        System.out.println("You chose Paper. The computer chose Paper. It's a Draw !");
                        System.out.println();
                        draw++;
               }
                else if((userPick== 2) && (computerPick == 3)){
                        System.out.println("You chose Paper.The computer chose Scissors. You Lose !");
                        System.out.println();
                        lose++;
               }
                else if((userPick == 2) && (computerPick == 1)){
                        System.out.println("You chose Paper. The computer chose Rock. You Win !");
                        System.out.println();
                        win++;
               }
                else if((userPick ==3) && (computerPick==3)){
                        System.out.println("You chose Scissors. The computer chose Scissors. It's a Draw !");
                        System.out.println();
                        draw++;
               }
                else if((userPick== 3) && (computerPick ==2)){
                        System.out.println("You chose Scissors.The computer chose Paper. You Win !");
                        System.out.println();
                        win++;
               }
                else if((userPick == 3) && (computerPick == 1)){
                        System.out.println("You chose Scissors. The computer chose Rock. You Lose !");
                        System.out.println();
                        lose++;
               }
                else{
                        System.out.println("Invalid response. choose one of the options");
                        System.out.println();
               }
       
      }//close do loop
      
      while (userPick != 0);
      if(userPick == 0){
         System.out.println("You won " + win + " time(s).\n"
                           +"The computer won " + lose  + " time(s).\n"
                            + "You tied with the computer " + draw + " time(s).");
      }//close if statement
   }//close main method
}// close class
    
    