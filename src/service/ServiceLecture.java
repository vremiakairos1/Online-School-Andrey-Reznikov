package service;

import models.Lecture;

import static repository.RepositoryLecture.arrayLecture;

public class ServiceLecture {

    public static void showElements() {
        for (Lecture elements: arrayLecture) {
            System.out.println(elements);
        }
    }
}
