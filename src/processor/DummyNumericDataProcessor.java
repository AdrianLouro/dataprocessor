package processor;

import data.NumericData;

/**
 * Created by alour on 23/04/2019.
 */
public class DummyNumericDataProcessor implements NumericDataProcessor {
    @Override
    public void process(NumericData data) {
    }

    @Override
    public boolean canProcess(NumericData data) {
        return true;
    }

}
