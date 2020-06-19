package Observer;

public class Kelvin extends Observer
{
    public Kelvin(Weather weather)
    {
        this.weather = weather;
        this.weather.attach(this);
    }

    @Override
    public void update() 
    {
        int temp = weather.getTemp();
        temp = temp + 250;
        System.out.println("The Temperature is :"+temp+" K");
    }
}
