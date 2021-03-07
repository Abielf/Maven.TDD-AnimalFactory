package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }



    @Test
    public void dogAddTest(){
        Date burf = new Date();
        Date birth = new Date();
        Dog dumbDog=AnimalFactory.createDog("italy",burf);
        Dog otherDog= new Dog("Sandy",birth,9001);
        DogHouse kennel=new DogHouse();
        kennel.add(dumbDog);
        kennel.add(otherDog);
        Integer expect=2;
        Integer actual = kennel.getNumberOfDogs();
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void dogGetIdTest(){
        Date burf = new Date();
        Date birth = new Date();
        Dog dumbDog=AnimalFactory.createDog("italy",burf);
        Dog otherDog= new Dog("Sandy",birth,9001);
        DogHouse kennel=new DogHouse();
        kennel.add(dumbDog);
        kennel.add(otherDog);
        Assert.assertEquals(otherDog, kennel.getDogById(9001));
    }
    @Test
    public void removeTest(){
        Date burf = new Date();
        Date birth = new Date();
        Dog dumbDog=AnimalFactory.createDog("italy",burf);
        Dog otherDog= new Dog("Sandy",birth,9001);
        DogHouse kennel=new DogHouse();
        kennel.add(dumbDog);
        kennel.add(otherDog);
        kennel.remove(dumbDog);
        Integer expect =1;
        Assert.assertEquals(expect,kennel.getNumberOfDogs());
    }
    @Test
    public void removeByIdTest(){
        Date burf = new Date();
        Date birth = new Date();
        Dog dumbDog=AnimalFactory.createDog("italy",burf);
        Dog otherDog= new Dog("Sandy",birth,9001);
        DogHouse kennel=new DogHouse();
        kennel.add(dumbDog);
        kennel.add(otherDog);
        kennel.remove(9001);
        Integer expect =1;
        Assert.assertEquals(expect,kennel.getNumberOfDogs());
    }

}

