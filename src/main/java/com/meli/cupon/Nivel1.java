package com.meli.cupon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.meli.cupon.entity.Item;
import com.meli.cupon.entity.Solution;
import com.meli.cupon.util.Utils;

public class Nivel1 {

	public static void main(String[] args) {
//	    Item[] items = {new Item("MLA1", 1, 100.00f), 
//		                new Item("MLA2", 2, 210.000f), 
//						new Item("MLA3", 3, 260.00f), 
//						new Item("MLA4", 4, 80.00f),
//	                    new Item("MLA5", 5, 90.00f)};
//	                    new Item("MLA6", 6, 70.00f),
//	                    new Item("MLA7", 7, 3000.00f)};

	    List<Item> theItems = new ArrayList<>();
	    theItems.add(new Item("MLA1", 1, 100.00f));
	    theItems.add(new Item("MLA2", 2, 210.000f));
	    theItems.add(new Item("MLA3", 3, 260.00f));
	    theItems.add(new Item("MLA4", 4, 80.00f));
	    theItems.add(new Item("MLA5", 5, 90.00f));
	    
	    Solution solution = Utils.Knapsack(theItems, 500f);
	    
	    System.out.println(solution.getTheItemsSolution());
	    System.out.println(solution.getCostValue());
	    
	    Map<String, Float> items = new HashMap<>();
	    items.put("MLA1", 100.00f);
	    items.put("MLA2", 210.00f);
	    items.put("MLA3", 260.00f);
	    items.put("MLA4", 80.00f);
	    items.put("MLA5", 90.00f);
	    
	    List<String> result = calculate(items, 500f);
	    System.out.println(result.toString());
	}
	
	static List<String> calculate(Map<String, Float> items, Float amount){
		Solution solution = Utils.Knapsack(Utils.toItems(items),amount);
		return solution.getTheItemsSolution();
	}

}
