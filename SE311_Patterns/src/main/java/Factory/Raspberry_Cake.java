package Factory;

public class Raspberry_Cake implements Cake
{
    private int ID = 0;
    
   public Raspberry_Cake()
    {
        ID++;
    }
    @Override
    public void CakeType() 
    {
        System.out.println("Raspberry Cake"+"("+ID+")");
    } 
}