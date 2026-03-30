import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static Map<Integer, Double> frequencyCount(List<Integer> numbers) {
        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Double> result = new HashMap<>();

        for (Integer num : numbers) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (Integer num : counts.keySet()) {
            double frequency = (double) counts.get(num) / numbers.size();
            result.put(num, frequency);
        }

        return result;
    }
}
