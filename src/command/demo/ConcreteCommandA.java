package command.demo;

/**
 * 命令实现类------具体哪一道菜
 */
public class ConcreteCommandA implements ICommand {
    // 不能把recevier暴露
//    public ConcreteCommandA(Recevier recevier) {
//        this.recevier = recevier;
//    }
    public ConcreteCommandA() {
    }

    @Override
    public void execute() {
        recevier.doA();
    }
}
