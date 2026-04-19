import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A class used to analyze trending topics.
 */
public class TrendingTopics {

    /**
     * Counts the occurrences of each topic in the provided list.
     *
     * @param topics the input list of topics
     * @return a map where each topic is associated with its occurrence count
     */
    public Map<String, Long> countTopics(List<String> topics) {
        return topics.stream()
                .collect(Collectors.groupingBy(topic -> topic, Collectors.counting()));
    }
}