package models;

public class AdditionalMaterial extends Superclass {

    public static int counterMaterials;

    public AdditionalMaterial(int ID)
    {
        super (ID);
        counterMaterials++;
    }

}
