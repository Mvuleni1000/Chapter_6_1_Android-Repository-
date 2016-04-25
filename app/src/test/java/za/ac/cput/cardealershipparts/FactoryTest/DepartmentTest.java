package za.ac.cput.cardealershipparts.FactoryTest;

import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.cardealershipparts.Domain.Department;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class DepartmentTest {

    @Test
    public void createDepartment() throws Exception {

        Department car = new Department
                .Builder("HillTop")
                .Street("CapeStreet")
                .Area("11A bloem")
                .Floor("10th")
                .build();

        Assert.assertEquals(car.getFloor(),"10th");
    }

    @Test
    public void updateDepartment() throws Exception {


        Department car = new Department
                .Builder("HillTop")
                .Street("CapeStreet")
                .Area("11A bloem")
                .Floor("10th")
                .build();

        Department departments = new Department
                .Builder("BMW")
                .copy(car)
                .Floor("7th")
                .build();

        Assert.assertEquals(departments.getFloor(),"7th");
    }

}
