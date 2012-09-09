package tw.wn.marsrovers;

import tw.wn.orientation.Orientation;
import tw.wn.rover.Rover;
import tw.wn.roverstatus.RoverStatus;

import java.util.ArrayList;
import java.util.List;

public class MarsRovers {

    private List<Rover> rovers;

    public static String display(Rover rover) {
        return rover.toString() + "\n";
    }

    public String exectue(String input) {
        rovers = new ArrayList<Rover>();
        rovers.add(new Rover(new RoverStatus(1, 2, Orientation.N)));
        rovers.add(new Rover(new RoverStatus(3, 3, Orientation.E)));
        String output = "";
        for (Rover rover : rovers) {
            output = output.toString() + display(rover);
        }
        return output;
    }

    public Rover getRover(int index) {
        return rovers.get(index);
    }
}
