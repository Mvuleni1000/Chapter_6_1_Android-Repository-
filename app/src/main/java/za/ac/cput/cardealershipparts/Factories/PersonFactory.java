package za.ac.cput.cardealershipparts.factories;

import za.ac.cput.cardealershipparts.Domain.Customer;
import za.ac.cput.cardealershipparts.Domain.Employee;
import za.ac.cput.cardealershipparts.Domain.Person;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class PersonFactory {

    private static PersonFactory personFactory = null;
    private PersonFactory() {
    }
    public static PersonFactory getPersonFactoryinstance() {
        if (personFactory == null)
            return new PersonFactory();
        return personFactory;
    }
    public Person userType(String person) {
        if ("Employee".equalsIgnoreCase(person)) {
            return new Employee();
        } else {
            return new Customer();
        }
    }
}
