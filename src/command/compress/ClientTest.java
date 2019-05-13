package command.compress;


public class ClientTest {
    /**
     * 命令模式
     * @param args
     */
    public static void main(String[] args) {
        ZipUncompressCommandAb command = new ZipUncompressCommandAb();
        CompressInvoker invoker = new CompressInvoker(command);
        invoker.excute();
    }
}
