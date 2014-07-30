package bellingson.model

import bellingson.model.Hello
import org.junit.*

class HelloTest {
	
	@Test void test_hello() {

		Hello hello = new Hello()

		hello.hello()

	}


}