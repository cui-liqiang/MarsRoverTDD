package tw.wn.command;

import tw.wn.roverstatus.RoverStatus;

public interface Command {
    public RoverStatus run(RoverStatus roverStatus);
}
