package tw.wn.rover;


import tw.wn.command.Command;
import tw.wn.commandfactory.CommandFactory;
import tw.wn.roverstatus.RoverStatus;

public class Rover {
    private RoverStatus roverStatus;

    public Rover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getStatus() {
        return roverStatus;
    }


    public void run(String commandString) {
        Command commandList = CommandFactory.createCommandList(commandString);
        roverStatus = commandList.run(roverStatus);
    }

    public boolean equals(Object object){
        Rover rover = (Rover) object;
        return rover.roverStatus.equals(this.roverStatus);
    }

    public String toString(){
        return roverStatus.toString();
    }
}
