

/** 
 * Week01a
 * 
 * this is the demo from lecture 1a from randy
 * 
 * @author nandu pokhrel
 * @date september 6,2019
 */

 public class Week01a{

     static int age = 5;
     String name = "Randy";
     /** main
      * 
      * the entry point for our app
      *
      *@args args Command-line arguments
      */
//static means part of the class      
        public static void main(String[] args){
        System.out.println(age);
        int age = 44;
        System.out.println(age);
        System.out.println(Week01a.age); //to print from static

        Week01a w1 = new Week01a();  //creating a new instance
        //can't access non-static here in main();
        //System.out.println(w1.age);
        System.out.println(w1.name);

          long bankBalance = 10000000000L;  //use L at the end of the number

          Integer otherAccount = 500;  //capital I
          
          float gpa = 2.4f;//float only has 32 bits

          String ageString = "20 years old";

          try{
            age= Integer.parseInt(ageString);
            //succeded
          }catch(NumberFormatException e){
            //failed
            e.printStackTrace(); //prints and traces the problem, helpful to figure out where
          }finally{
            //succeded or failed
          }
         
          //printf = print formatted, age will go in the %d, you can add numbers behind the %decimal to make it more prercise
          System.out.printf("Your age is %d.\n", age);  

          //in java single quote for character and double quote for strings
          char KeyPressed = 'A';
          String name = "Randy";
          if ((KeyPressed == 'A') || (name.equals("Ramdy"))){  // double pipe is a OR operator. && is a and operator
              System.out.println("welcome to the NSA!");
          }else if(name.equals("Justin")){
            System.out.println("Welcome PM!");
          }
          else{
              System.out.println("No entry!");
          }
    

      int choice = 7;
      switch (choice) {
        case 0:
          //do something for 0
          break;
        case 1:
          //do something for 0
          break;
        default:
          //all other cases

      }
      //ternery operator
      int hp = 30;
      hp = (hp < 0) ? 0 : hp;

      //LOOPS

      //while loop
      int numTurns = 3;
      while (numTurns > 0) {
        //do something
        numTurns--;
      }

      // do-while loop
      int numTurnss = 3;
      do{
        //do something 
        System.out.println("Hello from do-while");
        numTurnss--;
      }while (numTurnss > 0);

      //for-loop
      int numTurnsss =3;
      for(int i =0; i < numTurnsss; i++){
        //do something
        System.out.println("Hello from for");
        numTurnsss--;
      }

      //also a for loop
      float[] grades= new float[] {27.0f, 30.0f, 15.0f, 19.0f};
      for (float grade : grades) {
        System.out.println("Grade: " + grade);
      }
 }
}
