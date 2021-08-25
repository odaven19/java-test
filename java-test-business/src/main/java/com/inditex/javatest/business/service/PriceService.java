package com.inditex.javatest.business.service;

import com.inditex.javatest.business.model.PriceDTO;
import com.inditex.javatest.business.model.PriceFilterDTO;

public interface PriceService {

	PriceDTO getPriceByFilter(PriceFilterDTO filter);

}
