package com.meli.cupon.util;

import java.util.ArrayList;
import java.util.List;

import com.meli.cupon.entity.Solution;
import com.meli.cupon.entity.Item;
/**
 * 
 * Algoritmo Knapsack o de la mochila, basado en el problema de optimización,
 * donde se tiene un número de items, cada uno con un peso y un valor, donde 
 * se desea maximizar los items que se pueden agregar en la mochila.
 * <p> 
 * Source:  <a href="https://ssaurel.medium.com/solving-the-knapsack-problem-in-java-c985c71a7e64"> Knapsack Problem</a>.
 * <p>
 * Este código ha sido alterado para la reutilización he implementación de este proyecto.
 * 
 * @author juan Cruz (Editor)
 *
 */
public class Knapsack {


//	private Item[] items;
//
//	private int capacity;
//
//	public Knapsack(Item[] items, int capacity) {
//		this.items = items;
//		this.capacity = capacity*100;
//	}
//
//	public void display() {
//		if (items != null  &&  items.length > 0) {
//			System.out.println("Knapsack problem");
//			System.out.println("Capacity : " + capacity);
//			System.out.println("Items :");
//
//			for (Item item : items) {
//				System.out.println("- " + item.toString());
//			}
//		}
//	}

	
	public static Solution solve(Item[] items, int capacity) {
		int totalItems = items.length;
		// we use a matrix to store the max value at each n-th item
		int[][] matrix = new int[totalItems + 1][capacity + 1];

		// first line is initialized to 0
		for (int i = 0; i <= capacity; i++)
			matrix[0][i] = 0;

		// we iterate on items
		for (int i = 1; i <= totalItems; i++) {
			// we iterate on each capacity
			for (int j = 0; j <= capacity; j++) {
				if (items[i - 1].getCastCost() > j)
					matrix[i][j] = matrix[i-1][j];
				else
					// we maximize value at this rank in the matrix
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j - items[i-1].getCastCost()] 
							+ items[i-1].getOrder());
			}
		}

		int res = matrix[totalItems][capacity];
		int w = capacity;
		List<Item> itemsSolution = new ArrayList<>();

		for (int i = totalItems; i > 0  &&  res > 0; i--) {
			if (res != matrix[i-1][w]) {
				itemsSolution.add(items[i-1]);
				// we remove items value and weight
				res -= items[i-1].getOrder();
				w -= items[i-1].getCastCost();
			}
		}

		return new Solution(itemsSolution, matrix[totalItems][capacity]);
	}

//	public Solution solve2() {
//		int NB_ITEMS = items.length;
//		// we use a matrix to store the max value at each n-th item
//		int[][] matrix = new int[NB_ITEMS + 1][NB_ITEMS + 1];
//
//		// first line is initialized to 0
//		for (int i = 0; i <= capacity; i++)
//			matrix[0][i] = 0;
//
//		// we iterate on items
//		for (int i = 1; i <= NB_ITEMS; i++) {
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
//		int res = matrix[NB_ITEMS][capacity];
//		int w = capacity;
//		List<Item> itemsSolution = new ArrayList<>();
//
//		for (int i = NB_ITEMS; i > 0  &&  res > 0; i--) {
//			if (res != matrix[i-1][w]) {
//				itemsSolution.add(items[i-1]);
//				// we remove items value and weight
//				res -= items[i-1].getOrder();
//				w -= items[i-1].getCastCost();
//			}
//		}
//
//		return new Solution(itemsSolution, matrix[NB_ITEMS][capacity]);
//	}

}
