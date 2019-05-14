package tactics;

/**
 * 策略模式 ：策略抽象类
 * 天气相关行为的公共抽象类
 */
public interface IWeather {
    /**
     * 是否下雨
     *
     * @return true 下雨，false 未下雨
     */
    boolean isRain();

    /**
     * 是否需要打伞
     *
     * @return true 需要打伞 false 无需打伞
     */
    boolean umbrella();

    //便于拓展


}
