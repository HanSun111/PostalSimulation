import java.util.Arrays;
public class Package {
private Address from;
private Address to;
private double l;
private double h;
private double w;
private double lbs;


public Package(Address from, Address to, double length, double height, double width, double weight){
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

    public double getL() {
        return l;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double getLbs() {
        return lbs;
    }
}
