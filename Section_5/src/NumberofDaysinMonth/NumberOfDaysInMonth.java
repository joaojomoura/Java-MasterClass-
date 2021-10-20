package NumberofDaysinMonth;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysinMonth(2,2010));
    }
    public static boolean isLeapYear (int year){
        if(year < 1 || year > 9999)
            return false;
       return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static int getDaysinMonth(int month, int year){
        if(year < 1 || year > 9999)
            return -1;
        if (month < 1 || month > 12)
            return -1;
        switch (month){
            case 1,3,5,7,8,10,12 : return 31;
            case 2:
                if(isLeapYear(year))
                    return 29;
                return 28;
            case 4,6,9,11: return 30;
        }
        return 0;
    }

}
