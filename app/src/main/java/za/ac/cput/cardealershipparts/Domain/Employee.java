package za.ac.cput.cardealershipparts.Domain;

import java.io.Serializable;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class Employee implements Person, Serializable
{
    @Override
    public String getPersonType(String person) {
        return "This is an Employee";
    }
}
