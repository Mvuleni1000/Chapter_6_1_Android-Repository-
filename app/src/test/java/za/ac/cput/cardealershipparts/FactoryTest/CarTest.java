package za.ac.cput.cardealershipparts.FactoryTest;

import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.cardealershipparts.Domain.Cars;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarTest {

    @Test
    public void CreateCar() throws Exception {
        Cars cars = new Cars
                .Builder("Desaf")
                .Make("Mecerdes Benz")
                .Model("S 500")
                .year("2016")
                .Colour("Black")
                .build();

        Assert.assertEquals(cars.getYear(), "2016");
    }

    @Test
    public void UpdateCar() throws Exception {
        Cars cars = new Cars
                .Builder("Desaf")
                .Make("Mecerdes Benz")
                .Model("S 500")
                .year("2016")
                .Colour("Black")
                .build();

        Cars newCar = new Cars
                .Builder("BMW")
                .copy(cars)
                .year("2010")
                .build();

        Assert.assertEquals(newCar.getYear(),"2010");

    }

}
