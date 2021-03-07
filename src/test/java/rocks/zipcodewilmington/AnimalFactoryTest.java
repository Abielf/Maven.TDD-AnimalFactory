package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testDogmaker(){
        Date burf= new Date();

        Dog cowardly=AnimalFactory.createDog("Courage",burf);
        Assert.assertEquals("Courage",cowardly.getName());
        Assert.assertEquals(burf, cowardly.getBirthDate());

    }

    @Test
    public void testCatmaker(){
        Date birth= new Date();

        Cat succotash=AnimalFactory.createCat("Sylvester",birth);
        Assert.assertEquals("Sylvester",succotash.getName());
        Assert.assertEquals(birth, succotash.getBirthDate());

    }
}
