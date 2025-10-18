package application.utils;

import application.entities.SpaceStation;
import java.util.List;

public class Printer {
    public static void printStations(List<SpaceStation> stations){
        String line = "+----+--------------------+---------+----------+-------+--------+---------------+-----+";
        System.out.println(line);
        System.out.printf("| %-2s | %-18s | %-7s | %-8s | %-5s | %-6s | %-13s | %-1s | %n", "ID", "Name", "Country", "Attitude", "Power", "Status", "Communication", "Age");
        System.out.println(line);

        for(SpaceStation s : stations){
            System.out.printf("| %-2d | %-18s | %-7s | %-8s | %-5s | %-6s | %-13s | %-3d | %n",
                    s.getId(), s.getName(), s.getCountry(), s.getAttitude() + "km", s.getPower() + "%", s.getStatus() + "%", s.getCommunication() + "%", s.getAge());
        }
        System.out.println(line);
    }
}
