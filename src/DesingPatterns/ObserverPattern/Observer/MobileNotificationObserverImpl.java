package DesingPatterns.ObserverPattern.Observer;

import DesingPatterns.ObserverPattern.Observable.StockObservable;

public class MobileNotificationObserverImpl implements NotificationAlertObserver{

    String mobileNo;
    StockObservable stockObservable;

    public MobileNotificationObserverImpl(String mobileNo, StockObservable stockObservable){
        this.mobileNo = mobileNo;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Sending sms to "+ mobileNo);
    }
}
