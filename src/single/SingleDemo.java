package single;

/**
 * 单例模式
 */
public class SingleDemo {
    private static SingleDemo instance;
    private int count = 0;

    private SingleDemo() {

    }

    public static SingleDemo getInstance() {
        if (null == instance) {
            instance = new SingleDemo();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
