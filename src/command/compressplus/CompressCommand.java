package command.compressplus;


/**
 * zip格式压缩
 */
public  class CompressCommand extends AbCompressCommand {


    public CompressCommand(String fileName) {
        super(fileName);
    }

    @Override
    void excute() {
        super.excute();
        compressRecevier.compress();
    }
}
