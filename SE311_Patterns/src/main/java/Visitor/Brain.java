package Visitor;

public class Brain implements Human
{
    @Override
    public void accept(HumanVisitor humanvisitor) 
    {
        humanvisitor.visit(this);
    }
    
}
