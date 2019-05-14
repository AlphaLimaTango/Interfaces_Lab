import components.CDPlayer;
import components.Component;
import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Radio radio;
    CDPlayer cdPlayer;
    Stereo stereo;

    @Before
    public void before(){
        radio = new Radio(Component.Make.SONY, Component.Model.TDD);
        cdPlayer = new CDPlayer(Component.Make.SONY, Component.Model.TDD);
        stereo = new Stereo(radio, cdPlayer);
    }

    @Test
    public void canGetRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void canGetCDPlayer() {
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }

    @Test
    public void canGetVolume() {
        assertEquals(1.0, stereo.getVolume(), 0.01);
    }
    @Test
    public void canRaiseVolume() {
        stereo.raiseVolume(0.5);
        assertEquals(1.5, stereo.getVolume(), 0.01);
    }

    @Test
    public void canLowerVolume(){
        stereo.lowerVolume(0.2);
        assertEquals(0.8 ,stereo.getVolume(), 0.01);

    }
}
