package DesingPatterns.ObserverPattern;

import DesingPatterns.ObserverPattern.Observable.IphoneStockObservableImpl;
import DesingPatterns.ObserverPattern.Observer.EmailNotificationObserverImpl;
import DesingPatterns.ObserverPattern.Observer.MobileNotificationObserverImpl;

public class Store {

    public static void main(String[] args) {

        IphoneStockObservableImpl iphoneStockObservable = new IphoneStockObservableImpl();

        EmailNotificationObserverImpl email1NotificationObserver = new EmailNotificationObserverImpl("xyz@gmail.com", iphoneStockObservable);
        EmailNotificationObserverImpl email2NotificationObserver = new EmailNotificationObserverImpl("abc@gmail.com", iphoneStockObservable);

        MobileNotificationObserverImpl mobileNotificationObserver = new MobileNotificationObserverImpl("8142937799", iphoneStockObservable);


        iphoneStockObservable.add(email1NotificationObserver);
        iphoneStockObservable.add(email2NotificationObserver);
        iphoneStockObservable.add(mobileNotificationObserver);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(20);
        System.out.println( 96 | (96 >>> 16 ) );
    }


}
