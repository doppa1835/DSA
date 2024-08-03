package com.dsa.dp.behavioral.observerpattern.observer;

import com.dsa.dp.behavioral.observerpattern.observable.StockObservable;

public class MobileNotificationAlert implements NotificationAlertObserver {
	private StockObservable observable;
	private String phoneNumber;

	public MobileNotificationAlert(StockObservable observable, String phoneNumber) {
		this.observable = observable;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void update() {
		senMessage(phoneNumber, "New Stock is available");
	}

	private void senMessage(String phoneNumber, String string) {
		System.out.println("SMS sent to " + phoneNumber);
	}

}
