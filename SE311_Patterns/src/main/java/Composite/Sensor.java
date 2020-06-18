package Composite;

import java.util.ArrayList;

public interface Sensor
{
    public ArrayList<Sensor> Sensors = new ArrayList<>();
    public void ShowSensorInfo();
}