package adapter.charge;

public class DeviceAdapter extends BaseDevice{
    IComputer iComputer;

    public DeviceAdapter(IComputer iComputer) {
        this.iComputer = iComputer;
    }

    @Override
    void charge() {
        usbInterface();
        System.out.println("--充电--");

    }

    @Override
    void translateData() {
        System.out.println("--传输数据--");
    }
}
