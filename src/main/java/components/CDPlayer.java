package components;

import components.Component;

public class CDPlayer extends Component {

    public CDPlayer(Make make, Model model) {
        super(make, model);
    }

    public String play() {
        return "Play song";
    }
}
