package com.dsa.dp.creational.singleton;

public class SingleTon {

	private static SingleTon singleTon;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (singleTon == null) {
			synchronized (SingleTon.class) {
				if (singleTon == null) {
					singleTon = new SingleTon();
				}
			}
		}
		return singleTon;
	}
}
