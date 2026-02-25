package problem2;

public class ElementNode implements ListOfStrings {

    private String value;
    private ListOfStrings rest;

    public ElementNode(String value, ListOfStrings rest) {
        this.value = value;
        this.rest = rest;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 1 + rest.size();
    }

    @Override
    public boolean contains(String s) {
        if (value.equals(s)) {
            return true;
        }
        return rest.contains(s);
    }

    @Override
    public boolean containsAll(ListOfStrings other) {
        if (other.isEmpty()) {
            return true;
        }


        ElementNode otherNode = (ElementNode) other;
        return this.contains(otherNode.value)
                && this.containsAll(otherNode.rest);
    }

    @Override
    public ListOfStrings filterLargerThan(int maxLength) {

        if (value.length() > maxLength) {
            return rest.filterLargerThan(maxLength);
        }

        return new ElementNode(
                value,
                rest.filterLargerThan(maxLength)
        );
    }

    @Override
    public boolean hasDuplicates() {

        if (rest.contains(value)) {
            return true;
        }

        return rest.hasDuplicates();
    }

    @Override
    public ListOfStrings removeDuplicates() {

        if (rest.contains(value)) {
            return rest.removeDuplicates();
        }

        return new ElementNode(
                value,
                rest.removeDuplicates()
        );
    }
}