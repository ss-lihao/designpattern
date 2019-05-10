package adapter.productcar;


public class ClientTest {
    /**
     * 适配器模式
     * @param args
     */
    public static void main(String[] args) {
        CarProduction production = new CarProduction();
        CarAdapter adapter = new CarAdapter(production);
        adapter.product();
    }
}
