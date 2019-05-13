package command.demo;


public class ClientTest {
    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {
        Recevier recevier = new Recevier();
        Invoker invoker = new Invoker(new ConcreteCommandA(recevier));
        invoker.execute();

        invoker.setCommand(new ConcreteCommandB(recevier));
        invoker.execute();

    }
}
