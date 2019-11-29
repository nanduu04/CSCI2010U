public class Student{
    //Professor favouriteProf //not a public class so it aint gonna work

    public int sid;
    public String name;
    private long startDate;

    public Student(int sid, String newName){  //constructer or on other languages "initializer"
        this.sid = sid;  //this means the current object
        name = newName;
        }

        //accesor
    public long getStartDate(){
        return startDate;
    }

    //mutator --> change the date
    public void setStartDate(String date){
        //convert date to a long
    }

    public String toString(){  //toString is a class already made to convirt the pointer loaction to info we need
        return "Student(" + sid + "," + name + ")";
    }
}