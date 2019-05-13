package command.compressplus;


/**
 * zip格式压缩
 */
public  class UncompressCommand extends AbCompressCommand {


    public UncompressCommand(Class aClass) {
        super(aClass);
    }

    @Override
    void excute() {
        compressRecevier.uncompress();
    }
}
