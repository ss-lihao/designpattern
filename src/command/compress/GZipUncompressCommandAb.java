package command.compress;

/**
 * zip格式压缩
 */
public  class GZipUncompressCommandAb extends AbCompressCommand {
    @Override
    void excute() {
        gZipCompressRecevier.uncompress();
    }
}
