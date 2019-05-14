package command.compressplus;


public abstract class AbCompressCommand {
    //不能把Recevier暴露出来
    private ZipCompressRecevier zipCompressRecevier = new ZipCompressRecevier();
    private GZipCompressRecevier gZipCompressRecevier = new GZipCompressRecevier();
    protected ICompressRecevier compressRecevier;
    String fileName;

    public AbCompressCommand(String fileName) {
        this.fileName = fileName;
    }

    void excute() {
        if(fileName.endsWith("gzip")||fileName.endsWith("GZIP")){
            compressRecevier = gZipCompressRecevier;
        }else{
            compressRecevier = zipCompressRecevier;
        }
    }
}
