package proxy.dynicproxy;


import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class ClientTest {
    public static void main(String[] args) {
        IHouseOwner houseOwner = new HouseOwner();
        TempCompany tempCompany = new TempCompany();
        RentHouseHandler rentHouseHandler = new RentHouseHandler(houseOwner,tempCompany);
        //IHouseOwner not HouseOwner
        IHouseOwner proxy = (IHouseOwner) Proxy.newProxyInstance(HouseOwner.class.getClassLoader(),new Class[]{IHouseOwner.class},rentHouseHandler);
        proxy.rent();
    }
}
