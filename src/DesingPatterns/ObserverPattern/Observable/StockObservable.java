package DesingPatterns.ObserverPattern.Observable;

import DesingPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int temp);
    int getStockCount();

}
