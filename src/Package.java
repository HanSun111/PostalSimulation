import java.util.Arrays;
public class Package {
private Address from;
private Address to;
private int l;
private int h;
private int w;
private double lbs;


public Package(Address from, Address to, int length, int height, int width, double weight){
    this.from = from;
    this.to = to;
    l = length;
    h = height;
    w = width;
    lbs = weight;
}

    public Address getFrom() {
        return from;
    }

    public Address getTo() {
        return to;
    }

    public int getL() {
        return l;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public double getLbs() {
        return lbs;
    }
}
