package animalKingdom;

public abstract class Animal{  //abstract= class that cannot be instantianated
    private String species;
    private String genus;
    protected boolean isCarnivorous;   //bool for isCarni cuz its a question

    public Animal(String species, String genus){
        this.species = species;
        this.genus = genus;
        this.isCarnivorous = false;
    }

    public abstract void speak();
}