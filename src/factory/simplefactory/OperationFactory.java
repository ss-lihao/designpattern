package factory.simplefactory;

public class OperationFactory {
    public static IOperation createOperation(String type) {
        IOperation operation = null;
        switch (type) {
            case "+":
                operation =  new AddOperation();
                break;
            case "-":
                operation= new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            default:
                operation =  new DevOperation();
        }
        return operation;
    }
}
