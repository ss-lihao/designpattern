package responsibility;


public class ClientTest {
    /**
     * 责任链模式
     * @param args
     */
    public static void main(String[] args) {
        AbLogger loggerChain = LoggerChain.getLoggerChain();
        loggerChain.logMessage(LoggerChain.DEBUG,"这是一条记录调试日志");
        loggerChain.logMessage(LoggerChain.INFO,"这是一条普通调试日志");
        loggerChain.logMessage(LoggerChain.WARM,"这是一条警告日志");
        loggerChain.logMessage(LoggerChain.ERROR,"这是一条一场日志");
    }
}
