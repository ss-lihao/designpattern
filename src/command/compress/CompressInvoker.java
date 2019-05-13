package command.compress;

public class CompressInvoker {
    public CompressInvoker(AbCompressCommand abCompressCommand) {
        this.abCompressCommand = abCompressCommand;
    }
    AbCompressCommand abCompressCommand;
    public void excute(){
        abCompressCommand.excute();
    }
}
