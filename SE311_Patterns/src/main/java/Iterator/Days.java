package Iterator;

public class Days implements Container
{
    public String names[];
    
    public Days(String names[])
    {
        this.names = names;
    }

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
   
   public void printer(String temp)
   {      
       for(Iterator iter = this.getIterator(); iter.hasNext();)
       {
         String name = (String)iter.next();
         System.out.println(""+temp+" : " + name);
       }
   }
}