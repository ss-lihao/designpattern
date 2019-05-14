package command.compress;

/**
 * gzip格式压缩
 */
public  class GZipCompressCommand extends AbCompressCommand {
    @Override
    void excute() {
        gZipCompressRecevier.compress();
    }
}
