import Command.*;
import Composite.*;
import Facade.*;
import Factory.*;
import Iterator.*;
import Singleton.*;

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
       
       System.out.println();
       
       // Command Pattern //
       
       Bank bank = new Bank("Java Bank");
       
       Withdraw_Bank Withdraw = new Withdraw_Bank(bank);
       Deposit_Bank Deposit = new Deposit_Bank(bank);
       
       In_Out IO = new In_Out();
       
       IO.takeCommand(Withdraw);
       IO.takeCommand(Deposit);
       IO.ExecuteCommands(10);
    }   
}

