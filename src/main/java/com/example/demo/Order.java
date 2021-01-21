package com.example.demo;

enum STATE{
	CREATED, CANCELLED, COMPLETE
}
public class Order {
	Integer id;
	float price;
	String item;
	@Override
	public String toString() {
		return this.price+", "+this.item;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public STATE getState() {
		return state;
	}
	public void setState(STATE state) {
		this.state = state;
	}
	STATE state;
}
