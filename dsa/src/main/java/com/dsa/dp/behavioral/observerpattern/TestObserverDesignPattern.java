package com.dsa.dp.behavioral.observerpattern;

import com.dsa.dp.behavioral.observerpattern.observable.IPhoneObservable;
import com.dsa.dp.behavioral.observerpattern.observable.StockObservable;
import com.dsa.dp.behavioral.observerpattern.observer.EmailNotificationAlert;
import com.dsa.dp.behavioral.observerpattern.observer.MobileNotificationAlert;

public class TestObserverDesignPattern {
	public static void main(String[] args) {
		EmailNotificationAlert alert = new EmailNotificationAlert(new IPhoneObservable(), "doppa@gmail.com");
		EmailNotificationAlert alert1 = new EmailNotificationAlert(new IPhoneObservable(), "srinivas@gmail.com");
		MobileNotificationAlert alert2 = new MobileNotificationAlert(new IPhoneObservable(), "9234567980");

		StockObservable observable = new IPhoneObservable();
		observable.addObserver(alert);
		observable.addObserver(alert1);
		observable.addObserver(alert2);
		observable.setStock(10);
		// observable.setStock(-10);
		// observable.setStock(10);
	}
}
