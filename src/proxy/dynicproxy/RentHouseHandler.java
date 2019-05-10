package proxy.dynicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentHouseHandler implements InvocationHandler {
    //    IHouseOwner target;
    //target不能是抽象类
    Object target;
    TempCompany tempCompany;

    public RentHouseHandler(Object target,
                            TempCompany tempCompany) {
        this.target = target;
        this.tempCompany = tempCompany;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        tempCompany.checkReal();
        Object invoke = method.invoke(target, args);
        tempCompany.rentProtect();
        return invoke;
    }
}
