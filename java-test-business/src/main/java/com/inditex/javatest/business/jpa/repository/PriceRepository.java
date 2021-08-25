package com.inditex.javatest.business.jpa.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.inditex.javatest.business.jpa.model.PriceEntity;

public interface PriceRepository extends CrudRepository<PriceEntity, Long> {

	@Query("SELECT c FROM PriceEntity c WHERE c.product.id = :productId AND c.brand.id = :brandId AND :date BETWEEN c.startDate AND c.endDate")
	List<PriceEntity> getByFilter(LocalDateTime date, Long productId, Long brandId);
}
