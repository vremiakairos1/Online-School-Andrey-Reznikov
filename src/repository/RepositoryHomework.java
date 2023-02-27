package repository;

import models.Homework;
import models.Superclass;

public class RepositoryHomework implements RepositoryInterface <Homework>{
    private static Superclass[] arrayHomework = new Superclass[10];

    private static int SIZE_ARRAY = 5;
    private static int newSize;//переменная для нового массива
    private static Homework[] increaseArray;// увеличенный массив
    private static int fullOF=0;// для проверки заполненности всего исходного массива

    //метод возвращает весь массив
    public Superclass[] getALL () {
        return arrayHomework;
    }


    public static void fullArrayLecture(){
        for (int i=0; i<arrayHomework.length; i++) {
            fullOF = 0;
            fullOF = i;
            if (arrayHomework[i] != null) {
                fullOF++;
                if (fullOF == arrayHomework.length) {
                    System.out.println("Количество заполненных элементов " + fullOF);
                    increaseSIZE();
                    break;
                }
            }
        }
    }


    public static void increaseSIZE(){
        newSize = (SIZE_ARRAY * 3) /2 +1;
        increaseArray = new Homework[newSize];
        System.arraycopy(arrayHomework, 0, increaseArray, 0, arrayHomework.length);
        arrayHomework = increaseArray;
    }



    //метод перебирает каждый элемент массива и сравнивает его с ID объекта
    public void getByID (int ID) {
        for (Superclass openLecture : arrayHomework) {
            if (openLecture != null) {
                if (ID==openLecture.getID()) {
                    System.out.println(openLecture);
                }
                //15
                if (ID <= 0 && openLecture.getID() != ID) {
                    throw new EntityNotFoundException("Такого ID не существует");
                }
            }
        }
    }//написать override

    //метод удаляет объект в массиве, но не сдвигает элементы
    public void deleteByID (int ID) {
        for (int i = 0; i < arrayHomework.length; i++) {
            if (arrayHomework[i] != null) {
                if (ID == arrayHomework[i].getID()) {
                    arrayHomework[i] = null;
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
    public Homework get(int index) {
        for (int i = 0; i < arrayHomework.length; i++) {
            if (i==index){
                break;
            }
            return (Homework) arrayHomework [i];
        }
        return null;
    }

    //метод с параметром суперкласса моделей для заполнения массива в репозитории Person
    @Override
    public void add(Superclass fillIN) {
        for (int i = 0; i < arrayHomework.length; i++) {
            if (arrayHomework[i] == null) {
                arrayHomework[i] = fillIN;
                break;
            }
        }
    }

    @Override
    public void addIndex(int index,Superclass fillIN) {
        for (int i = 0; i<arrayHomework.length; i++) {
            if (arrayHomework[index] == null) {
                arrayHomework[index] = (Homework) fillIN;
                break;
            }
        }
    }

    @Override
    public void remove(int index){
        for (int i = 0; i < arrayHomework.length; i++) {
            if (arrayHomework != null) {
                if (index == arrayHomework[i].getID()) {
                    arrayHomework[i] = null;
                }
            }
        }
    }
}
