package Template;

import java.util.ArrayList;

public class InterfacePanel 
{
     public Interface interface1;
      
        public InterfacePanel()
        {
            interface1 = new Access_Grades();
        }
        public void showInterface1()
        {
            interface1.PopulateGrades(Grades.Grades_List,10);
            Access_Grades.SortList(Grades.Grades_List);
            interface1.Show_Grades(Grades.Grades_List);
            
            ArrayList<String> Grades_Char;
            Grades_Char = new ArrayList<>();
            
            Grades_Char.addAll(Access_Grades.ProcessGrade(Grades.Grades_List));
            interface1.Show_Grades(Grades_Char);
            
            System.out.println("\n --------------------------------\n");
            
            Access_Grades.disregardZero_Hundred(Grades.Grades_List);
            
            Grades_Char.removeAll(Grades_Char);
            Grades_Char.addAll(Access_Grades.ProcessGrade(Grades.Grades_List));
            
            interface1.Show_Grades(Grades.Grades_List);
            interface1.Show_Grades(Grades_Char);  
        }
}
