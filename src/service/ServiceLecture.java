package service;
import models.Lecture;
import models.Role;
import repository.RepositoryPerson;

import static repository.RepositoryLecture.getArrayLecture;
import java.util.Scanner;

public class ServiceLecture {

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
    static int readTeacher;
    public static void dialogCreateTeacher(Scanner f) {
        System.out.println("Создать учителя?");
        System.out.println("0 Да");
        System.out.println("1 Нет");
        readTeacher = scanner.nextInt();
    }
    public static void readTeacher (){
        switch (readTeacher) {
            case 0:
                break;

            case 1:
                System.out.println();
                ServicePerson.createLimitTeacher(1,1, Role.TEACHER);

                break;
        }
    }

}
