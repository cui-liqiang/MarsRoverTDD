package tw.wn.roverstatus;

import org.junit.Test;
import tw.wn.orientation.Orientation;
import tw.wn.orientationfactory.OrientationFactory;

import static org.junit.Assert.*;

public class RoverStatusTest {
    @Test
    public void changeOrientation() {
        RoverStatus roverStatus = new RoverStatus(1, 2, Orientation.N);
        roverStatus.setOrientation(OrientationFactory.createOrientationByInt(2));
        assertEquals(roverStatus.getOrientation(), Orientation.S);

        roverStatus.setOrientation(OrientationFactory.createOrientationByString("W"));
        assertEquals(roverStatus.getOrientation(), Orientation.W);
    }
}
