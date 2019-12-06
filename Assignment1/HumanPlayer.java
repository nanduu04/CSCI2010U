//Nandu Pokhrel
//100637639

import java.util.Scanner;

//HumanPlayer class 
public class HumanPlayer extends Player{
   
    HumanPlayer(Monster monster) {
        this.monster = monster;
    }
    //This shows player option on their attack 
    public int chooseMove() {
        System.out.println("Choose your move: ");
        System.out.println("   Move type ---- Attack Damage");
        System.out.println("1) Vine Whip  --  45");
        System.out.println("2) Tackle     --  50");
        System.out.println("3) Razor Leaf -- 55");
        System.out.println("4) Take Down  -- 90");
        
        int choice = input.nextInt();
        System.out.println("you entered: " + choice + "\n");

        //Makes sure that players choose correct avilable moves
        if (choice < 0 ){
            System.out.println("Move not Avilable, Choose avilable moves on the screem");
        }else if(choice > 4){
            System.out.println("Move not Avilable, Choose avilable moves on the screem");
        }else {
            return choice;
        }
        return choice;
    }
}