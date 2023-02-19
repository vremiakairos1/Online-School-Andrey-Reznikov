package repository;

import com.sun.tools.javac.Main;
import models.Course;
import models.Lecture;
import models.Superclass;
import service.ServiceLecture;

public class RepositoryLecture implements RepositoryInterface <Lecture> {


    private static int SIZE_ARRAY = 5;

    private static Lecture[] arrayLecture;//исходный массив
    private static int newSize;//переменная для нового массива
    private static Lecture[] increaseArray;// увеличенный массив
    private static int fullOF=0;// для проверки заполненности всего исходного массива

    public RepositoryLecture() {

        this.arrayLecture = new Lecture[SIZE_ARRAY];//передали переменную 5
        this.increaseArray = new Lecture[newSize];// передали переменную для нового массива

    }

    public static void fullArrayLecture(){
        for (int i=0; i<arrayLecture.length; i++) {
            fullOF = 0;
            fullOF = i;
            if (arrayLecture[i] != null) {
                fullOF++;
                if (fullOF == arrayLecture.length) {
                    System.out.println("Количество заполненных элементов " + fullOF);
                    increaseSIZE();
                    break;
                }
            }
        }
    }


    public static void increaseSIZE(){
        newSize = (SIZE_ARRAY * 3) /2 +1;
        increaseArray = new Lecture[newSize];
        System.arraycopy(arrayLecture, 0, increaseArray, 0, arrayLecture.length);
        arrayLecture = increaseArray;
    }

    public static void createCourseLectures(){
        Course secondCourse = new Course(2,"Java Beginner");
        //RepositoryLecture.newAddLecture(new Lecture(6, "Lecture 6", "sdfg", 2,1));//11-12
        //RepositoryLecture.newAddLecture(new Lecture(7, "Lecture 7", "sdfg", 2,1));//11-12
        //RepositoryLecture.newAddLecture(new Lecture(8, "Lecture 8", "sdfg", 2,1));//11-12
    }

    // заполнение массива тремя новыми элементами начиная с индекса 5. Если элемент не равен пустоте - заполни
    public static void newAddLecture(Lecture newFillIN) {

        for (int i = 0; i<arrayLecture.length; i++) {
            if (arrayLecture[i] != null) {
                continue;
            }
            arrayLecture[i] = newFillIN;
            break;
        }
    }
    // 10 74-103
    public static int getSizeArray() {
        return SIZE_ARRAY;
    }
    public static void setSizeArray(int sizeArray) {
        SIZE_ARRAY = sizeArray;
    }

    public static Lecture[] getArrayLecture() {
        return arrayLecture;
    }


    public static int getNewSize() {
        return newSize;
    }
    public static void setNewSize(int newSize) {
        RepositoryLecture.newSize = newSize;
    }

    public static Lecture[] getIncreaseArray() {
        return increaseArray;
    }

    public static int getFullOF() {
        return fullOF;
    }
    public static void setFullOF(int fullOF) {
        RepositoryLecture.fullOF = fullOF;
    }

    //9 метод отображает диалог для необходимости вывода всех элементов массива
    public static void dialogArray2() {
        System.out.println("Вывести элементы 2-ого массива?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
    }

    //9 метод выводит все элементы увеличенного массива
    public static int elementsArray2;
    public static void showArray2() {
        switch (elementsArray2) {
            case 0:
            break;

            case 1:
                ServiceLecture.showElements(); //вызов элементов массива через цикл for each 11
                //System.out.println(Arrays.toString(increaseArray)); //вызов елементов массива через системные методы
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + elementsArray2);
        }
    }//9
        public Lecture[] getALL() {
        return arrayLecture;
    }

    //метод сравнивает ID для открытия объекта. Перегружает метод из супер-репозитория.

    public void getByID(int ID) {
        for (Superclass openLecture : arrayLecture) {
            if (openLecture != null) {
                if (ID==openLecture.getID()) {
                    System.out.println(openLecture);
                }
            }
        }
    }

    //метод удаляет объект с таким ID, но не сдвигает элементы. Перегружает метод из супер-репозитория.

    public void deleteByID(int ID) {
        for (int i = 0; i < arrayLecture.length; i++) {
            if (arrayLecture[i] != null) {
                if (ID == arrayLecture[i].getID()) {
                    arrayLecture[i] = null;
                }
            }
        }
    }

    @Override
    public int size()
    {
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
    public Lecture get(int index) {
        for (int i = 0; i < arrayLecture.length; i++) {
            if (i==index){
                break;
            }
            return (Lecture) arrayLecture [i];
        }
        return null;
    }
    //метод имеет параметр суперкласса моделей. Перегружает метод из супер-репозитория. Заполняет массив в этом классе
    @Override
    public void add(Superclass fillIN) {
        for (int i = 0; i<arrayLecture.length; i++) {
            if (arrayLecture[i] == null) {
                arrayLecture[i] = (Lecture) fillIN;
                break;
            }
        }
    }

    @Override
    public void addIndex(int index,Superclass fillIN) {
        for (int i = 0; i<arrayLecture.length; i++) {
            if (arrayLecture[index] == null) {
                arrayLecture[index] = (Lecture) fillIN;
                break;
            }
        }
    }

    @Override
    public void remove(int index){
        for (int i = 0; i < arrayLecture.length; i++) {
            if (arrayLecture[i] != null) {
                if (index == arrayLecture[i].getID()) {
                    arrayLecture[i] = null;
                }
            }
        }
    }

}

