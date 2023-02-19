package service;
import models.Course;
import models.Lecture;
import models.Person;
import repository.RepositoryLecture;
import repository.RepositoryPerson;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ServiceMenu {
    private final static RepositoryPerson REPOSITORY_PERSON = new RepositoryPerson();
    public static Course firstCourse = new Course(1, "Java Basics");
    static int category;//для выбора категории мен.
    // Объявляем за пределами метода main чтобы создать и воспользоваться методами
    static int lectureId;//для выбора создания лекции в первый раз
    static int idLecture;//для считывания ID лекции и пеередачи ее в параметр объекта лекции
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
        choiceOfCategory(category);
    }

    public static void choiceOfCategory(int category) {
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
                Person teacher = createTeacherDialog();
                updateLectureMenu(teacher);
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
    }

    public static void dialog1() {
        System.out.println("Создать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int selected = scanner.nextInt();
        severalLectures(selected);
    }

    public static Person createTeacherDialog() {
        System.out.println("Создать учителя?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int selected = scanner.nextInt();
        return readTeacher(selected);
    }

    public static Person readTeacher(int choice) {
        Person teacher = null;

        switch (choice) {
            case 0:
                break;
            case 1:
                System.out.println("Введите ID учителя");
                int teacherId = scanner.nextInt();
                teacher = ServicePerson.createLimitTeacher(teacherId);
                REPOSITORY_PERSON.add(teacher);
                break;
        }

        return teacher;
    }

    public static void dialogUpdateLecture() {
        System.out.println("Введите ID лекции, которую хотите отредактировать?");
        lectureId = scanner.nextInt();


    }//11

    //7
    public static void severalLectures(int selected) {

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
        idLecture = scanner.nextInt();
        Lecture nLecture = new Lecture(idLecture, firstCourse.getID());
        new RepositoryLecture().add(nLecture);
        //System.out.println(nLecture);
        System.out.println(firstCourse.getID());
        System.out.println(Lecture.getCounterLectures());
        System.out.println(Arrays.toString(RepositoryLecture.getArrayLecture()));
    }

    //8
    public static void dialog2() {
        System.out.println("Создать еще лекцию");
        System.out.println("0 Нет");
        System.out.println("2 Да");
        int choice = scanner.nextInt();
        if (choice == 2) {
            orderLecture();
        }
    }
    //11
    public static void updateLectureMenu(Person teacher) {
        System.out.println("Желаете отредактировать лекцию?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int choice = scanner.nextInt();
        updateLecture(choice, teacher);
    }

    //11
    public static void updateLecture(int selected, Person teacher) {
        switch (selected) {
            case 0:
                System.out.println("Вы выбрали не редактировать лекцию");
                break;
            case 1:
                System.out.println("Введите ID лекции от 1 до 5");
                int lectureId = scanner.nextInt();
                Lecture[] lectures = new RepositoryLecture().getALL();

                Lecture lecture = null;

                for (Lecture lect : lectures) {
                    if (lect.getID() == lectureId) {
                        lecture = lect;
                    }
                }

                lecture.setPersonId(teacher.getID());

                teacher.setLectureId(lectureId);
                break;
        }
    }

    //8
    public static void dialogExit() {
      System.out.println("Завершить программу?");
      System.out.println("0 Да");
      System.out.println("1 Вернуться в меню категорий");
    }//8



}
