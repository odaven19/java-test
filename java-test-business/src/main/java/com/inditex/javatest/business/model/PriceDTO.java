package com.inditex.javatest.business.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.inditex.javatest.business.jpa.model.BrandEntity;
import com.inditex.javatest.business.jpa.model.ProductEntity;

import lombok.Data;

@Data
public class PriceDTO {
	
	@Id
	@Column(name = "PRICE_ID")
	private Long id;
	
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	
	@ManyToOne
	@JoinColumn(name = "BRAND_ID", referencedColumnName = "ID")
	private BrandEntity brand;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
	private ProductEntity product;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	private String curr;

}
