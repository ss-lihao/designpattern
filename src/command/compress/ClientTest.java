package command.compress;


public class ClientTest {
    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {
        ZipUncompressCommand command = new ZipUncompressCommand();
        CompressInvoker invoker = new CompressInvoker(command);
        invoker.excute();
    }
}
