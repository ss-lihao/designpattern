package responsibility;

/**
 * 具体记录类
 * 控制台记录
 */
public class ConsoleLogger extends AbLogger {
    public ConsoleLogger() {
        super(LoggerChain.INFO);
    }

    @Override
    void write(String message) {
        System.out.println("日志在控制台输出...");
    }
}
