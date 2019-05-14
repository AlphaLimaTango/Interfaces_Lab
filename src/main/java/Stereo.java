import components.CDPlayer;
import components.Radio;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Stereo {

    private Radio radio;
    private CDPlayer cdPlayer;
    private double volume;

    public Stereo(Radio radio, CDPlayer cdPlayer) {
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.volume = 1.0;
    }

    public Radio getRadio() {
        return radio;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void raiseVolume(double number) {
        this.volume += number;
    }

    public double getVolume() {
        return this.volume;
    }

    public void lowerVolume(double number) {
        this.volume -= number;
    }

    public void playCD(){
        cdPlayer.play();
    }

}
