package tactics;


public class ClientTest {
    /**
     * 策略模式
     */
    public static void main(String[] args) {
        String today = "雷雨";
        String tomorrow = "晴转多云";
        //原始写法
      /**  System.out.println("今天：");
        if (today.contains("雨")) {
            //如果业务或者判断条件复杂 ,则代码冗长可读性极差
            System.out.println("下雨了!");
            System.out.println("需要打伞!");
        }else{
            System.out.println("没下雨!");
            System.out.println("不需要打伞!");
        }
        System.out.println("明天：");
        if (tomorrow.contains("雨")) {
            //如果业务或者判断条件复杂 ,则代码冗长可读性极差
            System.out.println("下雨了!");
            System.out.println("需要打伞!");
        }else{
            System.out.println("没下雨!");
            System.out.println("不需要打伞!");
        }**/
        //策略模式
        //初始化管理类
        WeatherContext context = new WeatherContext(today);
        IWeather todayWeather = context.getWeather();
        System.out.println("今天：");
        todayWeather.isRain();
        todayWeather.umbrella();
        //切换 策略实体类
        context.setWeatherStr(tomorrow);
        IWeather tomorrowWeather = context.getWeather();
        System.out.println("明天：");
        tomorrowWeather.isRain();
        tomorrowWeather.umbrella();

    }


}
