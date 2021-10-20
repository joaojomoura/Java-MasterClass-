package BarkingDog;

import java.nio.ShortBuffer;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));

    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        if(barking && (hourOfDay < 8 || hourOfDay > 22))
            return true;
        return false;
    }
}
