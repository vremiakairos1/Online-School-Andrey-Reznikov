package repository;

import models.Superclass;

public class RepositoryPerson extends SuperRepository {
    private static Superclass[] arrayPerson = new Superclass[10];

    //метод возвращает весь массив
    public Superclass[] getALL () {
        return arrayPerson;
    }

    //метод с параметром суперкласса моделей для заполнения массива в репозитории Person
    public void add (Superclass fillIN) {
        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson[i] == null) {
                arrayPerson[i] = fillIN;
                break;
            }
        }
    }

    //метод перебирает каждый элемент массива и сравнивает его с ID объекта
    public void getByID (int ID) {
        for (Superclass openLecture : arrayPerson) {
            if (openLecture != null) {
                if (ID==openLecture.getID()) {
                    System.out.println(openLecture);
                }
            }
        }
    }//написать override

    //метод удаляет объект в массиве, но не сдвигает элементы
    public void deleteByID (int ID) {
        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson[i] != null) {
                if (ID == arrayPerson[i].getID()) {
                    arrayPerson[i] = null;
                }
            }
        }
    }
}
