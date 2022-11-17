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

	@Test
	void testSubstract(){
		JenkexampleApplication jenkexampleApplication = new JenkexampleApplication();
		assertEquals(3,jenkexampleApplication.substract(5,2));
	}
	@Test
	void testSubstract1(){
		JenkexampleApplication jenkexampleApplication = new JenkexampleApplication();
		assertEquals(3,jenkexampleApplication.substract(5,3));
	}

}
