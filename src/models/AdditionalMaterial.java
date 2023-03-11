package models;

import static models.MaterialStatus.*;

public class AdditionalMaterial extends Superclass {

    public static int counterMaterials;

    //17
    public static int lectureId;//17
    public static String name;//17
    public MaterialStatus resourceType;//17

    //17
    public AdditionalMaterial(int ID, int lectureId, String name, MaterialStatus resourceType)
    {
        super (ID);
        this.lectureId = lectureId;
        this.name = name;
        this.resourceType = resourceType;
        counterMaterials++;
    }

    //17
    public static void setLectureId(int lectureId) {
        AdditionalMaterial.lectureId = lectureId;
    }

    public MaterialStatus getResourceType() {
        return resourceType;
    }

    public void setResourceType(MaterialStatus resourceType) {
        this.resourceType = resourceType;
    }
}
