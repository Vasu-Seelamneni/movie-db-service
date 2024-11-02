package com.msp.movie.db.moviedbservice;

import com.msp.movie.db.controller.GenreController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class MovieDbServiceApplicationTests {

	@Autowired
	private GenreController genreController;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void testGenreController() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/api/genres/all"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("application/json"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.[0].name").value("Action"));

		/*mockMvc.perform(MockMvcRequestBuilders.get("/api/genres/find/1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("application/json"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.[0].name").value("Action"));

		mockMvc.perform(MockMvcRequestBuilders.get("/api/genres/save"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("application/json"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.[0].name").value("Thriller"));

		mockMvc.perform(MockMvcRequestBuilders.get("/api/genres/delete/1"))
				.andExpect(MockMvcResultMatchers.status().isOk());*/

	}

}
