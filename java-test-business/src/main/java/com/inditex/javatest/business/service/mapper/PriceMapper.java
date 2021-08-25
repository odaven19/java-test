package com.inditex.javatest.business.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.inditex.javatest.business.jpa.model.PriceEntity;
import com.inditex.javatest.business.model.PriceDTO;

@Mapper(componentModel = "spring")
public interface PriceMapper {
	
	PriceDTO toDTO(PriceEntity ent);
	List<PriceDTO> toDTO(List<PriceEntity> ent);
	
	PriceEntity toEntity(PriceDTO ent);
	
}
