package com.meli.cupon.entity;
/**
 * un Item
 * @author jack-pc
 *
 *
 */
public class Item {
	
	private String id;
	private int order;
	private int castCost;
	private Float cost;
	
	/**
	 * @param id
	 * @param order
	 * @param cost
	 */
	public Item(String id, int order, Float cost) {
		this.id = id;
		this.order = order;
		this.cost = cost;
		//knapsack solo funciona con enteros
		this.castCost = cost.intValue()*100;
	}
	
	@Override
	public String toString() {
		return "[id= "+id + ", cost = " + castCost + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getCastCost() {
		return castCost;
	}

	public void setCastCost(int cost) {
		this.castCost = cost;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

}
