package za.ac.cput.cardealershipparts.Domain;

import java.io.Serializable;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public abstract class Parts implements Serializable{

    Parts partSold;

    public void  setPartSold(Parts partSold1)
    {
        this.partSold = partSold1;
    }

    public abstract String CarModelType(String Model);

}
