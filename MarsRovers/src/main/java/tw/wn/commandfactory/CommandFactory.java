package tw.wn.commandfactory;


import tw.wn.command.*;

public class CommandFactory {
    public static Command createCommandList(String commandString) {
        CommandList commandList = new CommandList();
        for (char word : commandString.toCharArray()) {
            switch (word) {
                case 'L':
                    commandList.add(new CommandL());
                    break;
                case 'R':
                    commandList.add(new CommandR());
                    break;
                case 'M':
                    commandList.add(new CommandM());
                    break;
                default:
                    return null;
            }
        }
        return commandList;
    }
}
