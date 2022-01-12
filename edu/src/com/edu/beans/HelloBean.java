package com.edu.beans;

public class HelloBean {

	private String name;
	private String number;

	/* 
	 * 자바빈즈 구현시 반드시 인자값이 없는 기본 생성자가 있어야 한다.
	 */
	public HelloBean() {
		this.name = "No Name";
		this.number = "No Number";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
