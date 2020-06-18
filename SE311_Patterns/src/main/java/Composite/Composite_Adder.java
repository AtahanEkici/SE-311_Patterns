package Composite;
import java.util.ArrayList; 
import java.util.List;

public class Composite_Adder implements Sensor
{
    private List<Sensor> Sensors = new ArrayList<>();

    @Override
    public void ShowSensorInfo() 
    {
        Sensors.forEach(Sen ->
        {
            Sen.ShowSensorInfo();
        });
    }
    
    public void addSensor(Sensor Sen)
    {
        Sensors.add(Sen);
    }
    public void removeSensor(Sensor Sen)
    {
        Sensors.remove(Sen);
    }    
}
