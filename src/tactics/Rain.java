package tactics;

/**
 * 策略实现类
 * 下雨类
 */
public class Rain implements IWeather {


    @Override
    public boolean isRain() {
        //业务逻辑
        System.out.println("下雨了!");
        return true;
    }

    @Override
    public boolean umbrella() {
        //业务逻辑
        System.out.println("需要打伞!");
        return true;
    }

}
