package com.inditex.javatest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.inditex.javatest.api.api.PriceApiController;
import com.inditex.javatest.api.model.Price;
import com.inditex.javatest.api.model.PriceFilter;
import com.inditex.javatest.business.service.impl.PriceServiceImpl;
import com.inditex.javatest.service.web.api.PriceApiBackend;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = { PriceApiController.class,
		PriceApiBackend.class, PriceServiceImpl.class })
@RunWith(SpringRunner.class)
public class PriceITTest extends BaseITTest {

	@Test
	@Sql("/data/test-data.sql")
	public void testPrice() throws Exception {
		Price res;
		PriceFilter filter = new PriceFilter();
		filter.setBrandId(1L);
		filter.setProductId(35455L);
		
		// 14-06-2020 at 10:00
		filter.setDate(OffsetDateTime.of(2020, 6, 14, 10, 0, 0, 0, ZoneOffset.ofHours(2)));
		res = requestPrice(filter);
		assertEquals(35.50, res.getPrice());
		
		// 14-06-2020 at 16:00
		filter.setDate(OffsetDateTime.of(2020, 6, 14, 16, 0, 0, 0, ZoneOffset.ofHours(2)));
		res = requestPrice(filter);
		assertEquals(25.45, res.getPrice());
		
		// 14-06-2020 at 21:00
		filter.setDate(OffsetDateTime.of(2020, 6, 14, 21, 0, 0, 0, ZoneOffset.ofHours(2)));
		res = requestPrice(filter);
		assertEquals(35.50, res.getPrice());
		
		// 15-06-2020 at 10:00
		filter.setDate(OffsetDateTime.of(2020, 6, 15, 10, 0, 0, 0, ZoneOffset.ofHours(2)));
		res = requestPrice(filter);
		assertEquals(30.50, res.getPrice());
		
		// 16-06-2020 at 21:00
		filter.setDate(OffsetDateTime.of(2020, 6, 16, 21, 0, 0, 0, ZoneOffset.ofHours(2)));
		res = requestPrice(filter);
		assertEquals(38.95, res.getPrice());
	}

	private Price requestPrice(PriceFilter filter) throws Exception {
		String json = mvc
				.perform(MockMvcRequestBuilders.post("/price").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON).content(asJsonString(filter)))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();

		return jsonMapper.readValue(json, Price.class);
	}


}
