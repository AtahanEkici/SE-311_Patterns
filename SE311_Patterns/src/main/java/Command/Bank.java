
package Command;

public class Bank 
{
    private String name;
    private int Money = 0;
    
    public Bank(String Name)
    {
        this.name = Name;
    }

    public void withdraw(int i)
    {
       Money = Money - i;
       System.out.println("Withdrawed: "+i+" amount to "+this.name+"");
    }
    
    public void deposit(int i)
    {
         Money = Money + i;
         System.out.println("Deposited: "+i+" amount to "+this.name+"");
    }
}
