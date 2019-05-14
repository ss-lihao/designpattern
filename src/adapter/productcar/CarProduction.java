package adapter.productcar;

/**
 * 适配者实现类：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类包好了客户希望的业务方法。
 */
public class CarProduction implements ICarProduction {
    @Override
    public void assemble() {
        System.out.println("装配汽车组件");
    }

    @Override
    public void makeColor() {
        System.out.println("喷漆");
    }

    @Override
    public void safeTest() {
        System.out.println("安全测试");
    }
}
