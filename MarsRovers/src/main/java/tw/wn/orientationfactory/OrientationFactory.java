package tw.wn.orientationfactory;

import tw.wn.orientation.Orientation;

public class OrientationFactory {
    public static Orientation createOrientationByString(String value) {
        switch (value.charAt(0)) {
            case 'N':
                return Orientation.N;
            case 'W':
                return Orientation.W;
            case 'S':
                return Orientation.S;
            case 'E':
                return Orientation.E;
        }
        return null;
    }

    public static Orientation createOrientationByInt(int value) {
            switch (value) {
                case 0:
                    return Orientation.N;
                case 1:
                    return Orientation.W;
                case 2:
                    return Orientation.S;
                case 3:
                    return Orientation.E;
            }
            return null;
    }
}
