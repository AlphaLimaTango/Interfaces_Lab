package components;

public abstract class Component {

    public enum Make {
        JVC,
        SONY,
        WALKMAN
    }

    public enum Model {
        VCS,
        TDD,
        OOP
    }

    private Make make;
    private Model model;

    public Component(Make make, Model model) {
        this.make = make;
        this.model = model;
    }

    public Make getMake() {
        return make;
    }

    public Model getModel() {
        return model;
    }
}
