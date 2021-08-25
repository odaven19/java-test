package com.inditex.javatest.business.service.mapper;

import com.inditex.javatest.business.jpa.model.PriceEntity;
import com.inditex.javatest.business.model.PriceDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-25T13:14:29+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class PriceMapperImpl implements PriceMapper {

    @Override
    public PriceDTO toDTO(PriceEntity ent) {
        if ( ent == null ) {
            return null;
        }

        PriceDTO priceDTO = new PriceDTO();

        priceDTO.setId( ent.getId() );
        priceDTO.setStartDate( ent.getStartDate() );
        priceDTO.setEndDate( ent.getEndDate() );
        priceDTO.setBrand( ent.getBrand() );
        priceDTO.setProduct( ent.getProduct() );
        priceDTO.setPriority( ent.getPriority() );
        priceDTO.setPrice( ent.getPrice() );
        priceDTO.setCurr( ent.getCurr() );

        return priceDTO;
    }

    @Override
    public List<PriceDTO> toDTO(List<PriceEntity> ent) {
        if ( ent == null ) {
            return null;
        }

        List<PriceDTO> list = new ArrayList<PriceDTO>( ent.size() );
        for ( PriceEntity priceEntity : ent ) {
            list.add( toDTO( priceEntity ) );
        }

        return list;
    }

    @Override
    public PriceEntity toEntity(PriceDTO ent) {
        if ( ent == null ) {
            return null;
        }

        PriceEntity priceEntity = new PriceEntity();

        priceEntity.setId( ent.getId() );
        priceEntity.setStartDate( ent.getStartDate() );
        priceEntity.setEndDate( ent.getEndDate() );
        priceEntity.setBrand( ent.getBrand() );
        priceEntity.setProduct( ent.getProduct() );
        priceEntity.setPriority( ent.getPriority() );
        priceEntity.setPrice( ent.getPrice() );
        priceEntity.setCurr( ent.getCurr() );

        return priceEntity;
    }
}
