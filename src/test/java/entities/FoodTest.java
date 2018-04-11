package entities;

import exception.NoFormatNameException;
import exception.NonAbsoluteNumberException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class FoodTest {

    private Food food;


    @Before
    public void init() throws Exception {
        food = new Food();
        food.setName("fraise");
        food.setCalories(200F);
    }

    @Test
    public void testFood() throws Exception {
        Assert.assertNotNull(food);
        Food food1 = new Food();
        food1.setName("fraise");
        food1.setCalories(200F);
        Assert.assertNotNull(food1);
        assertEquals(food1.getCalories(), 200F,0);
        assertNotEquals(food1.getName(), "fraise");
        assertEquals(food1.getName(), "FRAISE");
    }

    @Test
    public void testGetName(){
        assertEquals(food.getName(), "FRAISE");
    }

    @Test
    public void testGetCalories(){
        assertEquals(food.getCalories(), 200F, 0);
    }

    @Test
    public void testSetCalories() throws Exception {
        food.setCalories(150F);
        assertEquals(food.getCalories(), 150F,0);
    }
    @Test(expected = NonAbsoluteNumberException.class)
    public void testSetCaloriesException() throws Exception {
        food.setCalories(-50F);
    }

    @Test
    public void testSetName() throws Exception {
        food.setName("FRAISE");
        assertEquals(food.getName(), "FRAISE");
    }

    @Test(expected = NoFormatNameException.class)
    public void setNameException() throws Exception {
        food.setName("Samuel83");
    }

}
