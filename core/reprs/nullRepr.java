package core.reprs;

public class nullRepr {
    public String value;

    public String type = "null";

    public nullRepr() {
        this.value = "null";
    }

    public String repr(Object context) {
        return value;
    }
}
