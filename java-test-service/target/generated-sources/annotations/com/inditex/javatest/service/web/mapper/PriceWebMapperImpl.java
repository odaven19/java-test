package com.inditex.javatest.service.web.mapper;

import com.inditex.javatest.api.model.Brand;
import com.inditex.javatest.api.model.Price;
import com.inditex.javatest.api.model.PriceFilter;
import com.inditex.javatest.api.model.Product;
import com.inditex.javatest.business.jpa.model.BrandEntity;
import com.inditex.javatest.business.jpa.model.ProductEntity;
import com.inditex.javatest.business.model.PriceDTO;
import com.inditex.javatest.business.model.PriceFilterDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-25T13:14:31+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class PriceWebMapperImpl implements PriceWebMapper {

    @Override
    public PriceFilterDTO filterToDTO(PriceFilter obj) {
        if ( obj == null ) {
            return null;
        }

        PriceFilterDTO priceFilterDTO = new PriceFilterDTO();

        priceFilterDTO.setDate( toLocalDateTime( obj.getDate() ) );
        priceFilterDTO.setProductId( obj.getProductId() );
        priceFilterDTO.setBrandId( obj.getBrandId() );

        return priceFilterDTO;
    }

    @Override
    public Price toAPI(PriceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Price price = new Price();

        price.setId( dto.getId() );
        price.setBrand( brandEntityToBrand( dto.getBrand() ) );
        price.setProduct( productEntityToProduct( dto.getProduct() ) );
        price.setStartDate( toDate( dto.getStartDate() ) );
        price.setEndDate( toDate( dto.getEndDate() ) );
        price.setPrice( dto.getPrice() );
        price.setCurr( dto.getCurr() );

        return price;
    }

    protected Brand brandEntityToBrand(BrandEntity brandEntity) {
        if ( brandEntity == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setId( brandEntity.getId() );
        brand.setName( brandEntity.getName() );

        return brand;
    }

    protected Product productEntityToProduct(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productEntity.getId() );
        product.setName( productEntity.getName() );
        product.setDescription( productEntity.getDescription() );

        return product;
    }
}
