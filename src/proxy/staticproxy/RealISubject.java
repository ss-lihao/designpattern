package proxy.staticproxy;

public class RealISubject implements ISubject {
    @Override
    public void action() {
        System.out.println("do Something...");
    }
}
