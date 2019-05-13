package command.compress;

/**
 * zip格式压缩
 */
public  class GZipAbCompressCommand extends AbCompressCommand {
    @Override
    void excute() {
        gZipCompressRecevier.compress();
    }
}
