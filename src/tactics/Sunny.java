package tactics;

/**
 * 策略实现类
 * 晴天类
 */
public class Sunny implements IWeather {

    @Override
    public boolean isRain() {
        //业务逻辑
        System.out.println("没下雨!");
        return false;
    }

    @Override
    public boolean umbrella() {
        //业务逻辑
        System.out.println("不需要打伞!");
        return false;
    }
}
