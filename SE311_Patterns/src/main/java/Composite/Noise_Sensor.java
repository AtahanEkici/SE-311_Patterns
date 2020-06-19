package Composite;

public class Noise_Sensor implements Sensor
{
    public final int ID;
    public static int counter = 1;
    public String Sensor_type;
    
    public Noise_Sensor()
    {
        ID = counter;
        counter++;
        this.Sensor_type = "Noise Sensor("+ID+")";
        Sensors.add(this);
    }
    
    @Override
    public void ShowSensorInfo()
    {
        System.out.println(Sensor_type);
    }  
}