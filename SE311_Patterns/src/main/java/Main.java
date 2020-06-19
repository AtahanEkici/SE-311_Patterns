import Adaptor.*;
import Command.*;
import Composite.*;
import Facade.*;
import Factory.*;
import Iterator.*;
import Observer.*;
import Singleton.*;
import Template.*;
import Visitor.*;

public class Main 
{
    public static void main(String args[])
    {
        // Singleton Pattern //
        Singleton_Pattern sp = Singleton_Pattern.getInstance();
        Singleton_Pattern sp2 = Singleton_Pattern.getInstance();
        Singleton_Pattern sp3 = Singleton_Pattern.getInstance();  
        // You only see 1 Singleton system output //
        
        System.out.println("---------------");
        
        // Iterator Pattern //
       Days DaysOfWeek = new Days();
        
       for(Iterator iter = DaysOfWeek.getIterator(); iter.hasNext();)
       {
         String name = (String)iter.next();
         System.out.println("Day : " + name);
       }
       // End Of Iterator Pattern //
       
       System.out.println("---------------");
       
       // Composite Pattern // 
       Sensor Temp_Sen1 = new Temp_Sensor();
       Sensor Cong_Sen1 = new Congestion_Sensor();
       Sensor Pol_Sen1 = new Pollution_Sensor();
       Sensor Noi_Sen1 = new Noise_Sensor();
       
       Composite_Adder Adder = new Composite_Adder();
       
       Adder.addSensor(Temp_Sen1);
       Adder.addSensor(Cong_Sen1);
       Adder.addSensor(Pol_Sen1);
       Adder.addSensor(Noi_Sen1);
       
       Adder.ShowSensorInfo();
       // Composite Pattern Ends //
       
       System.out.println("---------------");
       
       // Factory Patten //
       Cake_Builder Cake_Master = new Cake_Builder();
       
       Chocolate_Cake ck = Cake_Master.createChocolateCake();
       Raspberry_Cake rc = Cake_Master.createRaspberryCake();
       Turkish_Pistachio_Cake tc = Cake_Master.createTurkishPistachio();
       Vanilla_Cake vc = Cake_Master.createVanillaCake();
       
       ck.CakeType();
       rc.CakeType();
       tc.CakeType();
       vc.CakeType();
       // Factory Pattern Ends //
       
       System.out.println("---------------");
       
       // Facade Pattern //
       Sensor_Maker sm = new Sensor_Maker();
       
       sm.createCongSensor();
       sm.createNoiseSensor();
       sm.createPollSensor();
       sm.createTempSensor();
       
       sm.DisplayAllSensors();
       // Facade Pattern Ends //
       
       System.out.println("---------------");
       
       // Command Pattern //
       Bank bank = new Bank("Java Bank");
       
       Withdraw_Bank Withdraw = new Withdraw_Bank(bank);
       Deposit_Bank Deposit = new Deposit_Bank(bank);
       
       In_Out IO = new In_Out();
       
       IO.takeCommand(Withdraw);
       IO.takeCommand(Deposit);
       IO.ExecuteCommands(10);
       // Command Pattern Ends //
       
       System.out.println("---------------");
       
       // Template Pattern //
       InterfacePanel ip1 = new InterfacePanel();
       ip1.showInterface1();
       // Template Pattern Ends //
       
       System.out.println("---------------");
       
       // Adaptor Pattern //
       Sen_Adaptor adapt = new Sen_Adaptor();
       
       //adapt.CheckClass(Temp_Sen1);//
       //adapt.CheckClass(Cong_Sen1);//
       //adapt.CheckClass(Pol_Sen1);//
       //adapt.CheckClass(Noi_Sen1);//
       
         adapt.Check_All_Sensors();
       // Adaptor Pattern Ends //
       
        System.out.println("---------------");
       
       // Visitor Pattern //
       Human human = new Organ();
       human.accept(new DisplayOrgans());
       // Visitor Pattern Ends //
       
        System.out.println("---------------");
        
        // Observer Pattern //
        Weather weather = new  Weather();
        
        new Centigrad(weather);
        new Kelvin(weather);
        new Fahrenheit(weather);
        
        weather.setTemp(50);
        weather.setTemp(80);
        // Observer Pattern Ends // 
    }   
}

