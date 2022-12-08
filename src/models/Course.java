package models;

public class Course {
    public int idCourse1;
    public static int counterCourse1;
    private Teacher lastNameTeacher;
    private Student lastNameStudent;
    private Lecture nameLecture;

    /* public Course(int idCourse1)
    {
        this.idCourse1 = idCourse1;
        counterCourse1++;
    } */

    // HW 6 way 2
    public Course(int idCourse1)
    {
        this.idCourse1 = idCourse1;
        counterCourse1++;
    }
    // HW 6 way 2
    public int getId(){
        return idCourse1;
    }
}

