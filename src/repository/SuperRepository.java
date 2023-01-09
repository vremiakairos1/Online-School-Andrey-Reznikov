package repository;


import models.Superclass;

public class SuperRepository {
    private static Superclass[] arrayRepository = new Superclass[10];

    public Superclass[] getALL () {
        return arrayRepository;
    }

    public void add (Superclass fillIN) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                continue;
            }
            arrayRepository[i] = fillIN;
            break;
        }
    }

    public void getByID (int ID) {
       for (Superclass openLecture : arrayRepository) {
           if (openLecture != null) {
               if (ID==openLecture.getID()) {
                   System.out.println(openLecture);
               }
           }
       }
    }//написать override

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
