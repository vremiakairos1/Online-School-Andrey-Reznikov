import models.Course;
import models.Lecture;

public class Main {
    public static void main(String[] args)
    {
        Course firstCourse = new Course(1);

        Lecture firstLecture = new Lecture (1,1);
        Lecture secondLecture = new Lecture(2, 2);
        Lecture thirdLecture = new Lecture(3,1);


        //Homework 5 feature
        Lecture fourthLecture = new Lecture(4,1);
        Lecture fifthLecture = new Lecture(5,1);
        Lecture sixthLecture = new Lecture(6,2);

        System.out.println(sixthLecture.courseId);
        System.out.println(Lecture.counterLectures);
    }
}
