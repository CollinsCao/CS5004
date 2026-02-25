package problem2;

public interface ListOfStrings {

    boolean isEmpty();

    int size();

    boolean contains(String s);

    boolean containsAll(ListOfStrings other);

    ListOfStrings filterLargerThan(int maxLength);

    boolean hasDuplicates();

    ListOfStrings removeDuplicates();
}