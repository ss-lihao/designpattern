package observer;

/**
 * 发布者Subject（又被观察者Observable）的实现类
 */
public class Subject implements ISubject {
    @Override
    public void addObserver(String id, IObserver observer) {
        observers.put(id, observer);
    }
    @Override
    public void notifyObserver(String id, Object... set) {
        if (observers.containsKey(id)) {
            IObserver observer = observers.get(id);
            if (null != observer) {
                observer.update(set);
            }
        }
    }
    @Override
    public void delObserver(String id) {
        if (observers.containsKey(id)) {
            observers.remove(id);
        }
    }

}
