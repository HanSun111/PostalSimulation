import java.util.ArrayList;
public class Address {
    private String strNum;
    private String name;
    private String city;
    private String state;
    private int zip;
    private String apt;

    public Address(String s, String n, String c, String st, int z, String a){
        strNum = s;
        name = n;
        city = c;
        state = st;
        zip = z;
        apt = a;
    }

    public String getApt() {
        return apt;
    }

    public Address(Address a){
        strNum = getStrNum();
        name = getName();
        city = getCity();
        state = getState();
        zip = getZip();
        apt = getApt();
    }

    public Address(String address){
        String a = address;
        int splitNumAndName = address.indexOf(" ");
        int posOfComma = address.indexOf(",");
        strNum = address.substring(0, splitNumAndName);
        a = address.substring(splitNumAndName);


    }

    public String getStrNum() {
        return strNum;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String toString(){
        return strNum + " " + name + " Apt " + apt + ", " + city + ", " + state + ", " + zip;
    }
}
