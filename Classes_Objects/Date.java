/*
 * Import the java.time package to work with date and time API
 * contains many classes e.g.
 * LocalDate - rep a date(yyyy-MM-dd)
 * Has methods; plusDays(), minusDays(), getDayOfWeek()
 * LocalTime - rep a time(HH-mm-ss-ns)
 * Has methods; plusHours(), minusMinutes()
 * LocalDateTime - rep both a date and a time(yyyy-MM-dd-HH-mm-ss-ns)
 * DateTimeFormatter - used for converting a date/time into a aspecific string format (for display ) or
 * parsing a string back into date/time object

 
 //Displaying Current date -  import java.time.LocalDate class and use its now() method
 import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        //Create a date object
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
    }
}



//Displaying The Current Time - import the java.time.LocalTime class and use its now() method
import java.time.LocalTime;

public class Date{
    public static void main(String[] args) {
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
    }
}
 


//Display Current Date and Time
import java.time.LocalDateTime;

public class Date{
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);
    }
}
 

//Formatting Date and Time
//-use the DateTimeFormatter class with the ofPattern() method tp format or parse objects

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before formatting: "+ myDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
 */

/*
 * The ofPattern method accepts all sorts of values and can be displayed using differrent formats e.g.
 * yyyy-MM-dd  "2024-08-15"
 * dd/MM/yyyy  "15/08/2024"
 * dd-MMM-yyyy "15-Oct-2024"
 * E,  java.timeMMM dd yyyy  "Tue Oct 15 2024"
 */

/*
//other examples
//Parsing a Date string into a local date object
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dateString = "15/10/2024";
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormat);

        System.out.println("Parsed date: " + parsedDate);
    }
}

 */

//Adding/Subtracting Days and Formatting
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        //Current date
        LocalDate today = LocalDate.now();

        //add 5 days
        LocalDate futureDate = today.plusDays(5);

        //subtract 5 days
        LocalDate pastDate = today.minusDays(3);

        //format the future date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        //why are we not using the new keyword to create the formatter object
        String formattedFutureDate = futureDate.format(formatter);

        System.out.println("Current Date: " + today);
        System.out.println("Future Date (+5 days): " + formattedFutureDate);
        System.out.println("Past Date (-3 days): " + pastDate);

    }
}


/*
 * Commonly Used Methods in LocalDateTime, LocalDate, and LocalTime
Here are some relevant methods for working with dates and times in Java:

1. LocalDateTime (for both date and time):
now(): Gets the current date and time.
of(int year, int month, int day, int hour, int minute): Creates a LocalDateTime for a specific date and time.
plusDays(long days): Adds days to the current date.
plusHours(long hours): Adds hours to the time.
withHour(int hour): Sets the hour.
withMinute(int minute): Sets the minute.
format(DateTimeFormatter formatter): Formats the date and time using a specified DateTimeFormatter.

2. LocalDate (for just dates):
now(): Gets today's date.
of(int year, int month, int day): Creates a LocalDate for a specific year, month, and day.
plusDays(long days): Adds days to a date.
plusMonths(long months): Adds months to a date.
getDayOfWeek(): Gets the day of the week (e.g., Monday, Tuesday).

3. LocalTime (for just times):
now(): Gets the current time.
of(int hour, int minute): Creates a LocalTime for a specific hour and minute.
plusHours(long hours): Adds hours to the time.
withHour(int hour): Sets the hour.
withMinute(int minute): Sets the minute.

4. DateTimeFormatter (for formatting):
ofPattern(String pattern): Creates a formatter for a specific pattern (like "MMMM d, yyyy, h:mm a").
format(TemporalAccessor dateTime): Formats the LocalDateTime, LocalDate, or LocalTime into a readable string.
 */