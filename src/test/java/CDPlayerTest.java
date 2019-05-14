import components.CDPlayer;
import components.Component;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer(Component.Make.JVC, Component.Model.VCS);
    }

    @Test
    public void canGetMake() {
        assertEquals(Component.Make.JVC, cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals(Component.Model.VCS, cdPlayer.getModel());
    }

    @Test
    public void canPlay() {
        cdPlayer.play();
        assertTrue(cdPlayer.isPlaying());
    }

}
