package command.compressplus;



public class ClientTest {
    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {

        CompressInvoker<ZipCompressRecevier> invoker = new CompressInvoker(new CompressCommand(ZipCompressRecevier.class));
        invoker.excute();
    }
}
