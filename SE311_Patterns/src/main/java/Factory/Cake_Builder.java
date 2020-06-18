package Factory;

abstract class Cake_Factory
{
abstract public Chocolate_Cake createChocolateCake();
abstract public Raspberry_Cake createRaspberryCake();
abstract public Turkish_Pistachio_Cake createTurkishPistachio();
abstract public Vanilla_Cake createVanillaCake();
}

public class Cake_Builder extends Cake_Factory
{
    @Override
    public Chocolate_Cake createChocolateCake()
    {
        return new Chocolate_Cake();
    }

    @Override
    public Raspberry_Cake createRaspberryCake()
    {
        return new Raspberry_Cake();
    }

    @Override
    public Turkish_Pistachio_Cake createTurkishPistachio() 
    {
        return new Turkish_Pistachio_Cake();
    }

    @Override
    public Vanilla_Cake createVanillaCake() 
    {
        return new Vanilla_Cake();
    }
}