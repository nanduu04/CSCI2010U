//Nandu Pokhrel
//100637639

//this is the class for moneter
public class Monster{
    private String name;
    private String type;
    private int hp;
    private int speed;
    private int attack;
    private int defense; 
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;
    
    // this is a construtor Monster with name, type, speed, hp, attach , defebse and four moves
    Monster(String name, String type, int hp, int speed, int attack, int defense, Move move1, Move move2, Move move3, Move move4){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    //returns name
    String getName(){
        return name;
    }

    //returns name 
    String getType(){
        return type;
    }

    //returns HP 
    int getHP(){
        return hp;
    }

    //sets  health 
    void setHP(int hp){
        this.hp = hp;
    }

    //gets speef 
    int getSpeed(){
        return speed;
    }

    //returns defense
    int getAttack(){
        return attack;
    }

    //returns defense
    int getDefense(){
        return defense;
    }

    //returns first move
    Move getMove1(){
        return move1;
    }

    //returns seconf move
    Move getMove2(){
        return move2;
    }

    //returns thrid move
    Move getMove3(){
        return move3;
    }

    //returns fourth move
    Move getMove4(){
        return move4;
    }

}
