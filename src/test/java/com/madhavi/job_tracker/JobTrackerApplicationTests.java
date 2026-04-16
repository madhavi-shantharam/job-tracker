package com.madhavi.job_tracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class JobTrackerApplicationTests {

	@Test
	void contextLoads() {
		// Verifies the Spring context starts successfully
		// Uses H2 in-memory DB via src/test/resources/application.properties
	}

}
