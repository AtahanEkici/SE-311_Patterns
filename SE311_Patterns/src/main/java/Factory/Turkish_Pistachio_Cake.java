package Factory;

public class Turkish_Pistachio_Cake implements Cake
{
    private int ID = 0;
    
    public Turkish_Pistachio_Cake()
    {
        ID++;
    }
    
    @Override
    public void CakeType()
    {
        System.out.println("Turkish Pistachio Cake"+"("+ID+")");
    }  
}