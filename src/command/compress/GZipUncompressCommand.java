package command.compress;

/**
 * gzip格式解压
 */
public  class GZipUncompressCommand extends AbCompressCommand {
    @Override
    void excute() {
        gZipCompressRecevier.uncompress();
    }
}
