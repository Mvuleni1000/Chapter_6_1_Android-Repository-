package za.ac.cput.cardealershipparts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import za.ac.cput.cardealershipparts.Domain.CarDealerShipShop;
import za.ac.cput.cardealershipparts.FactoryTest.CarDealerShipTest;
import za.ac.cput.cardealershipparts.FactoryTest.CarTest;
import za.ac.cput.cardealershipparts.FactoryTest.DepartmentTest;
import za.ac.cput.cardealershipparts.FactoryTest.PartsTest;
import za.ac.cput.cardealershipparts.FactoryTest.PersonTest;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */


    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            CarDealerShipTest.class,
            CarTest.class,
            DepartmentTest.class,
            PersonTest.class,
            PartsTest.class})
    public class TestSuitUnitTest {}
