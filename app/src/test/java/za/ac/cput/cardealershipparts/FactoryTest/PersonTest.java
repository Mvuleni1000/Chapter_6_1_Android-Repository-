package za.ac.cput.cardealershipparts.FactoryTest;

import org.junit.Assert;
import org.junit.Test;

import za.ac.cput.cardealershipparts.factories.PersonFactory;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class PersonTest {

    private PersonFactory personFactory;

    @Test
    public void createPerson() throws Exception {

        personFactory = PersonFactory.getPersonFactoryinstance();
        Assert.assertNotNull(personFactory);
    }

    @Test
    public void updatePerson() throws Exception {

        personFactory = PersonFactory.getPersonFactoryinstance();
        Assert.assertNotNull(personFactory);
    }
}
