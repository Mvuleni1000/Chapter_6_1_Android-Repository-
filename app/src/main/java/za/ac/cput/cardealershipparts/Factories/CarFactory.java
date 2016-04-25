package za.ac.cput.cardealershipparts.factories;

import za.ac.cput.cardealershipparts.Domain.Cars;
/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarFactory {

    public static Cars createCar(String RegistrationNumber, String Make, String Model, String Colour, String year)
    {
        Cars car = new Cars
                .Builder(RegistrationNumber)
                .Make(Make)
                .Model(Model)
                .Colour(Colour)
                .year(year)
                .build();

        return car;
    }
}
