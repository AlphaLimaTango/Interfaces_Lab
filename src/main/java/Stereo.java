import components.CDPlayer;
import components.Radio;

public class Stereo {

    private Radio radio;
    private CDPlayer cdPlayer;

    public Stereo(Radio radio, CDPlayer cdPlayer) {
        this.radio = radio;
        this.cdPlayer = cdPlayer;
    }

    public Radio getRadio() {
        return radio;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }
}
