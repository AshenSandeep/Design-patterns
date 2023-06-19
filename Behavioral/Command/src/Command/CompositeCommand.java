package Command;

import java.util.ArrayList;
import java.util.List;

import Command.fx.Command;

public class CompositeCommand implements Command{
    List<Command> commands = new ArrayList<>();

        public void add(Command command){
            commands.add(command);
        }
    @Override
    public void excute() {
        for(Command command:commands){
            command.excute();
        }
    }
    
}
