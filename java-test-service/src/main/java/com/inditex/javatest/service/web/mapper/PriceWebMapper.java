package com.inditex.javatest.service.web.mapper;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Objects;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.inditex.javatest.api.model.Price;
import com.inditex.javatest.api.model.PriceFilter;
import com.inditex.javatest.business.model.PriceDTO;
import com.inditex.javatest.business.model.PriceFilterDTO;

@Mapper(componentModel = "spring")
public interface PriceWebMapper {

	public static final PriceWebMapper INSTANCE = Mappers.getMapper(PriceWebMapper.class);

	PriceFilterDTO filterToDTO(PriceFilter obj);

	Price toAPI(PriceDTO dto);
	
	default LocalDateTime toLocalDateTime(OffsetDateTime odt) {
		return Objects.isNull(odt) ? null
				: odt.toZonedDateTime().withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	default OffsetDateTime toDate(LocalDateTime ldt) {
		return Objects.isNull(ldt) ? null : ldt.atZone(ZoneId.systemDefault()).toOffsetDateTime();
	}
}
