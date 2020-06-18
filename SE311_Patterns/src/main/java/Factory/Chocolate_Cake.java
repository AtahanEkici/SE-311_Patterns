package Factory;

public class Chocolate_Cake implements Cake
{
    private int ID = 0;
    
   public Chocolate_Cake()
    {
        ID++;
    }
    @Override
    public void CakeType() 
    {
        System.out.println("Chocolate Cake"+"("+ID+")");
    } 
}
