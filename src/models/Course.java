package models;

public class Course {
    private int idCourse1;
    public static int counterCourse1;
    private Teacher lastNameTeacher;
    private Student lastNameStudent;
    private Lecture nameLecture;

    public Course()
    {
        counterCourse1++;
    }
}
