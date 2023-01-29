package repository;


import models.Superclass;

public class SuperRepository {
    private static Superclass[] arrayRepository = new Superclass[10];

    //метод возвращает весь массив
     public Superclass[] getALL () {
        return arrayRepository;
    }

    //метод с параметром суперкласса моделей для заполнения массива в супер-репозитории
    public void add (Superclass fillIN) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] == null) {
                arrayRepository[i] = fillIN;
                break;
            }
        }
    }

    //метод перебирает каждый элемент массива и сравнивает его с ID объекта
    public void getByID (int ID) {
       for (Superclass openLecture : arrayRepository) {
           if (openLecture != null) {
               if (ID==openLecture.getID()) {
                   System.out.println(openLecture);
               }
           }
       }
    }//написать override

    //метод удаляет объект в массиве, но не сдвигает элементы
    public void deleteByID (int ID) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                if (ID == arrayRepository[i].getID()) {
                    arrayRepository[i] = null;
                }
            }
        }
    }

}
