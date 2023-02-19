package repository;

import models.Lecture;
import models.Person;
import models.Superclass;

public class RepositoryPerson implements RepositoryInterface <Person> {
    private static Superclass[] arrayPerson = new Superclass[10];

    private static int SIZE_ARRAY = 5;
    private static int newSize;//переменная для нового массива
    private static Person[] increaseArray;// увеличенный массив
    private static int fullOF=0;// для проверки заполненности всего исходного массива

    //метод возвращает весь массив
    public Superclass[] getALL () {
        return arrayPerson;
    }


    public static void fullArrayLecture(){
        for (int i=0; i<arrayPerson.length; i++) {
            fullOF = 0;
            fullOF = i;
            if (arrayPerson[i] != null) {
                fullOF++;
                if (fullOF == arrayPerson.length) {
                    System.out.println("Количество заполненных элементов " + fullOF);
                    increaseSIZE();
                    break;
                }
            }
        }
    }


    public static void increaseSIZE(){
        newSize = (SIZE_ARRAY * 3) /2 +1;
        increaseArray = new Person[newSize];
        System.arraycopy(arrayPerson, 0, increaseArray, 0, arrayPerson.length);
        arrayPerson = increaseArray;
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

    @Override
    public int size() {
        return newSize;
    }

    @Override
    public boolean isEmpty() {
        boolean emptySize = false;
        if (newSize == 0) {
            emptySize = true;
        }
        return emptySize;
    }

    @Override
    public Person get(int index) {
        for (int i = 0; i < arrayPerson.length; i++) {
            if (i==index){
                break;
            }
            return (Person) arrayPerson [i];
        }
        return null;
    }

    //метод с параметром суперкласса моделей для заполнения массива в репозитории Person
    @Override
    public void add(Superclass fillIN) {
        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson[i] == null) {
                arrayPerson[i] = fillIN;
                break;
            }
        }
    }

    @Override
    public void addIndex(int index,Superclass fillIN) {
        for (int i = 0; i<arrayPerson.length; i++) {
            if (arrayPerson[index] == null) {
                arrayPerson[index] = (Person) fillIN;
                break;
            }
        }
    }

    @Override
    public void remove(int index){
        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson != null) {
                if (index == arrayPerson[i].getID()) {
                    arrayPerson[i] = null;
                }
            }
        }
    }
}
