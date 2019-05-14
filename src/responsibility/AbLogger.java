package responsibility;

/**
 * 抽象记录类
 */
public abstract class AbLogger {
    private int level;

    public AbLogger(int level) {
        this.level = level;
    }

    AbLogger nextLogger;//下一个处理器

    public void setNextLogger(AbLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (level >= this.level) {
            System.out.print("日志等级:"+level+"\t");
            write(message);
        }
        if (null != nextLogger) {
            //无论上面的条件满足与否，均发派至责任链的下一环,
            // 注意是nextLogger.logMessage(),而不是logMessage()
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
