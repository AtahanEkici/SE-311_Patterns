package Facade;

import Composite.*;

public class Sensor_Maker 
{
    private Sensor TempSensor;
    private Sensor PollutionSensor;
    private Sensor CongestionSensor;
    private Sensor NoiseSensor;
    
    public void createTempSensor()
    {
        TempSensor = new Temp_Sensor();
    }
    
    public void createCongSensor()
    {
        CongestionSensor = new Congestion_Sensor(); 
    }
    
    public void createPollSensor()
    {
        PollutionSensor = new Pollution_Sensor();
    }
    
    public void createNoiseSensor()
    {
        NoiseSensor = new Noise_Sensor();
    }
    
    public void DisplayAllSensors()
    {
        for(int i = 0; i<Sensor.Sensors.size();i++)
        {
            System.out.println(Sensor.Sensors.get(i));
        }
    }
}
