package models;

public class Homework extends Superclass {

    public static int counterHomework;

    public static int lectureId;//14
    public static String task;//14

    public Homework(int ID, int lectureId, String task)
    {
        super (ID);
        this.lectureId = lectureId;//14
        this.task = task;//14
        counterHomework++;
    }// 10

    //14
    public static void setCounterHomework(int counterHomework) {
        Homework.counterHomework = counterHomework;
    }
    //14
    public static void setLectureId(int lectureId) {
        Homework.lectureId = lectureId;
    }
    //14
    public static void setTask(String task) {
        Homework.task = task;
    }
}
