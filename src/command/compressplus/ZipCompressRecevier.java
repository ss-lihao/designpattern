package command.compressplus;

public class ZipCompressRecevier implements ICompressRecevier {
    @Override
    public void compress() {
        System.out.println("zip格式压缩");
    }

    @Override
    public void uncompress() {
        System.out.println("zip格式解压");
    }
}
