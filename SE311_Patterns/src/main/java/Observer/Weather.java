package Observer;

import java.util.ArrayList;
import java.util.List;

public class Weather 
{
    private List<Observer> Forecast = new ArrayList<>();
    private int Temperature;
    
    public int getTemp()
    {
        return Temperature;
    }
    
    public void setTemp(int Temp)
    {
        this.Temperature = Temp;
        notifyAllObservers();
    }
    
    public void attach(Observer observer)
    {
        Forecast.add(observer);
    }
    
    public void notifyAllObservers()
    {
        for(Observer observer : Forecast )
        {
            observer.update();
        }
    }
}
