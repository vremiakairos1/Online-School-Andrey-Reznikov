package models;

public class Lecture {
    private int idLectures;
    public static int counterLectures;
    private Homework nameHomework;
    private AdditionalMaterial nameMaterials;

    public Lecture()
    {
        counterLectures++;
    }

    //HW 6 way 3
    public static Lecture createLecture (int idLectures, int courseId)
    {
        return new Lecture(idLectures, courseId);
    }
}
