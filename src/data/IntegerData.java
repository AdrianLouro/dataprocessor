package data;

/**
 * Created by alour on 23/04/2019.
 */
public class IntegerData implements NumericData {

    Integer value;

    public IntegerData(int value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public void value(Object value) {
        this.value = (Integer) value;
    }

    @Override
    public void incrementBy(Integer value) {
        this.value += value;
    }

    @Override
    public void decreaseBy(Integer value) {
        this.value -= value;
    }

    @Override
    public boolean isBiggerThan(Integer value) {
        return this.value.compareTo(value) > 0;
    }

    @Override
    public boolean isShorterThan(Integer value) {
        return this.value.compareTo(value) < 0;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
