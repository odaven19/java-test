package com.inditex.javatest.business.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PriceFilterDTO {

	private LocalDateTime date;
	private Long productId;
	private Long brandId;
}
