package za.ac.cput.cardealershipparts.Domain;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarPart1 extends Parts{


    public  String CarModelType(String part)
    {
        if(part == "1")
            return "BMW";
        else if(part != null)
            return partSold.CarModelType(part);
        else
            return "No car for that part";


    }
}
