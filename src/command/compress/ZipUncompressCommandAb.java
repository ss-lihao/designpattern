package command.compress;

/**
 * zip格式压缩
 */
public  class ZipUncompressCommandAb extends AbCompressCommand {
    @Override
    void excute() {
        zipCompressRecevier.uncompress();
    }
}
