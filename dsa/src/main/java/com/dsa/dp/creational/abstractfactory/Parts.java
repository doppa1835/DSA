package com.dsa.dp.creational.abstractfactory;

public class Parts {
	@Override
	public String toString() {
		return "Parts [specification=" + specification + "]";
	}

	private String specification;

	public Parts(String specification) {
		this.specification = specification;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

}
