package command.demo;

/**
 * 命令实现类
 */
public class ConcreteCommandA implements ICommand{

    Recevier recevier;

    public ConcreteCommandA(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        recevier.doA();
    }
}
