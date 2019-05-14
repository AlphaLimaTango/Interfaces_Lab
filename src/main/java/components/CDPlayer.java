package components;

import components.Component;

public class CDPlayer extends Component {

    private boolean isPlaying = false;

    public CDPlayer(Make make, Model model) {
        super(make, model);
    }

    public void play() {
        this.isPlaying = true;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
