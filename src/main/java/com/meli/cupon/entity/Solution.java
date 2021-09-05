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
	// Valor maximo
	private int value;
	
	public Solution(List<Item> items, int value) {
		this.items = items;
		this.value = value;
	}
	
	public void display() {
		if (items != null  &&  !items.isEmpty()){		
			for (int i = items.size()-1; i >= 0; i--) {
				System.out.println(items.get(i).getId());
			}
		}
	}
	
	public List<String> getSolution(){
		List<String> theSolution = new ArrayList<>();
		if (items != null  &&  !items.isEmpty()){		
			for (int i = items.size()-1; i >= 0; i--) {
				theSolution.add(items.get(i).getId());
			}
		}
		return theSolution;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
