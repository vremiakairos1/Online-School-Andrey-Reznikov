package service;
import models.Person;
import models.Role;
import java.util.Scanner;

import static models.Role.TEACHER;

public class ServicePerson {
    public static Person createTeacher(int ID, String lastname, String firstname, String phone, String email, int courseId, Role role) {
        Person teacher = new Person(ID, lastname, firstname, phone, email, courseId, TEACHER);
        return teacher;
    }

    public static Person createLimitTeacher(int ID, int courseId, Role role){
        Person teacher1 = new Person(ID, courseId, TEACHER);
        return teacher1;
    }


}
