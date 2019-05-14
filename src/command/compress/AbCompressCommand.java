package command.compress;

public abstract class AbCompressCommand {
    protected ZipCompressRecevier zipCompressRecevier = new ZipCompressRecevier();
    protected GZipCompressRecevier gZipCompressRecevier = new GZipCompressRecevier();
    abstract void excute();
}
