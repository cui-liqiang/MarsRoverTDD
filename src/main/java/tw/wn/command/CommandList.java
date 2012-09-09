package tw.wn.command;

import tw.wn.roverstatus.RoverStatus;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements Command {
    List<Command> commandList;

    public CommandList() {
        this.commandList = new ArrayList<Command>();
    }

    public RoverStatus run(RoverStatus roverStatus) {
        for (Command command : commandList) {
            roverStatus = command.run(roverStatus);
        }
        return roverStatus;
    }

    public void add(Command command) {
        commandList.add(command);
    }

    public String toString() {
        String string = "";
        for (Command command : commandList) {
            string += command.toString();
        }
        return string;
    }
}
