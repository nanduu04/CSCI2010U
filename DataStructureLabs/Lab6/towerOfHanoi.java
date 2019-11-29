public class towerOfHanoi {
    //class solveHanoi
    public static void solveHanoi(int n, int source, int dest, int  temp) {
        if (n == 0) {
            return;
        }
        else {
            solveHanoi(n - 1, source, temp, dest);
            System.out.printf("Move disk rings from peg %d to peg %d\n", source, dest);
            solveHanoi(n -1, temp, dest, source);
        }
    }
    //main method
    public static  void main(String[] args){
        solveHanoi(4, 1, 3, 2);
    }
}
