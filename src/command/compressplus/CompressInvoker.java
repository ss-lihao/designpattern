package command.compressplus;


public class CompressInvoker<T extends ICompressRecevier>  {
    public CompressInvoker(AbCompressCommand<T> AbCompressCommand) {
        this.AbCompressCommand = AbCompressCommand;
    }
    AbCompressCommand AbCompressCommand;
    public void excute(){
        AbCompressCommand.excute();
    }
}
