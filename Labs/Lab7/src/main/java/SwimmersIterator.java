import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SwimmersIterator implements Iterator<Swimmer> {

    private List<Swimmer> swimmers;
    private int currentIndex;

    public SwimmersIterator(List<Swimmer> swimmers) {
        this.swimmers = swimmers;
        this.currentIndex = 0;
    }

    private boolean isQualified(Swimmer swimmer) {

        if (swimmer.getButterfly50mTimes().size() < 5) {
            return false;
        }

        for (Double time : swimmer.getFreestyle50mTimes()) {
            if (time <= 26.17) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean hasNext() {
        for (int i = currentIndex; i < swimmers.size(); i++) {
            if (isQualified(swimmers.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Swimmer next() {
        while (currentIndex < swimmers.size()) {
            Swimmer current = swimmers.get(currentIndex);
            currentIndex++;

            if (isQualified(current)) {
                return current;
            }
        }

        throw new NoSuchElementException();
    }
}
