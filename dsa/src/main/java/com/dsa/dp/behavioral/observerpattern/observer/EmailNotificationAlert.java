package com.dsa.dp.behavioral.observerpattern.observer;

import com.dsa.dp.behavioral.observerpattern.observable.StockObservable;

public class EmailNotificationAlert implements NotificationAlertObserver {
	private StockObservable observable;
	private String emailId;

	public EmailNotificationAlert(StockObservable observable, String emailId) {
		this.observable = observable;
		this.emailId = emailId;
	}

	@Override
	public void update() {
		sendMail(emailId, "New stock is available");
	}

	private void sendMail(String emailId, String string) {
		System.out.println("Email sent to " + emailId);
	}

}
