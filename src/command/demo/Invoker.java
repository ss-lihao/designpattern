package command.demo;

/**
 * 被调用者：命令的请求者和调用者
 */
public class Invoker {
    private ICommand command;
    public Invoker(ICommand command) {
        this.command = command;
    }
    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void execute(){
        command.execute();
    }
}
