package tw.wn.command;

import tw.wn.orientationfactory.OrientationFactory;
import tw.wn.roverstatus.RoverStatus;

public class CommandL implements Command {
    public RoverStatus run(RoverStatus roverStatus) {
        int value = (roverStatus.getOrientation().getVaule() + 1) % 4;
        roverStatus.setOrientation(OrientationFactory.createOrientationByInt(value));
        return roverStatus;
    }

    public String toString() {
        return "L";
    }

}
