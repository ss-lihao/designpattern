package adapter.charge;

public class Computer implements IComputer{
    @Override
    public void usbInterface() {
        System.out.println("连接电脑USB接口");
    }
}
