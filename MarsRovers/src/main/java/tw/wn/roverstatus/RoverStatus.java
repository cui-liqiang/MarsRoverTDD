package tw.wn.roverstatus;

import tw.wn.orientation.Orientation;

public class RoverStatus {
    private int x;
    private int y;
    private Orientation orientation;

    public RoverStatus(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public boolean equals(Object object) {
        RoverStatus roverStatus = (RoverStatus)object;
        return roverStatus.x == this.x && roverStatus.y == this.y && roverStatus.orientation.equals(orientation);
    }

    public String toString(){
        return Integer.toString(x) + " " + Integer.toString(y) + " " + orientation;
    }
}