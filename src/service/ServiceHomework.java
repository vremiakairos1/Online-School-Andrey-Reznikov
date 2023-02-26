package service;
import models.Homework;
import models.Lecture;
import repository.RepositoryHomework;
import repository.RepositoryLecture;

import java.util.Scanner;




public class ServiceHomework {
    private final static RepositoryHomework REPOSITORY_HOMEWORK = new RepositoryHomework();

    public static Homework createHomework(int ID, int lectureId, String task) {
        Homework homework = new Homework(ID, lectureId, task);
        return new Homework(ID, lectureId, task);
    }

    static Scanner scanner = new Scanner(System.in);
    //14
        public static Homework createHomeworkDialog() {
        System.out.println("Создать домашку?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int choice = WorkWithScanner.getScanner().nextInt();
        return readHomework(choice);
    }

   public static Homework readHomework(int choice){
        switch (choice) {
            case 0:
                break;

            case 1:
                System.out.println("Введите ID Домашнего задания");
                int homeworkId = scanner.nextInt();
                Homework homework = ServiceHomework.createHomework(homeworkId,1, "something");
                REPOSITORY_HOMEWORK.add(homework);
                System.out.println("Введите ID лекции от 1 до 5");
                int lectureId = scanner.nextInt();
                Lecture[] lectures = new RepositoryLecture().getALL();

                Lecture lecture = null;

                for (Lecture lect : lectures) {
                    if (lect.getID() == lectureId) {
                        lecture = lect;
                    }
                }

                lecture.setHomeworkId(homework.getID());

                homework.setLectureId(lectureId);
                break;
        }
        return null;
    }
}
