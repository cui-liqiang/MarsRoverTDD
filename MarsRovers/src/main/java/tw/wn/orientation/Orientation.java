package tw.wn.orientation;

public enum Orientation {
    N(0), W(1), S(2), E(3);
    private int vaule;

    Orientation(int vaule) {
        this.vaule = vaule;
    }

    public int getVaule() {
        return vaule;
    }
}
