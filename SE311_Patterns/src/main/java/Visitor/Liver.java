package Visitor;

public class Liver implements Human
{
    @Override
    public void accept(HumanVisitor humanvisitor)
    {
        humanvisitor.visit(this);
    }
    
}
