package adapter.productcar;

/**
 * 适配器类：它可以调用另一个接口，作为一个转换器，对适配者(ICarProduction)和目标类(BaseCar)进行适配。它是适配器模式的核心。
 */
public class CarAdapter extends AbBaseCar {
    ICarProduction production;
    //将对象传参的方式，称作对象适配，还有一种方式是类适配，做法是CarAdapter 实现ICarProduction接口
    public CarAdapter(ICarProduction production){
        this.production = production;
    }
    @Override
    void product() {
        production.assemble();
        production.makeColor();
        production.safeTest();
        System.out.println("车辆生产完成");
    }

}
