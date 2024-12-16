package DesingPatterns.ObserverPattern.Observer;

import DesingPatterns.ObserverPattern.Observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailNotificationObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending email to " + emailId);
    }
}
