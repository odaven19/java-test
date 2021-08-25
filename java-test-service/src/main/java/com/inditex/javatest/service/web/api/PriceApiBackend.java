package com.inditex.javatest.service.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.inditex.javatest.api.api.PriceApiDelegate;
import com.inditex.javatest.api.model.Price;
import com.inditex.javatest.api.model.PriceFilter;
import com.inditex.javatest.business.service.PriceService;
import com.inditex.javatest.service.web.mapper.PriceWebMapper;

public class PriceApiBackend implements PriceApiDelegate {
	
	@Autowired
	private PriceService service;
	
	protected PriceWebMapper getWebMapper() {
		return PriceWebMapper.INSTANCE;
	}
	
	@Override
	public ResponseEntity<Price> getPriceByFilter(final PriceFilter priceFilter) {
		return ResponseEntity.ok(getWebMapper().toAPI(service.getPriceByFilter(getWebMapper().filterToDTO(priceFilter))));
	}
}
