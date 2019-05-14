package factory.simplefactory;

public class MulOperation implements IOperation {
    @Override
    public int getResult(int... set) {
        if(null==set)return 0;
        int result = set.length>0?1:0;
        for (int item : set) {
            result = result * item;
        }
        return result;
    }
}
