package com.personalstudy.msscbrewery;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.personalstudy.msscbrewery.services.BeerService;
import com.personalstudy.msscbrewery.web.model.BeerDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class MsscBreweryApplicationTests {

	@MockBean
	BeerService beerService;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	MockMvc mockMvc;

	BeerDto validBeer;
	@BeforeEach
	public void setUp() {
		validBeer = BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("Beer1")
				.beerStyle("PALE_ALE")
				.upc(123456789L)
				.build();
	}

	@Test
	void getBeer() throws Exception {
		given(beerService.getBeerById(any(UUID.class))).willReturn(validBeer);

		mockMvc.perform(get("/api/v1/beer/" + validBeer.getId().toString()).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.id").value(validBeer.getId().toString()))
				.andExpect(jsonPath("$.beerName").value(validBeer.getBeerName()));


	}

}
