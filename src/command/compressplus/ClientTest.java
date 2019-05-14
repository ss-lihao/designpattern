package command.compressplus;



public class ClientTest {
    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {
        CompressInvoker invoker = new CompressInvoker(new UncompressCommand("y.zip"));
        invoker.excute();
    }
}
