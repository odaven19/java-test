package com.inditex.javatest.business.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {
	
	@Id
	@Column(name = "PRODUCT_ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
}
