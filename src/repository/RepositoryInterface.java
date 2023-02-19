package repository;

import models.Superclass;

public interface RepositoryInterface <E extends Superclass> {
    int size();
    boolean isEmpty();
    E get(int index);
    void add(Superclass fillIN);
    void addIndex(int index,Superclass fillIN);
    void remove(int index);
}
