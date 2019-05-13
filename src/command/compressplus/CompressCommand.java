package command.compressplus;


/**
 * zip格式压缩
 */
public  class CompressCommand extends AbCompressCommand {

    public CompressCommand(Class aClass) {
        super(aClass);
    }

    @Override
    void excute() {
        compressRecevier.compress();
    }
}
