package com.meli.cupon.entity;

import java.util.List;

/**
 * @author jack-pc
 *
 */
public class Response {
	private List<String> items_ids;
	private float total;
	
	public Response(List<String> items_ids, float total) {
		this.items_ids = items_ids;
		this.total = total;		
	}
	
	
	public List<String> getItems_ids() {
		return items_ids;
	}

	public void setItems_ids(List<String> items_ids) {
		this.items_ids = items_ids;
	}

	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
}
