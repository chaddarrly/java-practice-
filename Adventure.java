import java.util.*;
class Adventure{
    public static void main(String [] args){
       System.out.println("Choose your adventure!!");
       
       //get variables and objects
       Scanner kb = new Scanner(System.in);
       int userAnswerOne, userAnswerFour;
       String userAnswerTwo,userAnswerThree;
       
       //get user input amd start loop
       System.out.print("Hello adventurer, choose your destination " + "\n "
                         + "(Press 1 for Tavern, 2 for Jungle):");
                         
                         
       userAnswerOne = kb.nextInt();
       
       if (userAnswerOne == 1){
          System.out.print("You chose Tavern, you walk in and sit at the bar" + "\n"
                              + " do you have a drink? (press y for yes, n for no):");
                              
             userAnswerTwo = kb.next();
                              
             if (userAnswerTwo.equals( "y")){ 
                     System.out.println("The bartender gives you a mysterious purple drink " + "\n"
                                   + "you drink it AHHH ! it was poison" + "\n"
                                   + "End of adventure , Goodbye!");
                                   
              }  else if (userAnswerTwo.equals("n")){
                     System.out.print("You refused the drink , this angers the bartender, he kicks you out " + "\n"
                                    + "of the bar , End of adventure, Goodbye");                             
                              
              }  else{
                     System.out.print("Invalid response , try again");
              }                 
                              
         } else if (userAnswerOne == 2){
             System.out.print("You chose Jungle, you are walking for hours , finially you stumble " + "\n"
                                  + "upon a cave will you enter?(Press y for yes, n for no):");
                                  
              userAnswerThree = kb.next();
                                 
             if (userAnswerThree.equals("y")){   
                  System.out.print("You enter the cave , there you find  an ancient artifact. " + "\n"
                                     + "do you take it ? (Press 1 for yes , 2 for no):");
                     userAnswerFour = kb.nextInt();
                                     
                   if (userAnswerFour == 1){
                       System.out.print("You take the artifact, the cave collapse leaving you trapped " + "\n"
                                          + "End of adventure GoodBye");
                                          
                  } else if (userAnswerFour == 2){
                        System.out.print("You keep going deeper into the cave , where you eventually find " + "\n"
                                          +" treasure !!!, congradulations you beat the game !!");
                  } else{
                         System.out.print("Invalid response Game over !");
                  }
                                     
              } else if (userAnswerThree.equals("n")){
                     System.out.print("You wander some more, eventually make your way out of the jungle " + "\n"
                                       + "to paradise ");
              } else{
                     System.out.print("Invalid response restart program" );
              }
               

        } else{
             System.out.println("Invalid respponse, restart adventure");
        }
       
    }//close main method
}//close class