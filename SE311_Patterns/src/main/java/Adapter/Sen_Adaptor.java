package Adapter;

import Composite.*;

public class Sen_Adaptor 
{
    public void CheckClass(Sensor sen)
    {
        if(sen instanceof Temp_Sensor)
        {
            System.out.println(""+sen+"=> This is a Temp Sensor of ID: "+((Temp_Sensor) sen).ID+"");
        }
        
        else if(sen instanceof Congestion_Sensor)
        {
            System.out.println(""+sen+"=> This is a Congestion Sensor of ID: "+((Congestion_Sensor) sen).ID+"");
        }
        
        else if(sen instanceof Noise_Sensor)
        {
            System.out.println(""+sen+"=> This is a Noise Sensor of ID: "+((Noise_Sensor) sen).ID+"");
        }
        
        else if(sen instanceof Pollution_Sensor)
        {
            System.out.println(""+sen+"=> This  is a Pollution Sensor of ID: "+((Pollution_Sensor) sen).ID+"");
        }
    }
    
    public void Check_All_Sensors()
    {
            for(int i = 0; i < Sensor.Sensors.size();i++)
            {
                CheckClass(Sensor.Sensors.get(i));
            }
    }
}
