package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now(Clock.systemDefaultZone());
        LocalDateTime timeClock = LocalDateTime.now(Clock.systemUTC());

        ZoneId rockfieldZone = ZoneId.of("US/Central");

        LocalDateTime timeStockholm = LocalDateTime.now(ZoneId.of("Europe/Stockholm"));
        LocalDateTime timeRockfield = LocalDateTime.now(ZoneId.of("US/Central"));
        ZonedDateTime ZonedTimeStockholm = ZonedDateTime.now(ZoneId.of("CET"));

        System.out.println(timeRockfield.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("CET: " + ZonedTimeStockholm.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        Instant instantNow = Instant.now();
        System.out.println("Instant: " + instantNow);
        OffsetDateTime offsetRockfield = OffsetDateTime.now(ZoneId.of("US/Central"));
        System.out.println("Offset Time Rockfield: " + offsetRockfield);
        System.out.println("Clock: " + timeClock);
        System.out.println("Time Now: " + timeNow);
        System.out.println("System Default Time Zone:" + Clock.systemDefaultZone());
    }
}

//add days. add 24 hrs.
