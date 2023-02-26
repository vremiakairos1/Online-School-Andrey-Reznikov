package service;
import models.Lecture;
import models.Person;
import repository.RepositoryHomework;
import repository.RepositoryPerson;

import static repository.RepositoryLecture.getArrayLecture;
import java.util.Scanner;

public class ServiceLecture {

    private final static RepositoryPerson REPOSITORY_PERSON = new RepositoryPerson();//11


    public static void showElements() {
        for (Lecture elements: getArrayLecture()) {
            System.out.println(elements);
        }
    }//цикл выводит все элементы с двумя параметрами ID лекции и ID курса

    public static void showIDLecture(){
        for (Lecture elements: getArrayLecture()) {
            System.out.println("ID Lecture " + elements.getID());
        }
    }//цикл выводит все элементы с параметром ID лекции в конце работы с массивами

}
