package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void buildAdog(){
        Date burf=new Date();
        Dog canine=new Dog("Lassie",burf,8675309);
        Integer expectedID=8675309;
        Assert.assertEquals("Lassie",canine.getName());
        Assert.assertEquals(burf,canine.getBirthDate());
        Assert.assertEquals(expectedID,canine.getId());
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setNameTest1(){
        String expected="";
        Date burf= new Date();
        Dog wolf= new Dog("RinTinTin",burf,0);
        wolf.setName("");
        Assert.assertEquals(expected, wolf.getName());
    }


    @Test
    public void speakTest(){
        Date burf= new Date();
        Dog wolf= new Dog("Howler",burf,0);
        Assert.assertEquals("bark!", wolf.speak());
    }
    @Test
    public void setBurf(){
        Date birth= new Date();
        Date day = new Date();
        Dog wolf= new Dog("Jimmy",birth,0);
        wolf.setBirthDate(birth);
        Assert.assertEquals(birth, wolf.getBirthDate());
    }
    @Test
    public void nomNomNom(){
        Date burf= new Date();
        Dog wolf= new Dog("Jimmy",burf,0);
        Food bone=new Food();
        wolf.eat(bone);
        Integer expected=1;
        Assert.assertEquals(expected, wolf.getNumberOfMealsEaten());
    }
    @Test
    public void nomNomNom2(){
        Date burf= new Date();
        Dog wolf= new Dog("Jimmy",burf,0);
        Food meat=new Food();
        Food bones=new Food();
        Food treats=new Food();
        wolf.eat(meat);
        wolf.eat(bones);
        wolf.eat(treats);
        wolf.eat(meat);

        Integer expected=4;
        Assert.assertEquals(expected, wolf.getNumberOfMealsEaten());
    }
    @Test
    public void idgettertest1(){
        Date burf= new Date();
        Dog wolf= new Dog("Jimmy",burf,902899999);
        Integer expected=902899999;
        Assert.assertEquals(expected, wolf.getId());
    }
    @Test
    public void idgettertest2(){
        Date burf= new Date();
        Dog wolf= new Dog("Jimmy",burf,0);
        Integer expected=0;
        Assert.assertEquals(expected, wolf.getId());
    }

    @Test
    public void mammelTest(){
        Date burf= new Date();
        Dog wolf= new Dog("Jimmy",burf,0);
        Boolean expected = true;
        Assert.assertEquals(expected, wolf instanceof Mammal);
    }

    @Test
    public void animalTest(){
        Date burf= new Date();
        Dog wolf= new Dog("Jimmy",burf,0);
        Boolean expected = true;
        Assert.assertEquals(expected, wolf instanceof Animal);
    }
}
