package proxy.staticproxy;

public class ClientTest {
    /**
     * 静态代理和装饰器模式，二者非常相似，稍有区别
     * @param args
     */
    public static void main(String[] args) {
        //静态代理和装饰器模式非常相似
        //静态代理
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.action();
        //装饰器模式
        ISubject ISubject = new RealISubject();
        AdornerProxy adornerProxy = new AdornerProxy(ISubject);
        adornerProxy.action();
    }
}
