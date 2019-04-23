package processor;

import data.NumericData;

/**
 * Created by alour on 23/04/2019.
 */
public class BigNumericDataProcessor implements NumericDataProcessor {
    @Override
    public void process(NumericData data) {
        data.incrementBy(1);
    }

    @Override
    public boolean canProcess(NumericData data) {
        return data.isBiggerThan(100);
    }

}
