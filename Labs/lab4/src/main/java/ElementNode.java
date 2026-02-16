public class ElementNode implements IListOfBooks {

    private Book first;
    private IListOfBooks rest;

    public ElementNode(Book first, IListOfBooks rest) {
        this.first = first;
        this.rest = rest;
    }

    @Override
    public int count() {
        return 1 + rest.count();
    }

    @Override
    public float totalPrice() {
        return first.getPrice() + rest.totalPrice();
    }

    @Override
    public IListOfBooks allBefore(int year) {
        if (first.getYear() < year) {
            return new ElementNode(first, rest.allBefore(year));
        } else {
            return rest.allBefore(year);
        }
    }

    @Override
    public IListOfBooks addAtEnd(Book book) {
        return new ElementNode(first, rest.addAtEnd(book));
    }

    @Override
    public String toString() {
        return first.toString() + "\n" + rest.toString();
    }
}
