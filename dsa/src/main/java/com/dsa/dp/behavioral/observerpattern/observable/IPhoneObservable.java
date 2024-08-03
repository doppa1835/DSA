package com.dsa.dp.behavioral.observerpattern.observable;

import java.util.ArrayList;
import java.util.List;

import com.dsa.dp.behavioral.observerpattern.observer.NotificationAlertObserver;

public class IPhoneObservable implements StockObservable {
	private List<NotificationAlertObserver> observers = new ArrayList<>();
	int stock = 0;

	@Override
	public void addObserver(NotificationAlertObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(NotificationAlertObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllSubcribers() {
		for (NotificationAlertObserver notificationAlertObserver : observers) {
			notificationAlertObserver.update();
		}
	}

	@Override
	public void setStock(int newStock) {
		if (stock == 0) {
			notifyAllSubcribers();
		}
		stock = stock + newStock;
	}

	@Override
	public int getStock() {
		return stock;
	}

}
