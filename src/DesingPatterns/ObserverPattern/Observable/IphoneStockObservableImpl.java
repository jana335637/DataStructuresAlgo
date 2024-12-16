package DesingPatterns.ObserverPattern.Observable;

import DesingPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount;
    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(subscriber -> subscriber.update());
    }

    @Override
    public void setStockCount(int temp) {
        if(this.stockCount == 0) {
            notifySubscribers();
        }
        stockCount+=temp;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
