package ocp11.ch05;

//Importing new way
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//Importing old way
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeNewWay {

    public static void main(String[] args) {
        //Creating an object with the current date
        LocalDate d = LocalDate.now();
        //Creating an object with the current date and time
        LocalDateTime dt = LocalDateTime.now();
        //Creating an object representing January 1,2019
        LocalDate jan1 = LocalDate.of(2019, Month.JANUARY, 1);
        // Creating January 1, 2015 without the constant
        LocalDate jan2 = LocalDate.of(2019, 1, 1);

        System.out.println(d); //2018-12-20
        System.out.println(dt);//2018-12-20T17:06:52.328492700
        System.out.println(jan1);//2019-01-01

        //Formatting
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        dt.format(f);
    }

    //Adding a day
    public LocalDate addDay(LocalDate date) {
        return date.plusDays(1);
    }

    //Subtracting a day
    public LocalDate subtractDay(LocalDate date) {
        return date.minusDays(1);
    }
}

class DateTimeOldWay {

    public static void main(String[] args) {
        //Creating an object with the current date
        //Creating an object with the current date and time
        Date d = new Date();

        //Creating an object representing January 1,2019
        Calendar c1 = Calendar.getInstance();
        c1.set(2019, Calendar.JANUARY, 1);
        Date jan1 = c1.getTime();
        //or
        Calendar c2 = new GregorianCalendar(2019, Calendar.JANUARY, 1);
        Date jan2 = c2.getTime();

        // Creating January 1, 2015 without the constant
        Calendar c = Calendar.getInstance();
        c.set(2019, 0, 1);
        Date jan = c.getTime();

        System.out.println(d);//Thu Dec 20 17:07:34 EST 2018
        System.out.println(jan1);//Tue Jan 01 17:07:34 EST 2019

        //Formatting
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        sf.format(jan1);
    }

    //Adding a day 
    public Date addDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    //Subtracting a day
    public Date subtractDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }
}
