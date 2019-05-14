package observer;

import java.util.HashMap;
import java.util.Map;

/**
 * 发布者Subject（又被观察者Observable）的抽象类
 * 包含对观察者的管理和发布时通知观察者等行为
 */
public interface ISubject {
    Map<String, IObserver> observers = new HashMap<>();
    void addObserver(String id,IObserver observer);
    void notifyObserver(String id,Object... set);
    void delObserver(String id);
}
