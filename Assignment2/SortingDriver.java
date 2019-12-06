//Nandu Pokhrel (100637639)

public class SortingDriver {
  
   public static double[] generateRandomArray(int size)
   {
       double array[] = new double[size];
       for(int i=0;i<array.length;i++)
           array[i] = Math.random()*100.0;
       return array;
   }

   public static void main(String[] args) {

       int size[] = {10,100,1000,10000,100000};
      
       for(int i=0;i<size.length;i++)
       {
           double array1[] = generateRandomArray(size[i]);
           double array2[] = array1.clone();
          
           // algorithm #1
           Sorter iSorter = new InsertionSorter();
           iSorter.sort(array1);
           System.out.println("Intersion Sort Operations: "+size[i]+" : "+iSorter.getOpCount());
  
           // algorithm #2
           Sorter mSorter = new MergeSorter();
           mSorter.sort(array2);
           System.out.println("Merge Sort Operations: "+size[i]+" : "+mSorter.getOpCount());
       }
   }

}