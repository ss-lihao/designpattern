package command.compressplus;


public class CompressInvoker  {
    public CompressInvoker(AbCompressCommand AbCompressCommand) {
        this.AbCompressCommand = AbCompressCommand;
    }
    AbCompressCommand AbCompressCommand;
    public void excute(){
        AbCompressCommand.excute();
    }
}
