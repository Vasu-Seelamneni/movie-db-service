package com.msp.movie.db.moviedbservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class MovieDbServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@GetMapping("/test")
	public String test() {
		return "Hello, World!";
	}

}
