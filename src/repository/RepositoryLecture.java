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

    public static void increaseSIZE(){
        newSize = (SIZE_ARRAY * 3) /2 +1;
        increaseArray = new Lecture[newSize];
    }

    public static void createCourseLectures(){
        Course secondCourse = new Course(2);
        RepositoryLecture.newAddLecture(new Lecture(6,2));
        RepositoryLecture.newAddLecture(new Lecture(7,2));
        RepositoryLecture.newAddLecture(new Lecture(8,2));
    }

    // заполнение нового массива тремя элементами начиная с индекса 5
    public static void newAddLecture(Lecture newFillIN) {

        for (int i = 5; i<increaseArray.length; i++) {
            if (increaseArray[i] != null) {
                continue;
            }
            increaseArray[i] = newFillIN;
            break;
        }
    }
}

