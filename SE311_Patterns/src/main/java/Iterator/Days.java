package Iterator;

public class Days implements Container {
   public String names[] = {"Monday" , "Tuesday" ,"Wednesday" ,"Thursay", "Friday","Saturday","Sunday"};

   @Override
   public Iterator getIterator() 
   {
      return new NameIterator();
   }

   private class NameIterator implements Iterator 
   {
      int index;

      @Override
      public boolean hasNext() 
      {
         if(index < names.length)
         {
            return true;
         }
         return false;
      }

      @Override
      public Object next() 
      {   
         if(this.hasNext())
         {
            return names[index++];
         }
         return null;
      }		
   }
}