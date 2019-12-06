//Nandu Pokhrel
//100637639

// Move class
public class Move{
    private String name;
    private String type;
    private int power;
    private float accuracy;
//this is the constructor move type with name, type power and accuracy
    Move(String name, String type, int power, float accuracy){
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }
    //returns accuracy
    float getAccuracy(){
        return accuracy;
    }

    //returns type
    String getType(){
        return type;
    }

    //returns power
    int getPower(){
        return power; 
    }
       
    //returns name
    String getName(){
        return name;
    }
}