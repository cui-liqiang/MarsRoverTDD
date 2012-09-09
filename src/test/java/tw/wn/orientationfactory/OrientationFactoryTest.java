package tw.wn.orientationfactory;

import org.junit.Test;
import tw.wn.orientation.Orientation;

import static org.junit.Assert.*;

public class OrientationFactoryTest {
    @Test
    public void createOrientationByString(){
        assertEquals(OrientationFactory.createOrientationByString("F"), null);
        assertEquals(OrientationFactory.createOrientationByString("N"), Orientation.N);
    }

    @Test
    public void createOrientationByInt(){
        assertEquals(OrientationFactory.createOrientationByInt(-1), null);
        assertEquals(OrientationFactory.createOrientationByInt(1), Orientation.W);
        assertEquals(OrientationFactory.createOrientationByInt(4), null);
    }
}
