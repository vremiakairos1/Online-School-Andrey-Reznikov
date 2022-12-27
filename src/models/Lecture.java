package models;

public class Lecture {
    private int idLectures;
    public static int counterLectures;
    //private Homework nameHomework;
    private AdditionalMaterial nameMaterials;

    public int courseId;

    public Lecture (int idLectures, int courseId)
    {
        this.idLectures = idLectures;
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
                "idLectures=" + idLectures +
                ", courseId=" + courseId +
                '}';
    }//7

    public int getIdLectures() {
        return idLectures;
    }

    //9
    public void setIdLectures(int idLectures) {
        this.idLectures = idLectures;
    }

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
    }//9
}

