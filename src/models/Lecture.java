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
}
