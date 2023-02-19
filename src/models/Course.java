package models;

public class Course extends Superclass {

    public static int counterCourse1;
    private Teacher lastNameTeacher;
    private Student lastNameStudent;
    private Lecture nameLecture;
    private String name;//12

    // HW 6 way 2
    public Course(int ID, String name)
    { super (ID);
        this.name = name;
        counterCourse1++;
    }

    //10
    public Lecture getNameLecture() {
        return nameLecture;
    }
    public void setNameLecture(Lecture nameLecture) {
        this.nameLecture = nameLecture;
    }//10

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

