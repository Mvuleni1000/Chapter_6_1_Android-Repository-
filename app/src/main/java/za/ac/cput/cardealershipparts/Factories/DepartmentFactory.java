package za.ac.cput.cardealershipparts.Factories;

import za.ac.cput.cardealershipparts.Domain.Department;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class DepartmentFactory {

    public static Department createDepartment(String buildName, String Street, String Area, String Floor)
    {
        Department car = new Department
                .Builder(buildName)
                .Street(Street)
                .Area(Area)
                .Floor(Floor)
                .build();

        return car;
    }
}
