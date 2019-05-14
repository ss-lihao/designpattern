package command.compressplus;

public class GZipCompressRecevier implements ICompressRecevier {
    @Override
    public void compress() {
        System.out.println("Gzip格式压缩");
    }

    @Override
    public void uncompress() {
        System.out.println("Gzip格式解压");
    }
}
