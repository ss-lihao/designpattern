package factory.simplefactory;

public class AddOperation implements IOperation {
    @Override
    public int getResult(int... set) {
        if(null==set)return 0;
        int result = 0;
        for (int item : set) {
            result = result + item;
        }
        return result;
    }
}
