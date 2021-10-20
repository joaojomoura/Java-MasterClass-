package DecimalComparator;

public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(1.2234,1.2245));
    }

    public static boolean areEqualByThreeDecimalPlaces (double n, double m) {
        return (int)(n * 1000) == (int)(m * 1000);
    }
}
