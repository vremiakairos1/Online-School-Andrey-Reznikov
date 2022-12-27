package service;

import models.Lecture;

import static repository.RepositoryLecture.arrayLecture;

public class ServiceLecture {

    public static void showElements() {
        for (Lecture elements: arrayLecture) {
            System.out.println(elements);
        }
    }//цикл выводит все элементы с двумя параметрами ID лекции и ID курса

    public static void showIDLecture(){
        for (Lecture elements: arrayLecture) {
            System.out.println("ID Lecture " + elements.getIdLectures());
        }
    }//цикл выводит все элементы с параметром ID лекции в конце работы с массивами
}
