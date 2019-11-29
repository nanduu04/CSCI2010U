public class battle{
    public static void main(String[] args){
        float kroggAttack = 38.5f;
        float kroggDefense = 20.0f;
        float kroggHP = 200f;
        float bossAttack = 25f;
        float bossDefense = 12.5f;
        float bossHP = 200f;
        int round = 1;
        float kdamage;
        float damage;
        //do while loop 
        do{
        System.out.println("Round: "+ round++);
        //calculating damae taken by boss
        damage = kroggAttack - bossDefense;
        System.out.println("Krogg does " +damage +" points of damage to Boss.");
        //calculating damage taken by krogg
        kdamage = bossAttack - kroggDefense;
        System.out.println("Boss does " +kdamage +" points of damage to Krogg.");
        //calculating boss' remaining health
        bossHP = bossHP - damage;
        System.out.println(bossHP);
        //calculating krogg's remaining health
        kroggHP = kroggHP - kdamage;
        System.out.println(kroggHP);
        System.out.println(" ");
    }while((kroggHP > 0) && (bossHP > 0)) ;
    //using loops to determing who won the game 
    if( kroggHP > bossHP){
        System.out.println("Krogg has won. You are victorious!");
    }else{
        System.out.println("Boss has won. You are victorious!");
    }
    }
}