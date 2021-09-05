package com.meli.cupon;

import com.meli.cupon.entity.Item;
import com.meli.cupon.entity.Solution;
import com.meli.cupon.util.Knapsack;

public class Nivel1 {

	public static void main(String[] args) {
	    Item[] items = {new Item("MLA1", 1, 100.00f), 
		                new Item("MLA2", 2, 210.000f), 
						new Item("MLA3", 3, 260.00f), 
						new Item("MLA4", 4, 80.00f),
	                    new Item("MLA5", 5, 90.00f)};

	    
	    Solution solution = Knapsack.solve(items, 500*100);
	    System.out.println(solution.getSolution());
	}

}
