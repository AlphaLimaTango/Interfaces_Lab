import components.Component;
import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio(Component.Make.SONY, Component.Model.TDD);
    }

    @Test
    public void canGetMake(){
        assertEquals(Component.Make.SONY, radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals(Component.Model.TDD, radio.getModel());
    }
}
