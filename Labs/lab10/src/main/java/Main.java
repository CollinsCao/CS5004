import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Problem 1
        TrendingTopics trendingTopics = new TrendingTopics();
        List<String> topics = Arrays.asList(
                "Seattle", "wildfires", "DEFCON26", "NEU", "NEU",
                "Seattle", "Seattle", "NEU", "DEFCON26", "wildfires"
        );

        Map<String, Long> result = trendingTopics.countTopics(topics);
        System.out.println("Trending topics count:");
        System.out.println(result);

        // Problem 2
        Vehicle v1 = new Vehicle("Toyota", "Camry", 1995, Color.BLUE);
        Vehicle v2 = new Vehicle("Honda", "Civic", 2005, Color.BLACK);
        Vehicle v3 = new Vehicle("Ford", "Focus", 1998, Color.RED);

        OlderVehiclesFilter filter = new OlderVehiclesFilter(v1, v2, v3);

        System.out.println("\nVehicles before 1999:");
        System.out.println(filter.filterOlderVehilces());
    }
}