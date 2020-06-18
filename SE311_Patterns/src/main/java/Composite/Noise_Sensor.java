package Composite;

public class Noise_Sensor implements Sensor
{
    int ID = 1;
    String Sensor_type;
    
    public Noise_Sensor()
    {
        this.Sensor_type = "Noise Sensor("+ID+")";
        Sensors.add(this);
        ID++;
    }
    
    @Override
    public void ShowSensorInfo()
    {
        System.out.println(Sensor_type);
    }  
}