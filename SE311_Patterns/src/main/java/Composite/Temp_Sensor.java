package Composite;

public class Temp_Sensor implements Sensor
{
    public final int ID;
    public static int counter = 1;
    public String Sensor_type;
    
    public Temp_Sensor()
    {
        ID = counter;
        counter++;
        this.Sensor_type = "Temperature Sensor("+ID+")";
        Sensors.add(this);
    }
    
    @Override
    public void ShowSensorInfo()
    {
         System.out.println(Sensor_type);
    }  
}