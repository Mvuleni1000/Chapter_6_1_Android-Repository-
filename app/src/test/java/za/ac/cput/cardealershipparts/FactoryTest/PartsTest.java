package za.ac.cput.cardealershipparts.FactoryTest;

import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.cardealershipparts.factories.PartsFactory;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class PartsTest {

    PartsFactory partsFactory;
    @Test
    public void checkParts() throws Exception {
        String carModel = PartsFactory.CarModelType("2");
        System.out.print(carModel);

        Assert.assertEquals(carModel, "Mercedes Benz");
    }

}
