package service;

import models.Person;
import models.Role;

import static models.Role.TEACHER;

public class ServicePerson {
    public static Person createTeacher(int ID, String lastname, String firstname, String phone, String email, int courseId, Role role) {
        Person teacher = new Person(ID, lastname, firstname, phone, email, courseId, TEACHER);
        return teacher;
    }
}
