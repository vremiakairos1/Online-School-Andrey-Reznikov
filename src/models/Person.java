package models;

import static models.Role.TEACHER;

public class Person extends Superclass {

    private static int counter = 0;
    private final int courseId;
    private final Role role = TEACHER;
    private String lastname = "Default";//12
    private String firstname = "Default";//12
    private String phone = "Default";//12
    private String email = "Default";//12



    public Person(int ID, String lastname, String firstname, String phone, String email, int courseId, Role role) {
        super(ID);
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.email = email;
        this.courseId = courseId;
        //this.role = role;
        counter++;
    }
    public Person(int ID, int courseId, Role role) {
        super(ID);
        this.courseId = courseId;
        //this.role = role;
    }

}
