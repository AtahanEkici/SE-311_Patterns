package Command;

public class Deposit_Bank implements Command
{
    private Bank depo;
            
    public Deposit_Bank(Bank depo)
    {
        this.depo = depo;
    }
    
    @Override
    public void transaction(int amount)
    {
        depo.deposit(amount);
    }
}
