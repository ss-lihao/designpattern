package proxy.staticproxy;

/**
 * 装饰器模式
 */
public class AdornerProxy implements ISubject {
    ISubject ISubject;
    public AdornerProxy(ISubject ISubject){
        //与静态代理的区别就在于这里了，静态代理直接在构造器中实例化被代理对象，而装饰器模式则是通过传参赋值被代理对象的。
        this.ISubject = ISubject;
    }
    @Override
    public void action() {
        System.out.println("装饰器模式：");
        System.out.println("action 执行前");
        ISubject.action();
        System.out.println("action 执行后");
    }

}
