package Observer;

public class Centigrad extends Observer
{
    public Centigrad(Weather weather)
    {
        this.weather = weather;
        this.weather.attach(this);
    }

    @Override
    public void update() 
    {
        System.out.println("The Temperature is :"+weather.getTemp()+" C");
    }
}
