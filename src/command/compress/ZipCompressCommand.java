package command.compress;

/**
 * zip格式压缩
 */
public  class ZipCompressCommand extends AbCompressCommand {
    @Override
    void excute() {
        zipCompressRecevier.compress();
    }
}
