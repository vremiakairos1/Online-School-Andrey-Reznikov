package models;

public class Teacher extends Superclass {
    public static int counterTeachers;

    // 10
    public Teacher(int ID)
    {
        super (ID);
        counterTeachers++;
    }


}
