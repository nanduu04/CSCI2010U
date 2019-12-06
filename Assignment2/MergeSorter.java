//Nandu Pokhrel (100637639)

public class MergeSorter extends Sorter{

   public void sort(double[] list) {

       int size =1;
       int ia,ua,ib,ub,i,j,it;
       double tempArray[] = new double[list.length];
       while(size<tempArray.length)
       {
           ia =0;
           it=0;
           while((ia+size) < list.length)
           {
               ib = ia+size;
               ua = ib -1;
               if((ib + size -1)< list.length)
                   ub = ib+size-1;
               else
                   ub = list.length-1;
               for(i=ia,j=ib;i<=ua && j<=ub;it++)
               {
                   countOp();
                   if(list[i]<list[j]) {
                       tempArray[it] = list[i];
                       i++;
                   }else {
                       tempArray[it] = list[j];
                       j++;                      
                   }
               }
               for(;i<=ua;i++)
               {
                   tempArray[it] = list[i];
                   it++;
               }
               for(;j<=ub;j++)
               {
                   tempArray[it] = list[j];
                   it++;
               }
              
               ia = ub+1;
           }
           for(;it<list.length;it++)
           {
               tempArray[it]=list[ia];
               ia++;
           }
          
           for(i=0;i<list.length;i++)
           {
               list[i] = tempArray[i];
           }
          
           size = size*2;
       }
   }

}