package proxy.staticproxy;

/**
 * 静态代理
 */
public class StaticProxy implements ISubject {
    private ISubject ISubject;
    public StaticProxy(){
        //与装饰器模式的区别就在于这里了，静态代理直接在构造器中实例化被代理对象，而装饰器模式则是通过传参赋值被代理对象的。
        ISubject = new RealISubject();
    }
    @Override
    public void action() {
        System.out.println("静态代理：");
        System.out.println("action 执行前");
        ISubject.action();
        System.out.println("action 执行后");
    }

}
