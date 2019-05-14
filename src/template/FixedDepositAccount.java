package template;
/**
 * 模板模式：具体(concrete)模板类
 * 定期存款
 */
public class FixedDepositAccount extends AbAccount{
    @Override
    int getAccountType() {
        return 0;
    }

    @Override
    double getAccountInterest() {
        return 0.6;
    }
}
