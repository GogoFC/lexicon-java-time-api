package se.lexicon;


import java.util.TimeZone;

public class GetTimeZoneID {
    public static void main(String[] args) {
        String[] timeZones = TimeZone.getAvailableIDs();

        //for (int i=0; i < timeZones.length; i++) {
        //    System.out.println(timeZones[i]);
        //}

        for (String timeZone : timeZones) {
            System.out.println(timeZone);
        }
    }
}
