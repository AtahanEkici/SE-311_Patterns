package Visitor;

public class DisplayOrgans implements HumanVisitor
{
    @Override
    public void visit(Organ organ)
    {
         System.out.println("Displaying Organs");
    }

    @Override
    public void visit(Heart hearth)
    {
        System.out.println("Displaying Heart");
    }

    @Override
    public void visit(Brain brain)
    {
         System.out.println("Displaying Brain");
    }

    @Override
    public void visit(Liver liver)
    {
         System.out.println("Displaying Liver");
    } 
}
