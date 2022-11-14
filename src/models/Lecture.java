package models;

public class Lecture {
    private int idLectures;
    public static int counterLectures;
    private Homework nameHomework;
    private AdditionalMaterial nameMaterials;

    public int courseId;

    public Lecture (int idLectures, int courseId)
    {
        this.idLectures = idLectures;
        this.courseId = courseId;
        counterLectures++;
    }
}
