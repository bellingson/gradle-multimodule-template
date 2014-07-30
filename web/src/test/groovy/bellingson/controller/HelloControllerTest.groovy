package bellingson.controller

import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mock.web.MockHttpServletRequest
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.ui.ExtendedModelMap
import org.springframework.ui.Model

import static org.junit.Assert.*
import org.junit.Test


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=[ "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml" ])
class HelloControllerTest {

    @Autowired
    HelloController controller

    MockHttpServletRequest request
    MockHttpServletResponse response
    Model model
    Map params

    @Before void setUp() {

        request = new MockHttpServletRequest()
        response = new MockHttpServletResponse()
        model = new ExtendedModelMap()
        params = [:]

    }

    @Test void test_hello() {

        controller.hello(model, request)

        assertTrue model.hello != null


    }



}
