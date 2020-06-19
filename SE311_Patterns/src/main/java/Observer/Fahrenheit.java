package Observer;

public class Fahrenheit extends Observer
{
    public Fahrenheit(Weather weather)
    {
        this.weather = weather;
        this.weather.attach(this);
    }

    @Override
    public void update() 
    {
        double temp = weather.getTemp();
        temp = ((temp * 1.8)+32);
        System.out.println("The Temperature is :"+temp+" F");
    }
}
