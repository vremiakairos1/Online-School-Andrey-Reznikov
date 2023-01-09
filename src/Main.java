import models.Course;
import models.Lecture;
import repository.RepositoryLecture;
import service.ServiceLecture;

import java.util.Arrays;
import java.util.Scanner;

import static repository.RepositoryLecture.*;

public class Main {
    public static Course firstCourse;//для доступа к ID курса из другого класса
                                     // или не из области видимости метода main

    public static void main(String[] args) {
        new RepositoryLecture();//9

        firstCourse = new Course(10);
        RepositoryLecture.addLecture(new Lecture(18, 28));
        RepositoryLecture.addLecture(new Lecture(19, 29));
        RepositoryLecture.addLecture(new Lecture(18, 28));
        RepositoryLecture.addLecture(new Lecture(19, 29));
        RepositoryLecture.addLecture(new Lecture(19, 29));

        Lecture firstLecture = new Lecture(1, firstCourse.getID());
        ServiceLecture.showElements();// показать элементы массива
        // System.out.println(Arrays.toString(arrayLecture));
        /*Lecture secondLecture = new Lecture(2, 2);
        Lecture thirdLecture = new Lecture(3,1);


        //Homework 5 feature
        Lecture fourthLecture = new Lecture(4,1);
        Lecture fifthLecture = new Lecture(5,1);
        Lecture sixthLecture = new Lecture(6,2);

        System.out.println(sixthLecture.getCourseId());
        System.out.println(Lecture.getCounterLectures());


        // HW 6 way 2
        Lecture seventhLecture = new Lecture(7, firstCourse.getID());
        // HW 6 way 2
        System.out.println(seventhLecture.getCourseId());


        //HW 6 way 3
        Lecture eighthLecture = Lecture.createLecture(8, firstCourse.getID());
        System.out.println(eighthLecture.getCourseId());

        //7

        Scanner scanner = new Scanner(System.in);
        int exit;//для возврата в меню или завершения
        menu(); //- создает меню для выбора категорий
        choiceOfCategory(); //- обрабатывает выбор категорий
        dialog1(); //- первый диалог про создание лекции
        severalLectures(); //- создает несколько лекций
        orderLecture(); //- запрашиваем и выводим данные лекции
        dialog2(); //- диалог создать еще лекцию
        dialogExit(); //- после создания лекций вернуться в меню или завершить программу


        menu();
        choiceOfCategory();

        dialog1();
        severalLectures();

        //После создания лекций или вернуться в меню или завершить программу.
        dialogExit();

        //Пока считанный результат 0 ИЛИ больше 1 прервать работу программы
        exit = scanner.nextInt();
        while (exit == 0 || exit > 1) {
            break;
        }
        if (exit == 1) {
            menu();
            choiceOfCategory();
            dialog1();
            severalLectures();
            dialogExit();
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
        dialogArray2();// желаете вывести все элементы массива
        showArray2(); // switch для диалога
        // ---- 9

//scanner.close();

    }

      //------ область видимости за пределами класса мейн
/*      static int category;//для выбора категории мен.
      // Объявляем за пределами метода main чтобы создать и воспользоваться методами
      static int selected;//для выбора создания лекции в первый раз
      static int idLectures;//для считывания ID лекции и пеередачи ее в параметр объекта лекции
      static int createLecture;//для выбора создания лекции во второй раз*/
    //7
      static Scanner scanner = new Scanner(System.in);
      static int elementsArray2;// отображать элементы 2-ого массива

/*    public static void menu() {
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
                dialog2();
                // В повторном диалоге использую 2 чтобы отличать
                // Пока выбор = 2 создаем новую лекцию
                while (createLecture == 2) {
                    orderLecture();
                    dialog2();

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
        Lecture nLecture = new Lecture(idLectures, firstCourse.getID());
        RepositoryLecture.addLecture(nLecture);
        System.out.println(nLecture);
        System.out.println(firstCourse.getID());
        System.out.println(Lecture.getCounterLectures());
        System.out.println(Arrays.toString(RepositoryLecture.getArrayLecture()));
    }

    public static void dialog2() {
        System.out.println("Создать еще лекцию");
        System.out.println("0 Нет");
        System.out.println("2 Да");
        createLecture = scanner.nextInt();
    }

  public static void dialogExit() {
      System.out.println("Завершить программу?");
      System.out.println("0 Да");
      System.out.println("1 Вернуться в меню категорий");
    }//8*/

    //9 ----
    public static void dialogArray2() {
        System.out.println("Вывести элементы 2-ого массива?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        elementsArray2 = scanner.nextInt();
    }

    public static void showArray2() {
        switch (elementsArray2) {
            case 0:
            break;

            case 1:
                ServiceLecture.showIDLecture(); //вызов элементов массива через цикл for each
                //System.out.println(Arrays.toString(increaseArray)); //вызов елементов массива через системные методы
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + elementsArray2);
        }
    }//9 ----

}

