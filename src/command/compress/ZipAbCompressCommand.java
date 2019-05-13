package command.compress;

/**
 * zip格式压缩
 */
public  class ZipAbCompressCommand extends AbCompressCommand {
    @Override
    void excute() {
        zipCompressRecevier.compress();
    }
}
