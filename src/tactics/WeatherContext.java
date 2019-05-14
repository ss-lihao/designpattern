package tactics;

/**
 * 管理类或环境类 ，用于管理策略实体类之间的切换
 * 天气切换的管理类
 */
public class WeatherContext {
    public WeatherContext(String weatherStr) {
        this.weatherStr = weatherStr;
    }

    private String weatherStr;

    private IWeather weather;


    public IWeather getWeather() {
        if (null == weather) {
            initWeather();
        }

        return weather;
    }

    /**
     * 雨天和晴天两种决策
     */
    public void initWeather() {
        if (weatherStr.contains("雨")) {
            weather = new Rain();
        } else {
            weather = new Sunny();
        }
    }

    public void setWeatherStr(String weatherStr) {
        this.weatherStr = weatherStr;
        initWeather();
    }
    public String getWeatherStr() {
        return weatherStr;
    }

    public void setWeather(IWeather weather) {
        this.weather = weather;
    }
}
