package tw.wn.command;

import tw.wn.orientationfactory.OrientationFactory;
import tw.wn.roverstatus.RoverStatus;

public class CommandR implements Command {
    public RoverStatus run(RoverStatus roverStatus) {
        int value = (roverStatus.getOrientation().getVaule() + 3) % 4;
        roverStatus.setOrientation(OrientationFactory.createOrientationByInt(value));
        return roverStatus;
    }

    public String toString() {
        return "R";
    }
}
