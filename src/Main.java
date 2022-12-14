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
        int category;//для выбора категории меню
        int selected;//для выбора создания лекции в первый раз
        int idLectures;//для считывания ID лекции и пеередачи ее в параметр объекта лекции
        int createLecture;//для выбора создания лекции во второй раз
        int exit;//для возврата в меню или завершения

        System.out.println("Выберите категорию");
        System.out.println("1 Курсы");
        System.out.println("2 Учителя");
        System.out.println("3 Студенты");
        System.out.println("4 Лекции");
        System.out.println("0 Выйти");
        category = scanner.nextInt();

        switch (category)
        {
            case 1:
                System.out.println("Вы выбрали Курсы");
                System.out.println("5 Вернуться в меню");
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
            case 0:
                    System.out.println("Программа завершилась");
                    System.exit(0);//завершить программу


            default:
                // Эта строка исправила ошибку. Если передавался ноль, то всё работало.
                // А если другие цифры кроме категории, а потом ноль, то не работало.
                // Пока выбор равен нулю или больше 4 все работат правильно
                while (category > 4) {
                    System.out.println("Пожалуйста выберите из предложенных цифр");
                    category = Menu();

                }

                while (category == 0) {
                    System.out.println("Программа завершилась");
                    System.exit(0);//завершить программу
                }

                while (category == 1) {
                    System.out.println("Вы выбрали Курсы");
                    break;
                }

                while (category == 2) {
                    System.out.println("Вы выбрали Учителя");
                    break;
                }

                while (category == 3) {
                    System.out.println("Вы выбрали Студенты");
                    break;
                }

                while (category == 4) {
                    System.out.println("Вы выбрали Лекции");
                    break;
                }
        }

        System.out.println("Создать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        selected = scanner.nextInt();


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
                dialog2(); // 8 Вынес диалог для создания повторной лекции в метод
                     createLecture = scanner.nextInt();

                    // 8. В 7 задаче было ограниченное количество возможностей для создания лекции
                    // было через if. Изменил через цикл чтобы можно былло достигнуть какого-то числа
                    // созданных лекций.
                    while (createLecture == 2) {
                        System.out.println("Введите ID лекции");
                        idLectures = scanner.nextInt();
                        //System.out.println("Введите ID курса");
                        //беру название переменной из класса Курс конструктора для лекции
                        //idCourse1 = scanner.nextInt();
                        Lecture n1Lecture = new Lecture(idLectures,firstCourse.idCourse1);
                        System.out.println(n1Lecture);
                        System.out.println(firstCourse.idCourse1);
                        System.out.println(Lecture.counterLectures);
                        dialog2();
                        // цикл работает с этой переменной. Если она не равна 2, то программа прерывается
                        createLecture = scanner.nextInt();
                        //8 Добавляю лимит на создание лекции и автоматическое завершение программы.
                        // Счетчик лекций объявлен в классе Лекция. Если он достигает 9, то завершить программу
                        if (Lecture.counterLectures == 9) {
                            System.out.println("Вы достигли лимита по созданию лекций. Программа завершилась");
                            //System.exit(0);//завершить программу
                            } break;
                    }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selected);

        }
        //После создания лекций или вернуться в меню или завершить программу.
        dialogExit();
        exit = scanner.nextInt();
        while (exit == 0 || exit > 1 ) {break;}
        if (exit == 1) {
            Menu();
        }
scanner.close();

    }
    //7
    static Scanner scanner = new Scanner(System.in);
    public static int Menu() {
        System.out.println("Выберите категорию");
        System.out.println("1 Курсы");
        System.out.println("2 Учителя");
        System.out.println("3 Студенты");
        System.out.println("4 Лекции");
        System.out.println("0 Выйти");
        return scanner.nextInt();
    }

    //7

    public static void dialog2() {
        System.out.println("Создать еще лекцию");
        System.out.println("0 Нет");
        System.out.println("2 Да");
        }

    public static void dialogExit() {
        System.out.println("Завершить программу?");
        System.out.println("0 Да");
        System.out.println("1 Вернуться в меню категорий");
    }//8

}

