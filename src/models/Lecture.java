package models;

public class Lecture extends Superclass {
    //private int idLectures;
    private static int counterLectures;
    private Homework nameHomework;
    private AdditionalMaterial nameMaterials;

    private int courseId;

    public Lecture (int ID, int courseId)
    {
        super(ID);
        //this.idLectures = idLectures;
        this.courseId = courseId;
        counterLectures++;
    }


    //HW 6 way 3
    public static Lecture createLecture (int idLectures, int courseId)
    {
        return new Lecture(idLectures, courseId);
    }

    //7
    @Override
    public String toString() {
        return "Lecture {" +
                "idLectures=" + getID() +
                ", courseId=" + courseId +
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


}

