package com.meli.cupon.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * Entidad donde se almacenará la solución
 * @author jack
 *
 */
/**
 * @author jack-pc
 *
 */
public class Solution {
	
	// Items que se comprarán 
	private List<Item> items;

	private float costValue;
	private List<String> theItemsSolution;
	
	public Solution(List<Item> items) {
		this.items = items;
		generateSolution();
	}
	
	private void generateSolution(){
		List<String> theSolution = new ArrayList<>();
		float totalValue= 0l;
		if (items != null  &&  !items.isEmpty()){		
			for (int i = items.size()-1; i >= 0; i--) {
				theSolution.add(items.get(i).getId());
				totalValue += items.get(i).getCost();
			}
		}
		
		theItemsSolution = theSolution;
		costValue = totalValue;
	}
		
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public float getCostValue() {
		return costValue;
	}

	public void setCostValue(float costValue) {
		this.costValue = costValue;
	}

	public List<String> getTheItemsSolution() {
		return theItemsSolution;
	}

	public void setTheItemsSolution(List<String> theItemsSolution) {
		this.theItemsSolution = theItemsSolution;
	}
	
	

}
