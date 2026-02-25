package problem2;

public class ListTestMain {

    public static void main(String[] args) {

        ListOfStrings list =
                new ElementNode("A",
                        new ElementNode("B",
                                new ElementNode("A",
                                        new EmptyNode())));

        System.out.println("Size: " + list.size());
        System.out.println("Contains A: " + list.contains("A"));
        System.out.println("Has duplicates: " + list.hasDuplicates());

        ListOfStrings noDup = list.removeDuplicates();
        System.out.println("Size after remove duplicates: " + noDup.size());

        ListOfStrings filtered = list.filterLargerThan(1);
        System.out.println("Filtered size: " + filtered.size());
    }
}