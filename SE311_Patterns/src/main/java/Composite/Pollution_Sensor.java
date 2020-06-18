package Composite;

public class Pollution_Sensor implements Sensor
{
    int ID = 1;
    String Sensor_type;
    
    public Pollution_Sensor()
    {
        this.Sensor_type = "Pollution Sensor("+ID+")";
        Sensors.add(this);
        ID++;
    }
    
    @Override
    public void ShowSensorInfo()
    {
        System.out.println(Sensor_type);
    }  
}