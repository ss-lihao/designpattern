package command.demo;

/**
 * 命令实现类------具体哪一道菜
 */
public class ConcreteCommandB implements ICommand {
    // 不能把recevier（厨师）暴露
//    public ConcreteCommandB(Recevier recevier) {
//        this.recevier = recevier;
//    }
    public ConcreteCommandB() {

    }

    @Override
    public void execute() {
        recevier.doB();
    }
}
