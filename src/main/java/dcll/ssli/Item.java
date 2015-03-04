package dcll.ssli;

/**
 * Created by Skander on 27/02/2015.
 */
public class Item {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Item(Object value) {
        this.value = value;
    }
}
