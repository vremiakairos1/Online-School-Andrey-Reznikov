package models;

import static models.Role.TEACHER;

public class Person extends Superclass {

    private static int counter = 0;
    private final int courseId;
    private final Role role;
    private String lastname;//12
    private String firstname;//12
    private String phone;//12
    private String email;//12



    public Person(int ID, String lastname, String firstname, String phone, String email, int courseId, Role role) {
        super(ID);
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.email = email;
        this.courseId = courseId;
        this.role = role;
        counter++;
    }


}
