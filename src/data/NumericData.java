package data;

/**
 * Created by alour on 23/04/2019.
 */
public interface NumericData {
    Object value();

    void value(Object value);

    void incrementBy(Integer value);

    void decreaseBy(Integer value);

    boolean isBiggerThan(Integer value);

    boolean isShorterThan(Integer value);
}
