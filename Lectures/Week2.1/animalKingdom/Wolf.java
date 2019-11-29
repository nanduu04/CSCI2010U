package animalKingdom;

//final -> cannot be subclass
public class Wolf extends Animal{

    private int numTeeth = 36;

    public Wolf(){
        super("Canis Lupis", "Canid");
        this.isCarnivorous = true;
    }

    public void speak(){
        System.out.println("Aaaaaaaooo!");
    }

    public int getNumTeeth(){
        return numTeeth;
    }
}
