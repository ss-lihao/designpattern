package adapter.productcar;

/**
 * 目标抽象类:定义客户所需的接口，可以是一个抽象类或接口，也可以是具体类。在类适配器中，由于C#语言不支持多重继承，所以在C#语言中只能是接口。
 */
public abstract class BaseCar {
    abstract void product();
}