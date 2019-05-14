package factory.simplefactory;

public class DevOperation implements IOperation {
    @Override
    public int getResult( int... set) {
        if (null == set) return 0;
        int result = 0;
        for (int i = 0; i < set.length; i++) {
            int item = set[i];
            if (i == 0) {
                result = item;
            } else {
                result = result/item;
            }
        }
        return result;
    }
}
