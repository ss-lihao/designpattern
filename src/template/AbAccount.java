package template;

/**
 * 模板模式：抽象模板类
 * 账户存款业务
 */
public abstract class AbAccount {
    /**
     * @return 账户类型:0-定期存款，1-活期存款
     */
    abstract int getAccountType();

    /**
     * @return 账户利息
     */
    abstract double getAccountInterest();

    public double calculateInterest(double money, int month, int day) {
        String depositType = "";
        int accountType = getAccountType();
        double interest = getAccountInterest()/100;
        double depositIncome;
        if (accountType == 0) {
            depositType = "定期存款(利息按月计算),利率"+interest+"，存期："+month+"月，";
            depositIncome = money * interest * month;
        } else {
            depositType = "活期存款(利息按天计算),利率"+interest+"，存期："+day+"天，";
            depositIncome = money * interest * day;
        }
        System.out.println("本金："+money+","+depositType+",利息为："+depositIncome);
        return depositIncome;
    }
}
