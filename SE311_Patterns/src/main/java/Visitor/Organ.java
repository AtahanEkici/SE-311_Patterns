package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Organ implements Human
{   
    List<Human> Parts = new ArrayList<>();
    
    public Organ()
    { 
        Parts.add(new Heart());
        Parts.add(new Liver());
        Parts.add(new Brain());
    }
    
    @Override
    public void accept(HumanVisitor humanvisitor) 
    {
        for(int i = 0; i < Parts.size(); i++)
        {
            Parts.get(i).accept(humanvisitor);
        }
        humanvisitor.visit(this);
    }
}
