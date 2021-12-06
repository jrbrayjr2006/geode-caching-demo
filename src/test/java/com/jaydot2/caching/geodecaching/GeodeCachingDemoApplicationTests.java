package com.jaydot2.caching.geodecaching;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.boot.data.gemfire.security.ssl.environment.post-processor.enabled=false"
})
class GeodeCachingDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
