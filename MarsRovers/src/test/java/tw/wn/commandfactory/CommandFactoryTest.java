package tw.wn.commandfactory;

import org.junit.Test;
import tw.wn.command.Command;
import static org.junit.Assert.*;

public class CommandFactoryTest {
    @Test
    public void createCommandListWithString(){
        Command commandList = CommandFactory.createCommandList("LMLMLMLMM");
        assertTrue(commandList.getClass().toString().contains("CommandList"));
        assertEquals(commandList.toString(), "LMLMLMLMM");
    }
    @Test
    public void createCommandListWithUnknownCommand(){
        assertEquals(CommandFactory.createCommandList("MLABC"), null);
    }
}
