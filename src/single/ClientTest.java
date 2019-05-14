package single;

public class ClientTest {
    /**
     * 单例模式
     * @param args
     */
    public static void main(String[] args) {
        SingleDemo demo1 = SingleDemo.getInstance();
        demo1.setCount(2);
        System.out.println("demo1-count="+demo1.getCount());
        SingleDemo demo2 = SingleDemo.getInstance();
        demo2.setCount(3);
        System.out.println("demo2-count="+demo1.getCount()+", demo1-count="+demo1.getCount());
        System.out.println("demo2 == demo1:"+(demo1==demo2));
    }
}
