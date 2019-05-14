package template;

public class ClientTest {
    /**
     * 模板模式
     * @param args
     */
    public static void main(String[] args) {
        FixedDepositAccount account = new FixedDepositAccount();
        account.calculateInterest(100000,2,0);
        FreeDepositAccount freeDepositAccount = new FreeDepositAccount();
        freeDepositAccount.calculateInterest(100000,0,60);
    }
}
