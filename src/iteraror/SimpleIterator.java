package iteraror;

import models.Lecture;
import models.Superclass;
import repository.RepositoryLecture;


//16
public class SimpleIterator implements SimpleInterface {
    Lecture[] arrayLecture = new RepositoryLecture().getArrayLecture();
    private int index;

    public SimpleIterator(Lecture[] arrayLecture) {
        this.arrayLecture = arrayLecture;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        try {
            next();
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    @Override
    public Superclass next() {
        if (index > arrayLecture.length) {
            throw new IndexOutOfBoundsException();
        }
        return arrayLecture[index++];
    }

    @Override
    public void remove() {
    arrayLecture[index] = null;
    index--;
    }
}
