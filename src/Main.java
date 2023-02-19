import models.Course;
import models.Lecture;
import models.Person;
import models.Role;
import repository.RepositoryGeneric;
import repository.RepositoryLecture;
import service.ServiceLecture;
import service.ServiceMenu;
import service.ServicePerson;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static repository.RepositoryLecture.*;
import static service.ServiceMenu.dialog2;
public class Main {
    public static Course firstCourse;//для доступа к ID курса из другого класса
                                     // или не из области видимости метода main

    public static void main(String[] args) {
        RepositoryLecture firstObject = new RepositoryLecture();//10
        RepositoryGeneric genericObject = new RepositoryGeneric();//13
        firstCourse = new Course(1, "Java Basics");
        Person firstTeacher = ServicePerson.createTeacher(1,"lastname", "firstname","1111111111", "",1, Role.TEACHER);//11


        firstObject.add(new Lecture(1, "Lecture 1", "something", 1, 1, Role.NULL));//11-12
        firstObject.add(new Lecture(2, "Lecture 2", "something", 1, 1, Role.NULL));//11
        firstObject.add(new Lecture(3, "Lecture 3", "something", 1, 1, Role.NULL));//11
        firstObject.add(new Lecture(4, "Lecture 4", "something", 1, 1, Role.NULL));//11
        firstObject.add(new Lecture(5, "Lecture 5", "something", 1, 1, Role.NULL));//11

        genericObject.add(new Lecture(1, "Lecture 1", "something", 1, 1, Role.NULL));//13
        genericObject.add(new Lecture(2, "Lecture 2", "something", 1, 1, Role.NULL));//13
        genericObject.add(new Lecture(3, "Lecture 3", "something", 1, 1, Role.NULL));//13
        genericObject.add(new Lecture(4, "Lecture 4", "something", 1, 1, Role.NULL));//13
        genericObject.add(new Lecture(5, "Lecture 5", "something", 1, 1, Role.NULL));//13

        ServiceLecture.showElements();// показать элементы массива

        System.out.println(Lecture.getCounterLectures());


        //7
        Scanner scanner = new Scanner(System.in);
        int exit;//для возврата в меню или завершения
        //menu(); //- создает меню для выбора категорий
        //ServiceMenu.dialog2(); //- диалог создать еще лекцию
        createLecture = scanner.nextInt();
        //После создания лекций или вернуться в меню или завершить программу.

        //Пока считанный результат 0 ИЛИ больше 1 прервать работу программы
        /*exit = scanner.nextInt();
        while (exit == 0 || exit > 1) {
            break;
        }
        if (exit == 1) {
            //menu();
            //choiceOfCategory();
            //dialog1();
            //severalLectures();
            ServiceMenu.dialogExit();
        }
        exit = scanner.nextInt();
        while (exit == 0 || exit > 1) {
            break;
        }*/

        //-----9
        RepositoryLecture.fullArrayLecture();
        System.out.println("Массив заполнен. Теперь размер массива увеличивается");//должно быть за пределами цикла

        //если массив заполнился, то увеличить его и перенести элементы
        if (getFullOF() == getArrayLecture().length) {
            RepositoryLecture.increaseSIZE();
        }
        // проверка увеличения размера переменной и размера массива
        System.out.println("Переменная содержит " + RepositoryLecture.getNewSize());
        System.out.println("Массив содержит " + getArrayLecture().length);

        //переношу элементы из исходного массива и проверяю, что перенеслось и есть ли 3 пустых элемента
        ServiceLecture.showElements();

        RepositoryLecture.createCourseLectures();// создать 1 объект курса и три лекции
        RepositoryLecture.dialogArray2();// желаете вывести все элементы массива
        RepositoryLecture.elementsArray2 = scanner.nextInt();
        RepositoryLecture.showArray2(); // switch для диалога
        // ---- 9

        //12
        String regexName = "^[a-zA-Z]+$";// имя фамилия задание 12 про regex
        String regexEmail = "^\\w+@\\w+\\.\\w+$";// Email буквы@буквы.домен
        String regexPhone = "^\\d{3}\\-\\d{3}\\-\\d{2}\\-\\d{2}$";// Phone 050-000-11-22
        Pattern pattern = Pattern.compile(regexPhone);// regexName regexEmail
        System.out.println("Введите имя латиницей");
        String name = scanner.nextLine();
        Matcher matcher = pattern.matcher(name);
        boolean b = matcher.matches();
        System.out.println(b);//12


//scanner.close();

        ServiceMenu.menu();
        ServiceMenu.dialog1(); //- первый диалог про создание лекции
//        ServiceMenu.orderLecture(); //- запрашиваем и выводим данные лекции
//        ServiceMenu.dialog2(); //- диалог создать еще лекцию
        ServiceMenu.dialogExit(); //- после создания лекций вернуться в меню или завершить программу
    }

      //------ область видимости за пределами класса мейн
      static int idLectures;//для считывания ID лекции и пеередачи ее в параметр объекта лекции
      static int createLecture;//для выбора создания лекции во второй раз
    //7
      static Scanner scanner = new Scanner(System.in);
      //static int elementsArray2;// отображать элементы 2-ого массива

    /*public static void menu() {
           System.out.println("Выберите категорию");
           System.out.println("1 Курсы");
           System.out.println("2 Учителя");
           System.out.println("3 Студенты");
           System.out.println("4 Лекции");
           System.out.println("0 Выйти");
           int category = scanner.nextInt();
           choiceOfCategory(category);
    }*/

    /*public static void choiceOfCategory(int category) {
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
                dialog1(); //- первый диалог про создание лекции
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
    }*/

    /*public static void dialog1() {
        System.out.println("Создать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int selected = scanner.nextInt();
        severalLectures(selected);
    }*/

    //7
    /*public static void severalLectures(int selected) {

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
                        ServiceMenu.dialogExit(); //- после создания лекций вернуться в меню или завершить программу
                    }
                    break;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selected);

        }
    }*/

    /*public static void orderLecture() {
        System.out.println("Введите ID лекции");
        idLectures = scanner.nextInt();
        //Lecture nLecture = new Lecture(idLectures, firstCourse.getID(),1);
        //RepositoryLecture.add(nLecture);
        //System.out.println(nLecture);
        System.out.println(firstCourse.getID());
        System.out.println(Lecture.getCounterLectures());
        System.out.println(Arrays.toString(RepositoryLecture.getArrayLecture()));
    }*/

}

