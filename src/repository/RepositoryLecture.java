package repository;

import models.Course;
import models.Lecture;

public class RepositoryLecture {

    private static int SIZE_ARRAY = 5;

    public static Lecture[] arrayLecture;//исходный массив
    public static int newSize;//переменная для нового массива
    public static Lecture[] increaseArray;// увеличенный массив

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
    public static int fullOF=0;// для проверки заполненности всего исходного массива
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
}

