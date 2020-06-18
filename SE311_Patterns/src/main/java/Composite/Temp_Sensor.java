package Composite;

public class Temp_Sensor implements Sensor
{
    int ID = 1;
    String Sensor_type;
    
    public Temp_Sensor()
    {
        this.Sensor_type = "Temperature Sensor("+ID+")";
        Sensors.add(this);
        ID++;
    }
    
    @Override
    public void ShowSensorInfo()
    {
        System.out.println(Sensor_type);
    }  
}