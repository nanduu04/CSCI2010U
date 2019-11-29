
import java.util.ArrayList;
import java.util.List;

//class RadixSort
public class RadixSort {
    public Buckets buck;
    public List<String> numbers;
    public RadixSort(){
        //arraylist to store numbers
        numbers = new ArrayList<>();
        buck = new Buckets();
    }
    //function to sort
    public void radixSort() {
        int numDigits = numbers.get(0).length();
        for (int i = 0; i < numDigits; i++) {
            print(numbers);
            
            for (String j: numbers) {
                if (j.charAt(numDigits - 1 - i) == '0') buck.addZero(j);
                else  buck.addOne(j);
            }
            numbers = buck.getAllInOrder();
            for (String j : numbers) {
                if (j.charAt(numDigits - 1 - i) == '0') buck.removeZero(j);
                else buck.removeOne(j);
            }
        }
        print(numbers);
    }
    //pring the numbers
    public static void print(List<String> numbers){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (String i :numbers){
            sb.append(i+ " ");
        }
        sb.append(" ]");
        System.out.println( sb.toString());

    }
    //fuction tosting
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (String i :numbers){
            sb.append(i+ " ");
        }
        sb.append(" ]");
        return sb.toString();
    }
}
