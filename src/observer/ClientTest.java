package observer;


public class ClientTest {
    /**
     * 观察者模式又发布/订阅模式
     * @param args
     */
    public static void main(String[] args) {
        final String ACTION_HELLO = "hello";
        final String ACTION_WEATHER = "weather";
        //观察者模式，又叫发布/订阅者模式，包含：发布者Subject（又被观察者Observable）和订阅者Subscribe(又观察者Observer)
        //打招呼
        final Subject subject = new Subject();
        IObserver observer = new IObserver() {
            @Override
            public void update(Object... set) {
                String says = (String) set[0];
                String name = (String) set[1];
                System.out.println("发布者说："+says);
                System.out.println("订阅者说：你好，"+name+",我是小刚");
                subject.delObserver(ACTION_HELLO);
                //删除发布者中的观察者之后，再次发布，观察者无法监听
//                subject.notifyObserver(ACTION_HELLO,"你好，我是小明","小明");
            }
        };
        subject.addObserver(ACTION_HELLO,observer);
        subject.notifyObserver(ACTION_HELLO,"你好，我是小明","小明");

        //询问天气
        System.out.println("===============================");
        IObserver observer1 = new IObserver() {
            @Override
            public void update(Object... set) {
                String says = (String) set[0];
                System.out.println("发布者说："+says);
                System.out.println("订阅者说：恩 是啊，"+says);
                subject.delObserver(ACTION_WEATHER);
            }
        };
        subject.addObserver(ACTION_WEATHER,observer1);
        subject.notifyObserver(ACTION_WEATHER,"今天天气不错！");



    }
}
