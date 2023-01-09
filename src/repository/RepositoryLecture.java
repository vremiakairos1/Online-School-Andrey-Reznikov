package repository;

import models.Course;
import models.Lecture;
import models.Superclass;

public class RepositoryLecture extends SuperRepository {

    private static int SIZE_ARRAY = 5;

    private static Lecture[] arrayLecture;//исходный массив
    private static int newSize;//переменная для нового массива
    private static Lecture[] increaseArray;// увеличенный массив
    private static int fullOF=0;// для проверки заполненности всего исходного массива

    public RepositoryLecture() {

        this.arrayLecture = new Lecture[SIZE_ARRAY];//передали переменную 5
        this.increaseArray = new Lecture[newSize];// передали переменную для нового массива

    }
    //заполнение исходного массива

    public static void addLecture(Lecture fillIN) {

        for (int i = 0; i<arrayLecture.length; i++) {
            if (arrayLecture[i] != null) {
                continue;
            }
            arrayLecture[i] = fillIN;
            break;
        }
    }

    public static void fullArrayLecture(){
        for (int i=0; i<arrayLecture.length; i++) {
            fullOF = 0;
            fullOF = i;
            if (arrayLecture[i] != null) {
                fullOF++;
                if (fullOF == arrayLecture.length) {
                    System.out.println("Количество заполненных элементов " + fullOF);
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
        Course secondCourse = new Course(2);
        RepositoryLecture.newAddLecture(new Lecture(6,2));
        RepositoryLecture.newAddLecture(new Lecture(7,2));
        RepositoryLecture.newAddLecture(new Lecture(8,2));
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

    @Override
    public Lecture[] getALL() {
        return arrayLecture;
    }

   /* @Override
    public void add(Superclass fillIN) {
        super.add(fillIN);////
    }*/

    @Override
    public void getByID(int ID) {
        for (Superclass openLecture : arrayLecture) {
            if (openLecture != null) {
                if (ID==openLecture.getID()) {
                    System.out.println(openLecture);
                }
            }
        }
    }

    @Override
    public void deleteByID(int ID) {
        for (int i = 0; i < arrayLecture.length; i++) {
            if (arrayLecture[i] != null) {
                if (ID == arrayLecture[i].getID()) {
                    arrayLecture[i] = null;
                }
            }
        }
    }
}

