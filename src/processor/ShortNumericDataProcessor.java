package processor;

import data.NumericData;

/**
 * Created by alour on 23/04/2019.
 */
public class ShortNumericDataProcessor implements NumericDataProcessor {
    @Override
    public void process(NumericData data) {
        data.decreaseBy(1);
    }

    @Override
    public boolean canProcess(NumericData data) {
        return data.isShorterThan(50);
    }
}
