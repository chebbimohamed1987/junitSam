package entities;

import exception.NoFormatNameException;
import exception.NonAbsoluteNumberException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HumanTest {

    private Human human;

    @Before
    public void setUp() throws Exception {
        human = new Human();
        human.setName("samuel");
        human.setMasse(100F);
        human.setTaille(181);
    }

    @Test
    public void human() throws Exception {
        human = new Human();
        human.setName("toto");
        human.setMasse(40F);
        human.setTaille(150);
        assertNotEquals(human.getName(), "toto");
        assertEquals(human.getName(), "TOTO");
        assertEquals(human.getMasse(), 40F, 0);
        assertEquals(human.getTaille(), 150, 0);
    }

    @Test
    public void getName() {
        assertEquals(human.getName(), "SAMUEL");
    }

    @Test
    public void setName() throws Exception {
        human.setName("HenRi");
        assertNotEquals(human.getName(), "Henri");
        assertEquals(human.getName(), "HENRI");
    }
    @Test(expected = NoFormatNameException.class)
    public void setNameException() throws Exception {
        human.setName("HenRi/");
    }

    @Test
    public void getTaille() {
        assertEquals(human.getTaille(), 181, 0);
    }

    @Test
    public void setTaille() throws Exception {
        human.setTaille(195);
        assertEquals(human.getTaille(), 195, 0);
    }

    @Test(expected = NonAbsoluteNumberException.class)
    public void setTailleException() throws Exception {
        human.setTaille(-10);
    }

    @Test
    public void getMasse() {
        assertEquals(human.getMasse(), 100,0);
    }

    @Test
    public void setMasse() throws Exception {
        human.setMasse(95F);
        assertEquals(human.getMasse(), 95F,0);
    }

    @Test(expected = NonAbsoluteNumberException.class)
    public void setMasseException() throws Exception {
        human.setMasse(-50F);
    }
}