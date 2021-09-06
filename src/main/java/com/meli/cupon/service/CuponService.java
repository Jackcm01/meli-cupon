package com.meli.cupon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meli.cupon.entity.Item;
import com.meli.cupon.entity.Petition;
import com.meli.cupon.entity.Response;
import com.meli.cupon.util.Utils;

@Service
public class CuponService {
	
	public Response getCupon(Petition petition) {
		
		List<Item> items = Utils.toItems(petition.getItem_ids());
		return Utils.toResponse(Utils.Knapsack(items, petition.getAmount()));
	}
}
