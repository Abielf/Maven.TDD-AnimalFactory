package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` (DONE)
    // TODO - Create tests for `speak` (DONE)
    // TODO - Create tests for `setBirthDate(Date birthDate)`(Done)
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
            String expected="Tony";
            Date burf= new Date();
            Cat tiger= new Cat("Jimmy",burf,0);
            tiger.setName("Tony");
            Assert.assertEquals(expected, tiger.getName());
    }
    @Test
    public void setNameTest1(){
        String expected="";
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        tiger.setName("");
        Assert.assertEquals(expected, tiger.getName());
    }
    @Test
    public void setNameTest2(){
        String expected=">_<  77";
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        tiger.setName(">_<  77");
        Assert.assertEquals(expected, tiger.getName());
    }

    @Test
    public void speakTest(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        Assert.assertEquals("meow!", tiger.speak());
    }
    @Test
    public void setBurf(){
        Date burf= new Date();
        Date birth = new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        tiger.setBirthDate(birth);
        Assert.assertEquals(birth, tiger.getBirthDate());
    }
    @Test
    public void nomNomNom(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        Food tuna=new Food();
        tiger.eat(tuna);
        Integer expected=1;
        Assert.assertEquals(expected, tiger.getNumberOfMealsEaten());
    }
    @Test
    public void nomNomNom2(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        Food tuna=new Food();
        tiger.eat(tuna);
        tiger.eat(tuna);
        tiger.eat(tuna);
        Integer expected=3;
        Assert.assertEquals(expected, tiger.getNumberOfMealsEaten());
    }
    @Test
    public void idgettertest(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,8675309);
        Integer expected=8675309;
        Assert.assertEquals(expected, tiger.getId());
    }
    @Test
    public void idgettertest2(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        Integer expected=0;
        Assert.assertEquals(expected, tiger.getId());
    }

    @Test
    public void mammelTest(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        Boolean expected = true;
        Assert.assertEquals(expected, tiger instanceof Mammal);
    }

    @Test
    public void animalTest(){
        Date burf= new Date();
        Cat tiger= new Cat("Jimmy",burf,0);
        Boolean expected = true;
        Assert.assertEquals(expected, tiger instanceof Animal);
    }

}
