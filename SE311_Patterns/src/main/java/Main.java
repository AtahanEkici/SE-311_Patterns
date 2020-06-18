import Composite.*;
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
        
        System.out.println();
        
        // Iterator Pattern //
       Days DaysOfWeek = new Days();
        
       for(Iterator iter = DaysOfWeek.getIterator(); iter.hasNext();)
       {
         String name = (String)iter.next();
         System.out.println("Day : " + name);
       }
       // End Of Iterator Pattern //
       
       System.out.println();
       
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
       
       System.out.println();
       
       // Factory Patten //
       
       Cake_Builder Cake_Master = new Cake_Builder();
       
       Chocolate_Cake ck = Cake_Master.createChocolateCake();
       Raspberry_Cake rc = Cake_Master.createRaspberryCake();
       Turkish_Pistachio_Cake vc = Cake_Master.createTurkishPistachio();
       Vanilla_Cake tc = Cake_Master.createVanillaCake();
       
       ck.CakeType();
       rc.CakeType();
       vc.CakeType();
       tc.CakeType();
    }   
}

