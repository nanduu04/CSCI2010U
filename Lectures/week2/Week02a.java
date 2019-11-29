import java.util.*;

public class Week02a{
    
    public static List<Float> filterList(List<Float> items, FloatFilter filter){
        List<Float> results = new ArrayList<>();

        for (float item:items){
            if(filter.match(item)){
                results.add(item);
            }
        }

        return results;
    }

    class Professor{}//this is a non-public class

    static void runDemo(){
        List<String> names=  new ArrayList<>();
        names.add("Harold");
        names.add("Steven");
        names.add("Tina");
        names.add("Larry");
        names.add("Louanne");
        
        for(String name:names){ //goes through names each one and puts it in the name
            System.out.println(name);
        }

        Student fred = new Student(10000000, "Fred Mulligan");
        fred.setStartDate("September 1,2019");

        System.out.println(fred);
        System.out.println(fred.name);

        Pair<String,String> fredGrade = new Pair<>(fred.name, "A+");
        Pair<String,Float> fredMark = new Pair<>(fred.name, 97.5f);

        List<Float> grades = new ArrayList<Float>();
        grades.add(37.0f);
        grades.add(50.0f);
        grades.add(68.5f);
        grades.add(71.0f);
        grades.add(49.9f);

        PassingFilter filter = new PassingFilter();
        List<Float> passingGrades = filterList(grades, filter);
        for (float grade: passingGrades){
            System.out.println("Grade:"+ grade);
        }

    }


    public static void main(String[] args){
        runDemo();
    }
}