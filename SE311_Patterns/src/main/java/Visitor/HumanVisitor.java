package Visitor;

public interface HumanVisitor 
{
    public void visit(Heart hearth);
    public void visit(Brain brain);
    public void visit(Liver liver);
    public void visit(Organ organ);
}
