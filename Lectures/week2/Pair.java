public class Pair<X, Y>{
    public X key;  //we could x= string or int
    public Y value;

    public Pair(X key, Y value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "Pair("+ key + "," + value + ")";
    }
}