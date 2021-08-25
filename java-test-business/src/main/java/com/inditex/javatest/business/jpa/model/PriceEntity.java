package com.inditex.javatest.business.jpa.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRICES")
public class PriceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRICE_ID")
	private Long id;
	
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	
	@ManyToOne
	@JoinColumn(name = "BRAND_ID", referencedColumnName = "BRAND_ID")
	private BrandEntity brand;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
	private ProductEntity product;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	private String curr;

}
