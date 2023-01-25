package service;
import models.Course;
import models.Lecture;
import repository.RepositoryLecture;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ServiceMenu {

    /*static int category;//для выбора категории мен.
    // Объявляем за пределами метода main чтобы создать и воспользоваться методами
    static int selected;//для выбора создания лекции в первый раз
    static int idLectures;//для считывания ID лекции и пеередачи ее в параметр объекта лекции
    static int createLecture;//для выбора создания лекции во второй раз
    //7
    static Scanner scanner = new Scanner(System.in);
    //static int elementsArray2;// отображать элементы 2-ого массива

    public static void menu() {
        System.out.println("Выберите категорию");
        System.out.println("1 Курсы");
        System.out.println("2 Учителя");
        System.out.println("3 Студенты");
        System.out.println("4 Лекции");
        System.out.println("0 Выйти");
        category = scanner.nextInt();
    }

    public static void choiceOfCategory() {
        switch (category) {
            case 0:
                System.out.println("Программа завершилась");
                System.exit(0);//завершить программу
                break;

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

            default:
                // Эта строка исправила ошибку. Если передавался ноль, то всё работало.
                // А если другие цифры кроме категории, а потом ноль, то не работало.
                // Пока выбор равен нулю или больше 4 все работат правильно
                while (category > 4) {
                    System.out.println("Пожалуйста выберите из предложенных цифр");
                    menu();
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
    }

    public static void dialog1() {
        System.out.println("Создать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        selected = scanner.nextInt();
    }

    //7
    public static void severalLectures() {

        switch (selected) {
            case 0:
                System.out.println("Вы выбрали не создавать лекцию");
                break;
            case 1:
                System.out.println("Вы выбрали создать лекцию");
                //беру название переменной из класса Лекция конструктора для лекции
                orderLecture();
                ServiceMenu.dialog2();
                createLecture = scanner.nextInt();
                // В повторном диалоге использую 2 чтобы отличать
                // Пока выбор = 2 создаем новую лекцию
                while (createLecture == 2) {
                    orderLecture();
                    ServiceMenu.dialog2();
                    createLecture = scanner.nextInt();

                    //8 Добавляю лимит на создание лекции и автоматическое завершение программы.
                    // Счетчик лекций объявлен в классе Лекция. Если он достигает 9, то завершить программу
                    if (Lecture.getCounterLectures() == 9) {
                        System.out.println("Вы достигли лимита по созданию лекций.");
                        //System.exit(0);//завершить программу
                    }
                    break;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selected);

        }
    }

    public static void orderLecture() {
        System.out.println("Введите ID лекции");
        idLectures = scanner.nextInt();
        Lecture nLecture = new Lecture(idLectures, firstCourse.getID(),1);
        RepositoryLecture.add(nLecture);
        //System.out.println(nLecture);
        System.out.println(firstCourse.getID());
        System.out.println(Lecture.getCounterLectures());
        System.out.println(Arrays.toString(RepositoryLecture.getArrayLecture()));
    }*/

    //8
    public static void dialog2() {
        System.out.println("Создать еще лекцию");
        System.out.println("0 Нет");
        System.out.println("2 Да");
    }

    //8
    public static void dialogExit() {
      System.out.println("Завершить программу?");
      System.out.println("0 Да");
      System.out.println("1 Вернуться в меню категорий");
    }//8



}
