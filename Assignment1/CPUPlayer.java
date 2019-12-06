//Nandu Pokhrel
//100637639

import java.util.Random;
//this is the class CPUPlayer 
public class CPUPlayer extends Player{
    
    //constructor 
    CPUPlayer(Monster monster) {
        this.monster = monster;
    }

    //this is to choose the move
    public int chooseMove() {
        return rand.nextInt(4)+1;
    }     
    
}