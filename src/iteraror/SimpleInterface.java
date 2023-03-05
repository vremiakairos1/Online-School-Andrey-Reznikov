package iteraror;

import models.Superclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//16
public interface SimpleInterface <E extends Superclass> {
    boolean hasNext();
    E next();
    void remove();
    ArrayList<String> strings = new ArrayList<>();
    Iterator<String> iterator = strings.iterator();
}
