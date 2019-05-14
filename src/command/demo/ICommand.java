package command.demo;

/**
 * 命令抽象类:------每项菜品
 */
public interface ICommand {
    Recevier recevier = new Recevier();
    void execute();
}
