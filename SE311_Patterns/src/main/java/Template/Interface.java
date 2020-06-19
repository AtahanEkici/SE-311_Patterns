package Template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

abstract class Grades 
{
    public static ArrayList<Integer> Grades_List = new ArrayList<>();
 
    public static ArrayList<String> ProcessGrade(ArrayList<Integer> list)
    {
         ArrayList <String> Stringlist = new ArrayList<>();
        
        for(int i = 0; i<list.size();i++)
        {
              if(list.get(i) < 60)
        {
            Stringlist.add("F");
        }
        
        else if(list.get(i) < 70)
        {
            Stringlist.add("D");
        }
        
        else if(list.get(i) < 80)
        {
            Stringlist.add("C");
        }
        
        else if(list.get(i) < 90)
        {
            Stringlist.add("B");
        }
        
        else if(list.get(i) < 101)
        {
            Stringlist.add("A");
        } 
        }  
        
        return Stringlist;
    }
    
public static int GradeGenerator()
{
  int i;
  
  Random rand = new Random();
  
  i = rand.nextInt(100);
  
  return i;
}

   public static ArrayList SortList(ArrayList<Integer> list)
   {
       Collections.sort(list);
       return list;
   }

public static int calculateMedian(ArrayList<Integer> a)
{
    int Median;
    int value;
    
    if(a.size() % 2 == 0)
    {
        value = (a.size() / 2);
        Median = ((a.get(value) + a.get(value+1)) / 2);
        return Median;
    }
    
    else
    {
        value = (a.size() - 1) / 2;
        value++;
        Median = a.get(value);
        return Median;
    }
}

public static void disregardZero_Hundred(ArrayList<Integer> list)
{
    for(int i = 0; i < list.size(); i++)
    {
        if(list.get(i) == 100)
        {
            list.remove(i);
        }
        
        else if(list.get(i) == 0)
        {
            list.remove(i);
        }
    }
}
}

public interface Interface
{
   public void  Show_Grades(ArrayList a);
   public void PopulateGrades(ArrayList<Integer> a, int counter);
}
