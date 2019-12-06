//Nandu Pokhrel (100637639)

public class InsertionSorter extends Sorter{
    
   public void sort(double[] list) {
       int i,j;
       double key;
       for( i=1;i<list.length;++i)
       {
           key = list[i];
           j=i-1;
          
           while(j>=0 && list[j] > key)
           {
               countOp();
               list[j+1] = list[j];
               j--;
           }
           countOp();
           list[j+1] = key;
       }
   }
}

