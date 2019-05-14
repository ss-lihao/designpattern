package factory.simplefactory;


public class ClientTest {
    /**
     * 简单工厂模式
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("加的结果="+OperationFactory.createOperation("+").getResult(5,2,1));
        System.out.println("减的结果="+OperationFactory.createOperation("-").getResult(5,2,1));
        System.out.println("乘的结果="+OperationFactory.createOperation("*").getResult(48,16,1));
        System.out.println("除的结果="+OperationFactory.createOperation("/").getResult(48,16,1));
    }
}
