//iport util random
import java.util.Random;

public class Fibonacci {
    //declarations
    public static int assignmentCount;
    private static int fibonacciRec (int n){
        assignmentCount++;

        if(n==0 || n==1) return n;

        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }
    //static class for fonicacci interation
    private  static int fibonacciIter(int n) {
        int a = 0;
        int b = 1;
        if(n <= 1) {
            return n;
        }
        for (int i = 0; i < n; i++){
            int temp = a;
            a += b;
            b = temp;
            assignmentCount++;
        }
        return a;
    }
    private static void resetCallCount(){assignmentCount=0;}

    
    //provided by randy
    private static int getCallCount(){return assignmentCount;}

    public static void main(String[]  args){
        System.out.println("Fibonacci:");

            int n =15;
            resetCallCount();
            int recursiveResult = fibonacciRec(n);
            int recursiveCalls = getCallCount();
            System.out.printf("Recursive result: %d (%d recursive calls)\n",
                    recursiveResult, recursiveCalls);
            resetCallCount();
            int iterativeResult = fibonacciIter(n);
            int iterations = getCallCount();
            System.out.printf("Iterative result: %d (%d iterations)\n", iterativeResult, iterations);
            System.out.println();
    }
}