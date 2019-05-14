package adapter.charge;

public class MobileDeviceAdapterAb extends AbBaseMobileDevice {
    IDevice iDevice;

    public MobileDeviceAdapterAb(IDevice iDevice) {
        this.iDevice = iDevice;
    }

    @Override
    protected void mobileUsbInterface() {
        System.out.println("连接手机USB");
        iDevice.usbInterface();
    }

    @Override
    void power() {
        mobileUsbInterface();
        System.out.println("手机充电");
    }
}
