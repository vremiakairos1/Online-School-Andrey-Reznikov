package service;
import models.Person;
import models.Role;
import java.util.Scanner;
import repository.RepositoryPerson;
import static models.Role.TEACHER;



public class ServicePerson {

    private final static RepositoryPerson REPOSITORY_PERSON = new RepositoryPerson();

    public static Person createTeacher(int ID, String lastname, String firstname, String phone, String email, int courseId, Role role) {
        Person teacher = new Person(ID, lastname, firstname, phone, email, courseId, TEACHER);
        return new Person(ID, lastname, firstname, phone, email, courseId, TEACHER);
    }

    public static Person createLimitTeacher(int id) {
        return new Person(id);
    }

    static Scanner scanner = new Scanner(System.in); // сканер не закрывается
    public static void dialogCreateTeacher() {
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
    }
}
