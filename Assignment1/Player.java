//Nandu Pokhrel
//100637639

import java.util.Random;
import java.util.Scanner;
//Player class
public class Player{

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    protected Monster monster;
    ///function to check if the monster has lost yet or not
    public boolean hasLost() {
        if (monster.getHP() <= 0)
            return true;
        else
            return false;   
    }
    //calling the monster
    public Monster getMonster() {
        return monster;
    }

    public int chooseMove() {
        return 0;
    }
    //checking if player is faster than the monster
    public boolean isFasterThan(Player enemy){
        if (this.monster.getSpeed() > enemy.getMonster().getSpeed())
            return true;
        else    
            return false;
    }

    
    public void attack(Player enemy, int playerMove) {
        float acc = rand.nextFloat();
        float moveAccu = 0;
        int movePower = 0;
        //if we choose move 1
        if ( playerMove == 1) {
            moveAccu = this.getMonster().getMove1().getAccuracy();
            movePower = this.getMonster().getMove1().getPower();
        }
        //if we choose move 2
        else if ( playerMove == 2) {
            moveAccu = this.getMonster().getMove2().getAccuracy();
            movePower = this.getMonster().getMove2().getPower();
        }
        //if we choose move 3
        else if ( playerMove == 3) {
            moveAccu = this.getMonster().getMove3().getAccuracy();
            movePower = this.getMonster().getMove3().getPower();
        }
        //if we choose move 4
        else if ( playerMove == 4) {
            moveAccu = this.getMonster().getMove3().getAccuracy();
            movePower = this.getMonster().getMove3().getPower();
        }
        //
        if (acc < moveAccu) {
            int damageDealth = this.getMonster().getAttack() + movePower -enemy.getMonster().getDefense();

            enemy.getMonster(). setHP(enemy.getMonster().getHP()- damageDealth);
        }
    }
}