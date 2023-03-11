package models;

public class Lecture extends Superclass {
    //private int idLectures;
    private static int counterLectures;
    private Homework nameHomework;
    private AdditionalMaterial nameMaterials;

    private int personId;//11
    public Role role;

    private int courseId;//11

    private String name;//12
    private String description;//12

    private int homeworkId;//14
    private int aMaterialId;//17

    public Lecture (int ID, String name, String description, int courseId, int personId, Role role)//11-12
    {
        super(ID);
        //this.idLectures = idLectures;
        this.courseId = courseId;
        this.personId = personId;//11
        this.role = role;
        this.name = name;
        this.name = description;
        counterLectures++;
    }
    //11
    public Lecture (int id, int courseId) {
        super(id);
        this.courseId = courseId;
        this.courseId = 1;
        counterLectures++;
    }


    //7
    @Override
    public String toString() {
        return "Lecture {" +
                "idLectures=" + getID() +
                ", courseId=" + courseId +
                ", personId=" + personId + //11
                ", role=" + role + //11
                '}';
    }//7

    //10
    public static int getCounterLectures() {
        return counterLectures;
    }
    public static void setCounterLectures(int counterLectures) {
        Lecture.counterLectures = counterLectures;
    }

    public AdditionalMaterial getNameMaterials() {
        return nameMaterials;
    }
    public void setNameMaterials(AdditionalMaterial nameMaterials) {
        this.nameMaterials = nameMaterials;
    }

    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }//10

    //11
    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //14
    public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
    }

    //17
    public void setaMaterialId(int aMaterialId) {
        this.aMaterialId = aMaterialId;
    }
}
