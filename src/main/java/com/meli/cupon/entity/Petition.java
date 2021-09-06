package com.meli.cupon.entity;

public class Petition {
	
	private PetitionItem[] item_ids;
	
	private float amount;

	public PetitionItem[] getItem_ids() {
		return item_ids;
	}

	public void setItem_ids(PetitionItem[] item_ids) {
		this.item_ids = item_ids;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
