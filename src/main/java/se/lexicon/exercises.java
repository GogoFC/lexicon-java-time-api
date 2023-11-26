package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class exercises {
    public static void main(String[] args){

        System.out.println("All 'Java Time API' Exercises" + "\n");

        System.out.println("Exercise 1:");
        LocalDateTime todaysDate = LocalDateTime.now();
        System.out.println("Today's Date is: " + todaysDate + "\n");

        System.out.println("Exercise 2:");
        System.out.println(todaysDate.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");

        System.out.println("Exercise 3:");
        LocalDateTime lastMonday = todaysDate.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        for (int i = 0; i < 7; i++){
            System.out.print(lastMonday.getDayOfWeek().plus(i) + " ");
            System.out.print(lastMonday.plusDays(i).format(DateTimeFormatter.ISO_DATE) + "\n");
            // https://www.baeldung.com/java-temporal-adjuster
        }

        System.out.println(" ");
        System.out.println("Exercise 4:");
        LocalDate myBDay = LocalDate.parse("1982-04-12");
        System.out.println("My B Day is: " + myBDay.format(DateTimeFormatter.ISO_DATE) + "\n");

        System.out.println("Exercise 5:");
        LocalDateTime date1945 = LocalDateTime.of(1945,5,8,0,0);
        System.out.println("It was " + date1945.getDayOfWeek() + " on " + date1945.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "\n");

        System.out.println("Exercise 6:");
        LocalDateTime tenYearsFromNow = LocalDateTime.now().plusYears(10).minusMonths(10);
        System.out.println("9 Yeas and two Months from now is " + tenYearsFromNow.format(DateTimeFormatter.ISO_DATE) + "\n");

        System.out.println("Exercise 7:");
        Period periodBetween = Period.between(myBDay, LocalDate.from(tenYearsFromNow));
        System.out.println("Period: " + periodBetween.getYears() + " Years " + periodBetween.getMonths() + " Months " + periodBetween.getDays() + " Days." + "\n");
        // https://www.baeldung.com/java-period-duration

        System.out.println("Exercise 8:");
        Period fourYearPeriod = Period.of(4,7,29);
        System.out.println("Four plus years from now: " + LocalDate.now().plus(fourYearPeriod) + "\n");

        System.out.println("Exercise 9:");
        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println("Timestamp: " + timestamp + "\n");

        System.out.println("Exercise 10:");
        System.out.println("Nanoseconds: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ns")) + "\n");

        System.out.println("Exercise 11:");
        LocalTime parsedTime = LocalTime.parse("12:23");
        System.out.println("Parsed time: " + parsedTime + "\n");

        System.out.println("Exercise 12:");
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)) + "\n");

        System.out.println("Exercise 13:");
        LocalDateTime someDate = LocalDateTime.of(2018,4,5,10,00);
        System.out.println("Some Date: " + someDate + "\n");

        System.out.println("Exercise 14:");
        System.out.println("Formatted 11: " + someDate.format(DateTimeFormatter.ofPattern("eeee dd MM hh:mm")));

        System.out.println("Exercise 15:");
        LocalDateTime combinedDateAndTime = LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println("Combined: " + combinedDateAndTime + "\n");


        System.out.println("Exercise 16:");
        LocalDateTime toSeparate = LocalDateTime.now();
        LocalDate separatedDate = toSeparate.toLocalDate();
        LocalTime separatedTime = toSeparate.toLocalTime();
        System.out.println("Converted LocalDateTime: " + separatedDate + " " + separatedTime);
    }
}
