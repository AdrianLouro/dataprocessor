package processor;

import data.NumericData;

/**
 * Created by alour on 23/04/2019.
 */
public interface NumericDataProcessor {
    void process(NumericData data);

    boolean canProcess(NumericData data);
}
