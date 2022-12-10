import models.Course;
import models.Lecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Course firstCourse = new Course(10);

        Lecture firstLecture = new Lecture (1, firstCourse.idCourse1);
        Lecture secondLecture = new Lecture(2, 2);
        Lecture thirdLecture = new Lecture(3,1);


        //Homework 5 feature
        Lecture fourthLecture = new Lecture(4,1);
        Lecture fifthLecture = new Lecture(5,1);
        Lecture sixthLecture = new Lecture(6,2);

        System.out.println(sixthLecture.courseId);
        System.out.println(Lecture.counterLectures);

        /*
        // HW 6 way 2
        Lecture seventhLecture = new Lecture(7, firstCourse.getId());
        // HW 6 way 2
        System.out.println(seventhLecture.courseId);
        */

        //HW 6 way 3
        Lecture eighthLecture = Lecture.createLecture(8, firstCourse.idCourse1);
        System.out.println(eighthLecture.courseId);

        //7
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите категорию");
        System.out.println("1 Курсы");
        System.out.println("2 Учителя");
        System.out.println("3 Студенты");
        System.out.println("4 Лекции");
        int category = scanner.nextInt();

        switch (category)
        {
            case 1:
                System.out.println("Вы выбрали Курсы");
                System.out.println("5 Вернуться в меню");

                System.out.println("Выберите категорию");
                System.out.println("1 Курсы");
                System.out.println("2 Учителя");
                System.out.println("3 Студенты");
                System.out.println("4 Лекции");
                break;

            case 2:
                System.out.println("Вы выбрали Учителя");
                break;

            case 3:
                System.out.println("Вы выбрали Студенты");
                break;

            case 4:
                System.out.println("Вы выбрали Лекции");
                break;

            default:
                // Эта строка исправила ошибку. Если передавался ноль, то всё работало.
                // А если другие цифры кроме категории, а потом ноль, то не работало.
                // Пока выбор равен нулю или больше 4 все работат правильно
                while (category == 0 || category > 4) {
                    System.out.println("Пожалуйста выберите из предложенных цифр");
                    category = Menu();
                }

                /*while (category > 4) {
                    System.out.println("Пожалуйста выберите из предложенных цифр");
                    category = Menu();
                }*/

                while (category == 1) {
                    System.out.println("Вы выбрали Курсы");
                    category++;
                }

                while (category == 2) {
                    System.out.println("Вы выбрали Учителя");
                    category++;
                }

                while (category == 3) {
                    System.out.println("Вы выбрали Студенты");
                    category++;
                }

                while (category == 3) {
                    System.out.println("Вы выбрали Лекции");
                    category++;
                }
        }

        System.out.println("Создать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int selected = scanner.nextInt();
        int idLectures;


        //selected = dialog(scanner);
        switch (selected)
        {
            case 0:
                System.out.println("Вы выбрали не создавать лекцию");
                break;
            case 1:
                    System.out.println("Вы выбрали создать лекцию");
                    System.out.println("Введите ID лекции");
                    idLectures = scanner.nextInt();
                    //System.out.println("Введите ID курса");
                    //беру название переменной из класса Лекция конструктора для лекции
                    //int courseId = scanner.nextInt();
                    //Lecture nLecture = new Lecture(idLectures,courseId);
                    //беру название переменной из класса Курс конструктора для лекции
                    //int idCourse1 = scanner.nextInt();
                    Lecture nLecture = new Lecture(idLectures,firstCourse.idCourse1);
                    System.out.println(nLecture);
                    System.out.println(firstCourse.idCourse1);
                    System.out.println(Lecture.counterLectures);
                    System.out.println("Создать еще лекцию");
                    System.out.println("0 Нет");
                    System.out.println("2 Да");
                    int createLecture = scanner.nextInt();
                    if (createLecture == 2) {
                        System.out.println("Введите ID лекции");
                        idLectures = scanner.nextInt();
                        //System.out.println("Введите ID курса");
                        //беру название переменной из класса Курс конструктора для лекции
                        //idCourse1 = scanner.nextInt();
                        Lecture n1Lecture = new Lecture(idLectures,firstCourse.idCourse1);
                        System.out.println(n1Lecture);
                        System.out.println(firstCourse.idCourse1);
                        System.out.println(Lecture.counterLectures);

                    }

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selected);

        }

scanner.close();

    }
    //7
    static Scanner scanner = new Scanner(System.in);
    public static int Menu () {
        System.out.println("Выберите категорию");
        System.out.println("1 Курсы");
        System.out.println("2 Учителя");
        System.out.println("3 Студенты");
        System.out.println("4 Лекции");
        return scanner.nextInt();
    }

    //7

    /*public static int dialog(Scanner scanner) {
        System.out.println("Создать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int selected = scanner.nextInt();
        //int idLectures = scanner.nextInt();
        //System.out.println("Введите ID курса");
        //беру название переменной из класса Лекция конструктора для лекции
        //int idCourse1 = scanner.nextInt();
        return selected;
    }*/

}

