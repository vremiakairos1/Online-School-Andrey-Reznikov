import models.Lecture;

public class Main {
    public static void main(String[] args)
    {
        Lecture firstLecture = new Lecture();
        Lecture secondLecture = new Lecture();
        Lecture thirdLecture = new Lecture();

        System.out.println(Lecture.counterLectures);
    }
}
