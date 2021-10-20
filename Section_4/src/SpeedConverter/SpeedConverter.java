package SpeedConverter;

public class SpeedConverter {

    public static void main (String [] args){
        printConversion(1.5);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour >= 0)
            return Math.round(kilometersPerHour/1.609);
        return -1;
    }

   public static void printConversion (double kilometersPerHour){
        if (toMilesPerHour(kilometersPerHour) < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
   }

}
