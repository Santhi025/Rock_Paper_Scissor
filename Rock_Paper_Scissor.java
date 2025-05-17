import java.util.*;
public class Rock_Paper_Scissor{
    public static void main(String[] args){
        System.out.println("****WELCOME TO THE GAME****");
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        boolean con=true;
        while(con){
            System.out.println("1 for Rock");
            System.out.println("2 for Paper");
            System.out.println("3 for Scissor");
            System.out.println();
            System.out.println("It's your turn enter your choice");
            int you=input.nextInt();
            switch(you){
                case 1:{
                    System.out.println("You have choosen Rock");
                    break;
                }
                case 2:{
                    System.out.println("You have choosen Paper");
                    break;
                }
                case 3:{
                    System.out.println("You hava choosen Scissor");
                    break;
                }
                default:{
                    System.out.println("Wrong selection. Please select a valid number ");
                }
            }
            System.out.println("Now it's computer turn");
            int comp=rand.nextInt(1,4);
            switch(comp){
                case 1:{
                    System.out.println("Computer have choosen Rock");
                    break;
                }
                case 2:{
                    System.out.println("Computer have choosen Paper");
                    break;
                }
                case 3:{
                    System.out.println("Computer have choosen Scissor");
                    break;
                }
            }
            if(you==comp){1
                System.out.println("Match draw");
            }
            else if(comp==1 &&you==3 || comp==2&&you==1||comp==3&&you==2){
                System.out.println("Sorry!, Computer won!");
            }
            else {
                System.out.println("Congratulations!, You won");
            }
           System.out.println("Do you want to play again");
            System.out.println("Press 'Y' if yes or 'N'if no ");
            char x=input.next().charAt(0);
            if(x=='N')
            con = false;
            
        }
        input.close();
    }
}