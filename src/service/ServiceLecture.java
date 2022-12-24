package service;

import models.Lecture;

import static repository.RepositoryLecture.increaseArray;

public class ServiceLecture {

    public static void showElements() {
        for (Lecture elements: increaseArray) {
            System.out.println(elements);
        }
    }
}
