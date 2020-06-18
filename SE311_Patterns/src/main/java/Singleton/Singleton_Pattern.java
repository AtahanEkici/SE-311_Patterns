package Singleton;

/**
 *
 * @author Atahan Ekici
 */
public final class Singleton_Pattern 
{
    private static Singleton_Pattern single_instance = null;
    
    Singleton_Pattern()
    {
        System.out.println("Singleton");
    }
    
    public static Singleton_Pattern getInstance() // Singleton Pattern //
    {
        if(single_instance == null)
        {
            single_instance = new Singleton_Pattern();
        }
            return single_instance;    
    }
}
