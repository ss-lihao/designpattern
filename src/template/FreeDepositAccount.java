package template;

public class FreeDepositAccount extends AbAccount{
    @Override
    int getAccountType() {
        return 1;
    }

    @Override
    double getAccountInterest() {
        return 0.008;
    }
}
