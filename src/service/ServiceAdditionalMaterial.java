package service;

import models.AdditionalMaterial;
import models.Homework;
import models.Lecture;
import models.MaterialStatus;
import repository.RepositoryLecture;
import repository.RepositoryMaterials;

import java.util.ArrayList;

import static models.MaterialStatus.*;

public class ServiceAdditionalMaterial {


    //17
    public static AdditionalMaterial createMaterial(int ID, int lectureId, String name, MaterialStatus resourceType){
        AdditionalMaterial aMaterial = new AdditionalMaterial(ID, lectureId, name, URL);
        return aMaterial;
    }

    //17
    public static AdditionalMaterial createMaterialDialog() {
        System.out.println("Создать домашку?");
        System.out.println("0 Нет");
        System.out.println("1 Да");
        int choice = WorkWithScanner.getScanner().nextInt();
        return readMaterial(choice);
    }
    //17
    public static AdditionalMaterial readMaterial(int choice){
        switch (choice) {
            case 0:
                break;

            case 1:
                System.out.println("Введите Дополнительного материала");
                int materialId = WorkWithScanner.getScanner().nextInt();
                AdditionalMaterial aMaterial = ServiceAdditionalMaterial.createMaterial(materialId,1,"something", URL );
                ArrayList<AdditionalMaterial> arrayListMaterials = RepositoryMaterials.arrayListMaterials;
                arrayListMaterials.add(aMaterial);
                System.out.println("Введите ID лекции от 1 до 5");
                int lectureId = WorkWithScanner.getScanner().nextInt();
                Lecture[] lectures = new RepositoryLecture().getALL();

                Lecture lecture = null;

                for (Lecture lect : lectures) {
                    if (lect.getID() == lectureId) {
                        lecture = lect;
                    }
                }

                lecture.setaMaterialId (aMaterial.getID());

                aMaterial.setLectureId(lectureId);
                System.out.println("Выберите тип ресурса");
                System.out.println("1 URL");
                System.out.println("2 BOOK");
                System.out.println("3 VIDEO");
                int type = WorkWithScanner.getScanner().nextInt();
                if (type == 1) {
                    aMaterial.setResourceType(URL);
                } else if (type == 2) {
                    aMaterial.setResourceType(BOOK);
                } else if (type == 3) {
                    aMaterial.setResourceType(VIDEO);
                }
                break;
        }
        return null;
    }
}
