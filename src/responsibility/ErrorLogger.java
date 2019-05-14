package responsibility;
/**
 * 具体记录类
 * 异常记录
 */
public class ErrorLogger extends AbLogger {
    public ErrorLogger() {
        super(LoggerChain.ERROR);
    }

    @Override
    void write(String message) {
        System.out.println("日志在异常记录输出...");
    }
}
