package processor;

import data.NumericData;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;
import static java.util.stream.Collectors.toList;

/**
 * Created by alour on 23/04/2019.
 */
public class NumericDataListProcessor {

    private List<NumericDataProcessor> numericDataProcessors = new ArrayList<>();

    public NumericDataListProcessor(NumericDataProcessor... numericDataprocessors) {
        addAll(this.numericDataProcessors, numericDataprocessors);
    }

    public void process(List<NumericData> dataList) {
        dataList.forEach(numericDataElement ->
                this.findDataProcessorFor(numericDataElement).process(numericDataElement)
        );
    }

    private NumericDataProcessor findDataProcessorFor(NumericData numericData) {
        return this.numericDataProcessors.stream().
                filter(numericDataProcessor -> numericDataProcessor.canProcess(numericData))
                .collect(toList())
                .get(0);
    }
}
