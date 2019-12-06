//Nandu Pokhrel (100637639)
public abstract class Sorter {
  
   private long opCount = 0L;
  
   public long getOpCount()
   {
       return opCount;
   }
  
   protected void resetOpCount()
   {
       opCount = 0L;
   }
  
   protected void countOp()
   {
       opCount++;
   }
  
   public abstract void sort(double[] list);
}