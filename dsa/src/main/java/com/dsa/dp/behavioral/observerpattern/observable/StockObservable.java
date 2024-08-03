package com.dsa.dp.behavioral.observerpattern.observable;

import com.dsa.dp.behavioral.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {
	void addObserver(NotificationAlertObserver observer);

	void removeObserver(NotificationAlertObserver observer);

	void notifyAllSubcribers();

	void setStock(int newStock);

	int getStock();

}
