package service;

import models.Lecture;

import static repository.RepositoryLecture.getArrayLecture;

public class ServiceLecture {

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
