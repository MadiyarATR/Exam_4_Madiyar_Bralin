import application.entities.SpaceStation;
import application.repositories.JSONRepository;
import application.utils.Printer;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            JSONRepository repos = JSONRepository.getInstance();

            SpaceStation[] stationArray = repos.get(SpaceStation[].class, "resources/stations.json");
            List<SpaceStation> stations = Arrays.asList(stationArray);
            Printer.printStations(stations);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
