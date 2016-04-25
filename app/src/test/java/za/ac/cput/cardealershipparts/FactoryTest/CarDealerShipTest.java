package za.ac.cput.cardealershipparts.FactoryTest;

import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.cardealershipparts.Domain.CarDealerShipShop;


/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarDealerShipTest {

    @Test
    public void carDealerShip() throws Exception {
        CarDealerShipShop car = new CarDealerShipShop
                .Builder("Cape town Branch")
                .location("Plein Street")
                .carAvailable("300 Cars Available")
                .build();

        Assert.assertEquals(car.getLocation(), "Plein Street");
    }

    @Test
    public void UpdateCar() throws Exception {
        CarDealerShipShop car = new CarDealerShipShop
                .Builder("Cape town Branch")
                .location("Plein Street")
                .carAvailable("300 Cars Available")
                .build();

        CarDealerShipShop newCar = new CarDealerShipShop
                .Builder("Cape town Branch")
                .location("Plein Street")
                .carAvailable("200 Cars Available")
                .build();

        Assert.assertEquals(newCar.getCarAvailable(),"200 Cars Available");
    }
}
