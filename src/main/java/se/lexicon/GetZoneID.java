package se.lexicon;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

public class GetZoneID {
    public static void main(String[] args){
        Set<String> zones = ZoneId.getAvailableZoneIds();
        List<String> zoneList = new ArrayList<String>(zones);
        Collections.sort(zoneList);

        LocalDateTime dt = LocalDateTime.now();
        for (int i=0; i < 603; i++) {
            String s = zoneList.get(i);
            ZoneId zoneid = ZoneId.of(s);
            ZonedDateTime zoneddate = dt.atZone(zoneid);
            ZoneOffset offset= zoneddate.getOffset();
            System.out.println("ZoneId = " + zoneid + " offset = " + offset);
        }
    }
}
