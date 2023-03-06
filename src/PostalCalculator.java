import java.text.DecimalFormat;

public class PostalCalculator {
    private static final double baseCost = 3.75;
    private static final double tenthOfAPoundCost = 0.05;
    private static final double tooFat = 40;
    private static final double tooBig = 36;

    public static double CalculatePostage (String from, String to, double weight, double addedDimensions){
        double total = baseCost + weight * 10 * tenthOfAPoundCost;
        int fromCountyCode = Integer.parseInt(from.substring(0, 3));
        int toCountyCode = Integer.parseInt(to.substring(0, 3));
        double fromToPrices = (double) (Math.abs(fromCountyCode - toCountyCode)) / 100;
        total += fromToPrices;
        if(weight > tooBig){
            total += (weight - tooBig) * 10 * tenthOfAPoundCost;
        }
        if(addedDimensions > tooBig){
            total += (addedDimensions - tooFat) * 0.1;
        }
        return (double) Math.round(total * 100) / 100;
    }

    public static double CalculatePostage (Address from, Address to, double weight, double totalDimensions){
        String fromZip = from.getZip();
        String toZip = to.getZip();
        return CalculatePostage(fromZip, toZip, weight, totalDimensions);
    }
    
    public static double CalculatePostage (Package p){
        String fromZip = p.getFrom().getZip();
        String toZip = p.getTo().getZip();
        return CalculatePostage(fromZip, toZip, p.getLbs(), p.getH() + p.getL() + p.getW());
    }
}
