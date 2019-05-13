package command.demo;

/**
 * 命令实现类
 */
public class ConcreteCommandB implements ICommand{

    Recevier recevier;

    public ConcreteCommandB(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        recevier.doB();
    }
}
