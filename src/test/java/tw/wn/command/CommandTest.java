package tw.wn.command;

import org.junit.Test;
import tw.wn.commandfactory.CommandFactory;
import tw.wn.orientation.Orientation;
import tw.wn.rover.Rover;
import tw.wn.roverstatus.RoverStatus;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void commandRTest() {
        assertEquals(commandRun(new CommandR(), new RoverStatus(1, 1, Orientation.N)), new RoverStatus(1, 1, Orientation.E));
    }

    @Test
    public void commandLTest() {
        assertEquals(commandRun(new CommandL(), new RoverStatus(1, 1, Orientation.N)), new RoverStatus(1, 1, Orientation.W));
    }

    @Test
    public void commandListTestWithRAndL() {
        assertEquals(commandRun(CommandFactory.createCommandList("RRLRLL"), new RoverStatus(1, 1, Orientation.N)), new RoverStatus(1, 1, Orientation.N));
    }

    @Test
    public void commandTestByRoverRun() {
        Rover rover = new Rover(new RoverStatus(1, 1, Orientation.N));
        rover.run("RLRLL");
        assertEquals(rover, new Rover(new RoverStatus(1, 1, Orientation.W)));
    }

    private RoverStatus commandRun(Command command, RoverStatus roverStatus) {
        roverStatus = command.run(roverStatus);
        return roverStatus;
    }
}
