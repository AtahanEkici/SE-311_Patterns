package Command;

public class Withdraw_Bank implements Command
{
    private Bank depo;
    
    public Withdraw_Bank(Bank depo)
    {
        this.depo = depo;
    }
    
    @Override
    public void transaction(int amount) 
    {
        depo.withdraw(amount);
    }    
}
