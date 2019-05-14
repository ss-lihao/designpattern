package command.compress;

/**
 * zip格式解压
 */
public  class ZipUncompressCommand extends AbCompressCommand {
    @Override
    void excute() {
        zipCompressRecevier.uncompress();
    }
}
