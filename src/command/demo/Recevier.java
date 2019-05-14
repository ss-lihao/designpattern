package command.demo;

/**
 * 命令实际执行类------厨师（框架内部，不应该对外展示开放）
 * 如果，没有Recevier,用ConcreteCommand类执行具体命令，则与策略模型相同
 */
public class Recevier {
    public void doA() {
        System.out.println("执行A...");
    }

    public void doB() {
        System.out.println("执行B...");
    }
}
