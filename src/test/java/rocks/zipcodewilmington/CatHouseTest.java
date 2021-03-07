package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    Date burf = new Date();
    Date birth = new Date();
    Cat dumbCat=AnimalFactory.createCat("Aria",burf);
    Cat otherCat= new Cat("Ryu",birth,9001);
    CatHouse meowPlace=new CatHouse();

    @Test
    public void catAddTest(){
        Date burf = new Date();
        Date birth = new Date();
        Cat dumbCat=AnimalFactory.createCat("Aria",burf);
        Cat otherCat= new Cat("Ryu",birth,9001);
        CatHouse meowPlace=new CatHouse();
        meowPlace.add(dumbCat);
        meowPlace.add(otherCat);
        Integer expect=2;
        Integer actual = meowPlace.getNumberOfCats();
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void catGetIdTest(){
        Date burf = new Date();
        Date birth = new Date();
        Cat dumbCat=AnimalFactory.createCat("Aria",burf);
        Cat otherCat= new Cat("Ryu",birth,9001);
        CatHouse meowPlace=new CatHouse();
        meowPlace.add(dumbCat);
        meowPlace.add(otherCat);
        Assert.assertEquals(otherCat, meowPlace.getCatById(9001));
    }
    @Test
    public void removeTest(){
        Date burf = new Date();
        Date birth = new Date();
        Cat dumbCat=AnimalFactory.createCat("Aria",burf);
        Cat otherCat= new Cat("Ryu",birth,9001);
        CatHouse meowPlace=new CatHouse();
        meowPlace.add(dumbCat);
        meowPlace.add(otherCat);
        meowPlace.remove(dumbCat);
        Integer expect =1;
        Assert.assertEquals(expect,meowPlace.getNumberOfCats());
    }
    @Test
    public void removeByIdTest(){
        Date burf = new Date();
        Date birth = new Date();
        Cat dumbCat=AnimalFactory.createCat("Aria",burf);
        Cat otherCat= new Cat("Ryu",birth,9001);
        CatHouse meowPlace=new CatHouse();
        meowPlace.add(dumbCat);
        meowPlace.add(otherCat);
        meowPlace.remove(9001);
        Integer expect =1;
        Assert.assertEquals(expect,meowPlace.getNumberOfCats());
    }

}
