package com.inditex.javatest.business.service.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inditex.javatest.business.jpa.repository.PriceRepository;
import com.inditex.javatest.business.model.PriceDTO;
import com.inditex.javatest.business.model.PriceFilterDTO;
import com.inditex.javatest.business.service.PriceService;
import com.inditex.javatest.business.service.mapper.PriceMapper;

public class PriceServiceImpl implements PriceService {
	
	@Autowired
	PriceRepository repository;
	
	@Autowired
	PriceMapper mapper;
	
	@Override
	public PriceDTO getPriceByFilter(PriceFilterDTO filter) {
		List<PriceDTO> prices = mapper.toDTO(repository.getByFilter(filter.getDate(), filter.getProductId(), filter.getBrandId()));
		return prices.stream().sorted(Comparator.comparing(PriceDTO::getPriority).reversed()).findFirst().orElse(null);
	}

}
