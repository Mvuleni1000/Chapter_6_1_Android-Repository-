package za.ac.cput.cardealershipparts.factories;

import za.ac.cput.cardealershipparts.Domain.CarPart1;
import za.ac.cput.cardealershipparts.Domain.CarPart2;
import za.ac.cput.cardealershipparts.Domain.Parts;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class PartsFactory {

    public static String CarModelType(String part){
        Parts chain = setUpChain();
        return chain.CarModelType(part);
    }
    public static Parts setUpChain(){

        CarPart1 carPart1 =  new CarPart1();
        CarPart2 carPart2 = new CarPart2();

        carPart1.setPartSold(carPart2);
        return carPart1;

    }
}
