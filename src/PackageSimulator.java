import java.util.ArrayList;

public class PackageSimulator {
private final ArrayList<Package> generatedPs = new ArrayList<Package>();
private final ArrayList<Double> costs = new ArrayList<Double>();
    public Address generateAddress(){
        String zipThatISAString = "";
        int zip = (int) (Math.random() * 99442 + 501);
        zipThatISAString = Integer.toString(zip);
        Address a = new Address("000 ", "Dontexist Blvd ", "Whoville, ", "NY, ", zipThatISAString, ", Apt 999B");
        return a;
    }
    public void generateTotal(){
        for(int i = 0; i < generatedPs.size(); i++){

        }
    }
public void generatePackages (int num){
for(int i = 0; i < num; i++){
    double lb = Math.random() * 149 + 1;
    double w = Math.random() * 18 + 2;
    double l = Math.random() * 18 + 2;
    double h = Math.random() * 18 + 2;
    Package p = new Package(generateAddress(), generateAddress(), l, h, w, lb);
    generatedPs.add(p);
}
}
}
