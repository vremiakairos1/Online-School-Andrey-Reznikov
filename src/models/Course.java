package models;

public class Course extends Superclass {

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
    public Course(int ID)
    { super (ID);
        counterCourse1++;
    }

    //10




    public Teacher getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(Teacher lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public Student getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(Student lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public Lecture getNameLecture() {
        return nameLecture;
    }

    public void setNameLecture(Lecture nameLecture) {
        this.nameLecture = nameLecture;
    }//10
}

