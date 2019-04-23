import data.IntegerData;
import data.NumericData;
import processor.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

/**
 * Created by alour on 23/04/2019.
 */
public class Main {
    public static void main(String[] args) {
        List<NumericData> numericDataList = createNumericDataList(20, 49, 101, 120);
        System.out.printf("Before: %s\n", numericDataList);

        NumericDataListProcessor numericDataListProcessor = createNumericDataListProcessor(
                new BigNumericDataProcessor(),
                new ShortNumericDataProcessor(),
                new DummyNumericDataProcessor()
        );
        numericDataListProcessor.process(numericDataList);

        System.out.printf("After: %s", numericDataList);
    }

    private static NumericDataListProcessor createNumericDataListProcessor(NumericDataProcessor... processors) {
        return new NumericDataListProcessor(processors);
    }

    private static List<NumericData> createNumericDataList(int... values) {
        return new ArrayList<>(createNumericDataElements(values));
    }

    private static List<NumericData> createNumericDataElements(int... values) {
        return stream(values).mapToObj(IntegerData::new).collect(toList());
    }
}
