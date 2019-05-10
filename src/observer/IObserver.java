package observer;

/**
 * 订阅者Subscribe(又观察者Observer)
 */
public interface IObserver {
    void update(Object... set);
}
