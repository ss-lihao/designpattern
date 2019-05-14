package responsibility;
/**
 * 具体记录类
 * 文件记录
 */
public class FileLogger extends AbLogger {
    public FileLogger() {
        super(LoggerChain.DEBUG);
    }

    @Override
    void write(String message) {
        System.out.println("日志在文件记录输出...");
    }
}
