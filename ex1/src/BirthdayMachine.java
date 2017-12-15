import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthdayMachine {
    private static String dayEdit(int weekday)
    {
        String wkday;

        if (weekday == 1) {
            wkday = "Sunday";
            return wkday;
        }

        if (weekday == 2) {
            wkday = "Monday";
            return wkday;
        }

        if (weekday == 3) {
            wkday = "Tuesday";
            return wkday;
        }

        if (weekday == 4) {
            wkday = "Wednesday";
            return wkday;
        }

        if (weekday == 5) {
            wkday = "Thursday";
            return wkday;
        }

        if (weekday == 6) {
            wkday = "Friday";
            return wkday;
        }

        if (weekday == 7) {
            wkday = "Saturday";
            return wkday;
        }
        else
            return "s";
    }



    public static void main (String [] args) {
        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.set(2017,Calendar.APRIL,26);
        int dayVal = cal2.get(Calendar.DAY_OF_WEEK);
        cal2.add(Calendar.YEAR, 1);
        String wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in one year is %s",wkday));
        cal2.add(Calendar.YEAR, 1);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in two years is %s",wkday));
        cal2.add(Calendar.YEAR, 1);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in three years is %s",wkday));
        cal2.add(Calendar.YEAR, 1);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in four years is %s",wkday));
        cal2.add(Calendar.YEAR, 1);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in five years is %s",wkday));
        cal2.add(Calendar.YEAR, 1);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in six years is %s",wkday));
        cal2.add(Calendar.YEAR, 1);
        wkday = dayEdit(dayVal);
        System.out.println(String.format("The day of my birthday in seven years is %s",wkday));
    }
}