package service;
import models.Lecture;
import models.Person;
import repository.RepositoryPerson;

import static repository.RepositoryLecture.getArrayLecture;
import java.util.Scanner;

public class ServiceLecture {

    private final static RepositoryPerson REPOSITORY_PERSON = new RepositoryPerson();

    public static void showElements() {
        for (Lecture elements: getArrayLecture()) {
            System.out.println(elements);
        }
    }//цикл выводит все элементы с двумя параметрами ID лекции и ID курса

    public static void showIDLecture(){
        for (Lecture elements: getArrayLecture()) {
            System.out.println("ID Lecture " + elements.getID());
        }
    }//цикл выводит все элементы с параметром ID лекции в конце работы с массивами

    static Scanner scanner = new Scanner(System.in); // сканер не закрывается

    /*public static void dialogCreateTeacher(Scanner f) {
        System.out.println("Создать учителя?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int choice = scanner.nextInt();
        readTeacher(choice);
    }
    public static void readTeacher(int choice){
        switch (choice) {
            case 0:
                break;

            case 1:
                System.out.println("Введите ID учителя");
                int teacherId = scanner.nextInt();
                Person teacher = ServicePerson.createLimitTeacher(teacherId);
                REPOSITORY_PERSON.add(teacher);
                break;
        }
    }*/

}
