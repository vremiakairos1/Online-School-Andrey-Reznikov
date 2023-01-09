package models;

public class Student extends Superclass {

    public static int counterStudents;
    // 10
    public Student(int ID)
    {
        super (ID);
        counterStudents++;
    }

}
