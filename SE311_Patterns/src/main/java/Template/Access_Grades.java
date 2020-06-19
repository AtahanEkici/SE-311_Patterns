package Template;

import java.util.ArrayList;

public class Access_Grades extends Grades implements Interface
{   
    @Override
    public void Show_Grades(ArrayList a) 
    {
        int counter = 1;
        
        for(int i = 0; i<a.size(); i++)
        {
            System.out.print(" "+counter+")"+a.get(i)+"");
            counter++;
        }
        System.out.println("\n");
    }

    @Override
    public void PopulateGrades(ArrayList<Integer> a, int counter) 
    
      {
       a.add(59);
       a.add(61);
       a.add(25);
       a.add(99);
       a.add(100);
       a.add(0);
       a.add(69);
       a.add(82);
    } 
}
