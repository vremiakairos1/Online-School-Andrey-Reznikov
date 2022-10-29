package models;

public class Student {
    private int idStudents;
    public static int counterStudents;

    public Student()
    {
        counterStudents++;
    }
}
