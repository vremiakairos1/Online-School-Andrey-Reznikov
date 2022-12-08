package models;

import java.util.Scanner;

public class Course {
    public int idCourse1;
    public static int counterCourse1;
    private Teacher lastNameTeacher;
    private Student lastNameStudent;
    private Lecture nameLecture;

    /* public Course(int idCourse1)
    {
        this.idCourse1 = idCourse1;
        counterCourse1++;
    } */

    // HW 6 way 2
    public Course(int idCourse1)
    {
        this.idCourse1 = idCourse1;
        counterCourse1++;
    }
    // HW 6 way 2
    public int getId(){
        return idCourse1;
    }

    //7
    static Scanner scanner = new Scanner(System.in);
    public static int Menu () {
        System.out.println("Выберите категорию");
        System.out.println("1 Курсы");
        System.out.println("2 Учителя");
        System.out.println("3 Студенты");
        System.out.println("4 Лекции");
        return scanner.nextInt();
    }
    //7
}

