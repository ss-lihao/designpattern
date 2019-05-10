package adapter.productcar;

/**
 * 适配者抽象类：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类包好了客户希望的业务方法。
 */
public interface ICarProduction {
    void assemble();
    void makeColor();
    void safeTest();
}
