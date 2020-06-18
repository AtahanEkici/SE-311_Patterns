package Composite;

public class Congestion_Sensor implements Sensor
{
    int ID = 1;
    String Sensor_type;
    
    public Congestion_Sensor()
    {
        this.Sensor_type = "Congestion Sensor("+ID+")";
        Sensors.add(this);
        ID++;
    }
    
    @Override
    public void ShowSensorInfo()
    {
        System.out.println(Sensor_type);
    }  
}