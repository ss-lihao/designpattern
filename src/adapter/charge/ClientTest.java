package adapter.charge;




public class ClientTest {
    /**
     * 适配器模式
     * @param args
     */
    public static void main(String[] args) {
        IDevice device = new Computer();
        MobileDeviceAdapterAb adapter = new MobileDeviceAdapterAb(device);
        adapter.power();
    }
}
