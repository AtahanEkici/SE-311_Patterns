package Factory;

public class Vanilla_Cake implements Cake
{
    private int ID = 0;
    
    public Vanilla_Cake()
    {
        ID++;
    }
    
    @Override
    public void CakeType()
    {
        System.out.println("Vanilla Cake"+"("+ID+")");
    }  
}