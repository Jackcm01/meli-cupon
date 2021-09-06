package com.meli.cupon.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.meli.cupon.entity.Solution;
import com.meli.cupon.entity.Item;
/**
 * 
 * @author juan Cruz 
 *
 */
public class Utils {

	private static final int DECIMAL_MULTIPLIER = 100;

	/**
	 * Algoritmo Knapsack o de la mochila, basado en el problema de optimización,
	 * donde se tiene un número de items, cada uno con un peso y un valor, donde 
	 * se desea maximizar los items que se pueden agregar en la mochila.
	 * <p> 
	 * Source:  <a href="https://ssaurel.medium.com/solving-the-knapsack-problem-in-java-c985c71a7e64"> Knapsack Problem</a>.
	 * <p>
	 * Este código ha sido alterado para la reutilización he implementación de este proyecto.
	 * 
	 * @param items
	 * @param capacity
	 * @return
	 */
//	public static Solution Knapsack(Item[] items, int capacity) {
//		int totalItems = items.length;
//		// we use a matrix to store the max value at each n-th item
//		int[][] matrix = new int[totalItems + 1][capacity + 1];
//
//		// first line is initialized to 0
//		for (int i = 0; i <= capacity; i++)
//			matrix[0][i] = 0;
//
//		// we iterate on items
//		for (int i = 1; i <= totalItems; i++) {
//			// we iterate on each capacity
//			for (int j = 0; j <= capacity; j++) {
//				if (items[i - 1].getCastCost() > j)
//					matrix[i][j] = matrix[i-1][j];
//				else
//					// we maximize value at this rank in the matrix
//					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j - items[i-1].getCastCost()] 
//							+ items[i-1].getOrder());
//			}
//		}
//
//		int res = matrix[totalItems][capacity];
//		int w = capacity;
//		List<Item> itemsSolution = new ArrayList<>();
//
//		for (int i = totalItems; i > 0  &&  res > 0; i--) {
//			if (res != matrix[i-1][w]) {
//				itemsSolution.add(items[i-1]);
//				// we remove items value and weight
//				res -= items[i-1].getOrder();
//				w -= items[i-1].getCastCost();
//			}
//		}
//
//		return new Solution(itemsSolution);
//	}
	
	public static Solution Knapsack(List<Item> items, Float amount) {
		int totalItems = items.size();
		int capacity = toKnapsackAmount(amount);
		// we use a matrix to store the max value at each n-th item
		int[][] matrix = new int[totalItems + 1][capacity + 1];

		// first line is initialized to 0
		for (int i = 0; i <= capacity; i++)
			matrix[0][i] = 0;

		// we iterate on items
		for (int i = 1; i <= totalItems; i++) {
			// we iterate on each capacity
			for (int j = 0; j <= capacity; j++) {
				if (items.get(i - 1).getCastCost() > j)
					matrix[i][j] = matrix[i-1][j];
				else
					// we maximize value at this rank in the matrix
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j - items.get(i-1).getCastCost()] 
							+ items.get(i-1).getOrder());
			}
		}

		int res = matrix[totalItems][capacity];
		int w = capacity;
		List<Item> itemsSolution = new ArrayList<>();

		for (int i = totalItems; i > 0  &&  res > 0; i--) {
			if (res != matrix[i-1][w]) {
				itemsSolution.add(items.get(i-1));
				// we remove items value and weight
				res -= items.get(i-1).getOrder();
				w -= items.get(i-1).getCastCost();
			}
		}

		return new Solution(itemsSolution);
	}
	
	public static List<Item> toItems(Map<String,Float> items) {
		List<Item> result = new ArrayList<>();
		
		items.forEach((k,v) -> result.add(new Item(k, v.intValue(), v)));
		
		return result;
	}
	
	private static int toKnapsackAmount(Float amount) {
		return amount.intValue()*DECIMAL_MULTIPLIER;
	}

}
