package com.gareth.spring.springcore.assignment;

public class ShoppingCart {

	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "hoppingCart [item=" + item + "]";
	}
}
