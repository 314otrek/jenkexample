package pl.nauka.jenkexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkexampleApplicationTests {



	@Test
	void testAdded(){
		JenkexampleApplication jenkexampleApplication = new JenkexampleApplication();
		assertEquals(10,jenkexampleApplication.added(5,5));
	}

}
