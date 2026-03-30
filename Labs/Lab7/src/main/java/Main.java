import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ========================
        // Problem 1 test
        // ========================
        List<Integer> nums = Arrays.asList(1,1,1,2,2,3,3,4,4,4);
        Map<Integer, Double> freq = FrequencyCounter.frequencyCount(nums);

        System.out.println("Problem 1:");
        System.out.println(freq);

        // ========================
        // Problem 2 test
        // ========================
        Swimmer s1 = new Swimmer(
                "Alice",
                Arrays.asList(30.1,30.2,30.3,30.4,30.5),
                Arrays.asList(31.0),
                Arrays.asList(32.0),
                Arrays.asList(26.0,27.0)
        );

        Swimmer s2 = new Swimmer(
                "Bob",
                Arrays.asList(29.5,29.6,29.7,29.8,29.9),
                Arrays.asList(30.5),
                Arrays.asList(31.5),
                Arrays.asList(28.0,29.0)
        );

        System.out.println("\nProblem 2:");
        System.out.println(s1.compareTo(s2)); // 应该是负数（Alice更快）

        // ========================
        // Problem 3 test
        // ========================
        Swimmer s3 = new Swimmer(
                "Charlie",
                Arrays.asList(28.1,28.2,28.3,28.4), // 不够5次
                Arrays.asList(30.0),
                Arrays.asList(31.0),
                Arrays.asList(25.9)
        );

        List<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);

        SwimmersIterator iterator = new SwimmersIterator(swimmers);

        System.out.println("\nProblem 3:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
