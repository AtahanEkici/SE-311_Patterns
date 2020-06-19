package Visitor;

public class Heart implements Human
{
    @Override
    public void accept(HumanVisitor humanvisitor)
    {
        humanvisitor.visit(this);
    }
    
}
