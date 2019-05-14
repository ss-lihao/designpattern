package command.demo;


public class ClientTest {
    /**
     * 命令模式
     *
     * @param args
     */
    public static void main(String[] args) {
        //不能把recevier（厨师）暴露
//        Recevier recevier = new Recevier();
//        Invoker invoker = new Invoker(new ConcreteCommandA(recevier));
        Invoker invoker = new Invoker(new ConcreteCommandA());
        invoker.execute();
//不能把recevier（厨师）暴露
//        invoker.setCommand(new ConcreteCommandB(recevier));
        invoker.setCommand(new ConcreteCommandB());
        invoker.execute();

    }
}
