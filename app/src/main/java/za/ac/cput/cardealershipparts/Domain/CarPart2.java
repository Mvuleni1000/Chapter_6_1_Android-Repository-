package za.ac.cput.cardealershipparts.Domain;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarPart2 extends Parts {

        public  String CarModelType(String part)
        {
            if(part == "2")
                return "Mercedes Benz";
            else if(part != null)
                return partSold.CarModelType(part);
            else
                return "No car for that part";


        }
}

