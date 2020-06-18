package Command;

import java.util.ArrayList;
import java.util.List;

public class In_Out 
{
    private final List<Command> Commands = new ArrayList<>();
    
    public void takeCommand(Command com)
    {
        Commands.add(com);
    }
    
    public void ExecuteCommands(int amount)
    {
        Commands.forEach(com -> 
        {
            com.transaction(amount);
        });
        Commands.clear();
    }
}
