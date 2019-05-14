package command.compressplus;


/**
 * zip格式压缩
 */
public  class UncompressCommand extends AbCompressCommand {

    public UncompressCommand(String fileName) {
        super(fileName);
    }

    @Override
    void excute() {
        super.excute();
        compressRecevier.uncompress();
    }
}
